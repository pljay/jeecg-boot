<template>
  <a-card class="j-address-list-right-card-box" :loading="cardLoading" :bordered="false">
    <div class="table-page-search-wrapper">
      <a-form layout="inline">
        <a-row :gutter="10">

          <a-col :md="6" :sm="12">
            <a-form-item label="国家" style="margin-left:8px">
              <a-input placeholder="请输入国家" v-model="queryParam.country"></a-input>
            </a-form-item>
          </a-col>


          <a-col :md="6" :sm="12">
            <a-form-item label="省/州" style="margin-left:8px">
              <a-input placeholder="请输入省/州" v-model="queryParam.state"></a-input>
            </a-form-item>
          </a-col>

          <a-col :md="6" :sm="12">
            <a-form-item label="城市" style="margin-left:8px">
              <a-input placeholder="请输入城市" v-model="queryParam.city"></a-input>
            </a-form-item>
          </a-col>

          <a-col :md="6" :sm="12">
            <a-form-item label="邮编" style="margin-left:8px">
              <a-input placeholder="请输入邮编" v-model="queryParam.postcode"></a-input>
            </a-form-item>
          </a-col>

          <span style="float: left;overflow: hidden;" class="table-page-search-submitButtons">
            <a-col :md="6" :sm="24">
             <a-button type="primary" @click="searchQuery" icon="search" style="margin-left: 18px">查询</a-button>
              <a-button type="primary" @click="searchReset" icon="reload" style="margin-left: 8px">重置</a-button>
            </a-col>
          </span>
        </a-row>
      </a-form>
    </div>
    <!--按钮区域-->
    <div class="table-operator">
      <a-button @click="handleAdd" type="primary" icon="plus">新增</a-button>
      <a-button type="primary" icon="download" @click="handleExportXls('邮编表')">导出</a-button>
      <a-upload name="file" :showUploadList="true" :multiple="false" :headers="tokenHeader" :action="importExcelUrl" @change="handleImportExcel">
        <a-button type="primary" icon="import">导入</a-button>
      </a-upload>
      <a-dropdown v-if="selectedRowKeys.length > 0">
        <a-menu slot="overlay">
          <a-menu-item key="1" @click="batchDel"><a-icon type="delete"/>删除</a-menu-item>
        </a-menu>
        <a-button style="margin-left: 8px"> 批量操作 <a-icon type="down" /></a-button>
      </a-dropdown>
    </div>
    <!-- table区域-begin -->
    <div>
      <div class="ant-alert ant-alert-info" style="margin-bottom: 16px;">
        <i class="anticon anticon-info-circle ant-alert-icon"></i> 已选择 <a style="font-weight: 600">{{ selectedRowKeys.length }}</a>项
        <a style="margin-left: 24px" @click="onClearSelected">清空</a>
      </div>
      <a-table
        ref="table"
        size="middle"
        bordered
        rowKey="id"
        :pagination="ipagination"
        :columns="columns"
        :dataSource="dataSource"
        :loading="loading"
        :rowSelection="{selectedRowKeys: selectedRowKeys, onChange: onSelectChange}"
        @change="handleTableChange">

        <span slot="action" slot-scope="text, record">
          <a @click="handleEdit(record)">编辑</a>
          <a-divider type="vertical" />
          <a-dropdown>
            <a class="ant-dropdown-link">更多 <a-icon type="down" /></a>
            <a-menu slot="overlay">
              <a-menu-item>
                <a-popconfirm title="确定删除吗?" @confirm="() => handleDelete(record.id)">
                  <a>删除</a>
                </a-popconfirm>
              </a-menu-item>
            </a-menu>
          </a-dropdown>
        </span>
      </a-table>
    </div>
    <erpPostcode-modal ref="modalForm" @ok="modalFormOk"></erpPostcode-modal>
  </a-card>
</template>

