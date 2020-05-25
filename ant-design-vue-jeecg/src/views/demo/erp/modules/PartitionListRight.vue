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

    <!-- 操作按钮区域 -->
    <div class="table-operator">
      <a-button @click="handleAdd" type="primary" icon="plus">新增</a-button>
      <a-button type="primary" icon="download" @click="handleExportXls('分区区域关系表')">导出</a-button>
      <a-upload name="file" :showUploadList="false" :multiple="false" :headers="tokenHeader" :action="importExcelUrl" @change="handleImportExcel">
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
        v-model="partitionSetId"
        ref="table"
        size="middle"
        bordered
        rowKey="id"
        :columns="columns"
        :dataSource="dataSource"
        :pagination="ipagination"
        :loading="loading"
        :rowSelection="{fixed:true,selectedRowKeys: selectedRowKeys, onChange: onSelectChange}"
        :scroll="tableScroll"
        @change="handleTableChange">

        <template slot="htmlSlot" slot-scope="text">
          <div v-html="text"></div>
        </template>
        <template slot="imgSlot" slot-scope="text">
          <span v-if="!text" style="font-size: 12px;font-style: italic;">无此图片</span>
          <img v-else :src="getImgView(text)" height="25px" alt="图片不存在" style="max-width:80px;font-size: 12px;font-style: italic;"/>
        </template>
        <template slot="fileSlot" slot-scope="text">
          <span v-if="!text" style="font-size: 12px;font-style: italic;">无此文件</span>
          <a-button
            v-else
            :ghost="true"
            type="primary"
            icon="download"
            size="small"
            @click="uploadFile(text)">
            下载
          </a-button>
        </template>

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

    <erpPartitionArea-modal ref="modalForm" @ok="modalFormOk"  ></erpPartitionArea-modal>
  </a-card>
</template>

<script>

  import { JeecgListMixin } from '@/mixins/JeecgListMixin'
  import ErpPartitionAreaModal from './ErpPartitionAreaModal'
  import {filterMultiDictText} from '@/components/dict/JDictSelectUtil'
  import { getAction,deleteAction } from '@/api/manage'

  export default {
    name: "PartitionListRight",
    mixins:[JeecgListMixin],
    components: {
      ErpPartitionAreaModal
    },
    props: ['value'],
    data () {
      return {
        description: '分区区域关系表管理页面',
        width:800,
        loading:false,
        cardLoading: true,
        positionInfo: {},
        partitionSetId:'',
        isorter:null,
        // 表头
        columns: [
          {
            title: '#',
            dataIndex: '',
            key:'rowIndex',
            width:60,
            align:"center",
            customRender:function (t,r,index) {
              return parseInt(index)+1;
            }
          },
          {
            title:'分区',
            align:"center",
            dataIndex: 'partitionSetId_dictText'
          },
          {
            title:'邮编',
            align:"center",
            dataIndex: 'postcodeId_dictText'
          },
          {
            title: '操作',
            dataIndex: 'action',
            align:"center",
            fixed:"right",
            width:147,
            scopedSlots: { customRender: 'action' }
          }
        ],
        url: {
          list: "/erp/partitionArea/list",
          delete: "/erp/partitionArea/delete",
          deleteBatch: "/erp/partitionArea/deleteBatch",
          exportXlsUrl: "/erp/partitionArea/exportXls",
          importExcelUrl: "erp/partitionArea/importExcel",
        },
        dictOptions:{},
        tableScroll:{x :2*147+50}
      }
    },
    watch: {
      value:{
        handler(val) {
          this.partitionSetId=val;
          console.log("父窗口id"+this.partitionSetId)
          this.dataSource = []
          this.loadData(1, this.partitionSetId)
        }
      }
    },
    computed: {
      importExcelUrl: function () {
        return `${window._CONFIG['domianURL']}/${this.url.importExcelUrl}`;
      }
    },
    methods: {
      loadData(pageNum, partitionSetId) {
        this.loading = true
        if (pageNum === 1) {
          this.ipagination.current = 1
        }
        // update-begin- --- author:wangshuai ------ date:20200102 ---- for:传过来的部门编码为空全查
        if (!partitionSetId) {
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
            partitionSetId,
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
        this.loadData(1, this.partitionSetId)
      },
      searchReset() {
        this.queryParam = {}
        this.loadData(1, this.partitionSetId)
      },
      handleTableChange(pagination, filters, sorter) {
        if (Object.keys(sorter).length > 0) {
          this.isorter.column = sorter.field
          this.isorter.order = 'asc\n' +
          '        this.ipagination = paginatend' === sorter.order ? 'asc' : 'desc'
        }
        this.loadData(null, this.partitionSetId)
      },
      handleDelete: function (id) {
        var that = this;
        deleteAction(that.url.delete, {id: id}).then((res) => {
          if (res.success) {
            that.$message.success(res.message);
            that.loadData(null, this.partitionSetId);
          } else {
            that.$message.warning(res.message);
          }
        });
      },
      handleAdd: function () {
        this.$refs.modalForm.add(this.partitionSetId);
        this.$refs.modalForm.title = "新增";
      },
      modalFormOk() {
        // 新增/修改 成功时，重载列表
        this.loadData(null, this.partitionSetId);
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