<script>
  import { getAction } from '@/api/manage'
  import { JeecgListMixin } from '@/mixins/JeecgListMixin'
  import ErpPostcodeModal from './ErpPostcodeModal'

  export default {
    name: 'PostcodeListRight',
    mixins: [JeecgListMixin],
    components: {ErpPostcodeModal},
    props: ['value'],
    data() {
      return {
        description: '区域信息',
        cardLoading: true,
        positionInfo: {},
        isorter:null,
        columns: [
          {
            title: '#',
            key: 'rowIndex',
            dataIndex: '',
            width: 60,
            align: 'center',
            customRender: (t, r, i) => parseInt(i) + 1
          },
          {
            title: '国家',
            width: '100',
            align: 'center',
            dataIndex: 'country'
          },
          {
            title: '省/州',
            width: '120',
            align: 'center',
            dataIndex: 'state'
          },
          {
            title: '城市',
            width: '140',
            align: 'center',
            dataIndex: 'city'
          },
          {
            title: '缩写',
            width: '80',
            align: 'center',
            dataIndex: 'abbr',
          },
          {
            title: '邮编',
            width: '100',
            align: 'center',
            dataIndex: 'postcode'
          },
          // {
          //   title: '手机号',
          //   width: '12%',
          //   align: 'center',
          //   dataIndex: 'phone'
          // },
          {
            title: '区域类型',
            width: '15%',
            align: 'center',
            dataIndex: 'areaType_dictText'
          },
          {
            title: '操作',
            dataIndex: 'action',
            align: "center",
            fixed: "right",
            width: 115,
            scopedSlots: {customRender: 'action'},
          }
        ],
        url: {
          list: '/erp/postcode/list',
          listByPosition: '/sys/position/list',
          importExcelUrl:'/erp/postcode/importExcel',
          delete: "/erp/postcode/delete",
          deleteBatch: "/erp/postcode/deleteBatch",
        },
        dictOptions: {},
      }
    },
    watch: {
      value: {
        immediate: true,
        handler(pid) {
          this.dataSource = []
          this.loadData(1, pid)
        }
      },
    },
    created() {
    },
    computed: {
      importExcelUrl: function () {
        return `${window._CONFIG['domianURL']}/${this.url.importExcelUrl}`;
      }
    },
    methods: {
      loadData(pageNum, pid) {
        this.loading = true
        if (pageNum === 1) {
          this.ipagination.current = 1
        }
        // update-begin- --- author:wangshuai ------ date:20200102 ---- for:传过来的部门编码为空全查
        if (!pid) {
          getAction(this.url.list, {
            ...this.getQueryParams()
          }).then((res) => {
            if (res.success) {
              this.dataSource = res.result.records
              this.ipagination.total = res.result.total
            }
          }).finally(() => {
            this.loading = false
            this.cardLoading = false
          })
          // update-end- --- author:wangshuai ------ date:20200102 ---- for:传过来的部门编码为空全查
        }else{
          //加载数据 若传入参数1则加载第一页的内容
          getAction(this.url.list, {
            pid,
            ...this.getQueryParams()
          }).then((res) => {
            if (res.success) {
              this.dataSource = res.result.records
              this.ipagination.total = res.result.total
            }
          }).finally(() => {
            this.loading = false
            this.cardLoading = false
          })
        }
      },

      searchQuery() {
        this.loadData(1, this.value)
      },
      searchReset() {
        this.queryParam = {}
        this.loadData(1, this.value)
      },

      handleTableChange(pagination, filters, sorter) {
        console.log()
        if (Object.keys(sorter).length > 0) {
          this.isorter.column = sorter.field
          this.isorter.order = 'ascend' === sorter.order ? 'asc' : 'desc'
        }
        this.ipagination = pagination
        this.loadData(null, this.value)
      },
    }
  }
</script>
<style>
  .j-address-list-right-card-box .ant-table-placeholder {
    min-height: 46px;
  }
</style>
<style scoped>
  .j-address-list-right-card-box {
    height: 100%;
    min-height: 300px;
  }
</style>