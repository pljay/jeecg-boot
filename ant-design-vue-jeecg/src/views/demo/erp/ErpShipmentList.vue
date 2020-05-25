<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <a-card :bordered="false" >
    <!-- 查询区域 -->
    <div class="table-page-search-wrapper">
      <a-form layout="inline" @keyup.enter.native="searchQuery">
        <a-row :gutter="24">
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="创建日期">
              <j-date :show-time="true" date-format="YYYY-MM-DD HH:mm:ss" placeholder="请选择创建日期" v-model="queryParam.createTime"></j-date>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="更新日期">
              <j-date :show-time="true" date-format="YYYY-MM-DD HH:mm:ss" placeholder="请选择更新日期" v-model="queryParam.updateTime"></j-date>
            </a-form-item>
          </a-col>
          <template v-if="toggleSearchStatus">
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="客户单号">
                <a-input placeholder="请输入客户单号" v-model="queryParam.customerReference"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="系统单号">
                <a-input placeholder="请输入系统单号" v-model="queryParam.shipmentNo"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="订单状态">
                <j-dict-select-tag   placeholder="请输入订单状态" v-model="queryParam.shipmentLogId" dictCode="shipment_status"></j-dict-select-tag >
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="服务">
                <j-dict-select-tag placeholder="请输入服务" v-model="queryParam.serviceId" dictCode="erp_user_channel,name,id"></j-dict-select-tag>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="用户">
                <a-input placeholder="请输入用户" v-model="queryParam.username"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="贸易类型">
                <j-dict-select-tag placeholder="请选择贸易类型"  v-model="queryParam.tradeType" dictCode="trade_type"/>
              </a-form-item>
            </a-col>
            <!--<a-col :xl="6" :lg="7" :md="8" :sm="24">-->
            <!--<a-form-item label="货物类型">-->
            <!--<j-multi-select-tag placeholder="请输入货物类型" v-model="queryParam.cargoType" dictCode="cargo_type"/>-->
            <!--</a-form-item>-->
            <!--</a-col>-->
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="清关方法">
                <j-dict-select-tag placeholder="请选择清关方法" v-model="queryParam.ccType" dictCode="cc_method"/>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="报关方法">
                <j-dict-select-tag placeholder="请选择报关方法" v-model="queryParam.cdType" dictCode="cd_method"/>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="交税方式">
                <j-dict-select-tag placeholder="请选择交税方式" v-model="queryParam.taxMode" dictCode="tax_mode"/>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人名称">
                <a-input placeholder="请输入发件人名称" v-model="queryParam.shipperName"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人公司">
                <a-input placeholder="请输入发件人公司" v-model="queryParam.shipperCompany"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人手机号">
                <a-input placeholder="请输入发件人手机号" v-model="queryParam.shipperTelephone"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人电话号">
                <a-input placeholder="请输入发件人电话号" v-model="queryParam.shipperMobile"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人邮箱">
                <a-input placeholder="请输入发件人邮箱" v-model="queryParam.shipperEmail"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人国家(大写二字简码)">
                <a-input placeholder="请输入发件人国家(大写二字简码)" v-model="queryParam.shipperCountry"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人省(州)">
                <a-input placeholder="请输入发件人省(州)" v-model="queryParam.shipperState"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人城市">
                <a-input placeholder="请输入发件人城市" v-model="queryParam.shipperCity"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人地址">
                <a-input placeholder="请输入发件人地址" v-model="queryParam.shipperAddress"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人街道">
                <a-input placeholder="请输入发件人街道" v-model="queryParam.shipperStreet"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="发件人邮编">
                <a-input placeholder="请输入发件人邮编" v-model="queryParam.shipperPostcode"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人姓名">
                <a-input placeholder="请输入收件人姓名" v-model="queryParam.consigneeName"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人公司">
                <a-input placeholder="请输入收件人公司" v-model="queryParam.consigneeCompany"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人手机号">
                <a-input placeholder="请输入收件人手机号" v-model="queryParam.consigneeTelephone"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人电话号">
                <a-input placeholder="请输入收件人电话号" v-model="queryParam.consigneeMobile"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人邮箱">
                <a-input placeholder="请输入收件人邮箱" v-model="queryParam.consigneeEmail"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人国家(大写二字简码)">
                <a-input placeholder="请输入收件人国家(大写二字简码)" v-model="queryParam.consigneeCountry"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人省/州">
                <a-input placeholder="请输入收件人省/州" v-model="queryParam.consigneeState"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人城市">
                <a-input placeholder="请输入收件人城市" v-model="queryParam.consigneeCity"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人地址1">
                <a-input placeholder="请输入收件人地址1" v-model="queryParam.consigneeAddress1"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人地址2">
                <a-input placeholder="请输入收件人地址2" v-model="queryParam.consigneeAddress2"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人街道">
                <a-input placeholder="请输入收件人街道" v-model="queryParam.consigneeStreet"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人楼号">
                <a-input placeholder="请输入收件人楼号" v-model="queryParam.consigneeHouse"></a-input>
              </a-form-item>
            </a-col>
            <a-col :xl="6" :lg="7" :md="8" :sm="24">
              <a-form-item label="收件人邮编">
                <a-input placeholder="请输入收件人邮编" v-model="queryParam.consigneePostcode"></a-input>
              </a-form-item>
            </a-col>
          </template>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <span style="float: left;overflow: hidden;" class="table-page-search-submitButtons">
              <a-button type="primary" @click="searchQuery" icon="search">查询</a-button>
              <a-button type="primary" @click="searchReset" icon="reload" style="margin-left: 8px">重置</a-button>
              <a @click="handleToggleSearch" style="margin-left: 8px">
                {{ toggleSearchStatus ? '收起' : '展开' }}
                <a-icon :type="toggleSearchStatus ? 'up' : 'down'"/>
              </a>
            </span>
          </a-col>

        </a-row>
      </a-form>
    </div>
    <!-- 查询区域-END -->

    <!-- 操作按钮区域 -->
    <div class="table-operator">
      <a-button @click="handleAdd" type="primary" icon="plus">新增</a-button>
      <a-button type="primary" icon="download" @click="handleExportXls('订单表')">导出</a-button>
      <a-upload name="file" :showUploadList="false" :multiple="false" :headers="tokenHeader" :action="importExcelUrl" @change="handleImportExcel">
        <a-button type="primary" icon="import">导入</a-button>
      </a-upload>
      <a-dropdown v-if="selectedRowKeys.length > 0">
        <a-menu slot="overlay">
          <a-menu-item key="1" @click="batchDel"><a-icon type="delete"/>删除</a-menu-item>
          <a-menu-item key="2" @click="batchPrint"><a-icon type="delete"/>批量打印</a-menu-item>
        </a-menu>
        <a-button style="margin-left: 8px"> 批量操作 <a-icon type="down" /></a-button>
      </a-dropdown>
    </div>

    <!-- table区域-begin -->
    <!-- 加入拖拽滚动-->
    <div v-dragscroll.x="true" v-dragscroll="{target:'.ant-table-body'}">
      <div class="ant-alert ant-alert-info" style="margin-bottom: 16px;">
        <i class="anticon anticon-info-circle ant-alert-icon"></i> 已选择 <a style="font-weight: 600">{{ selectedRowKeys.length }}</a>项
        <a style="margin-left: 24px" @click="onClearSelected">清空</a>
      </div>

      <a-table
        ref="table"
        size="middle"
        bordered
        rowKey="id"
        :columns="columns"
        :dataSource="dataSource"
        :pagination="ipagination"
        :loading="loading"
        :scroll="{x:'200%'}"
        :rowSelection="{selectedRowKeys: selectedRowKeys, onChange: onSelectChange}"
        @change="handleTableChange"
        >

        <template slot="shipment_status" slot-scope="text, record">
          <div>
            <a  @click="trackLogModal(record)">
              <a-progress type="circle" :percent="100" :width="80" v-if="record.shipmentStatus ==17||record.shipmentStatus==0" status="exception">
                <template v-slot:format="">
                  <span style="color: #ff241c" v-if="record.shipmentStatus==='17'">deliver failed</span>
                  <span style="color: #ff241c" v-if="record.shipmentStatus==='0'">have exception</span>
                </template>
              </a-progress>
              <a-progress type="circle" :percent="100/16*record.shipmentStatus" :width="80"  v-else>
                <template v-slot:format="">
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='1'">create</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='2'">manifest</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='3'">pickup</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='4'">hub-out</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='5'">departure</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='6'">in-transit</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='7'">arrive</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='8'">customs clearance</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='9'">customs released</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='10'">handover to last mile</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='11'">received at local warehouse</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='12'">local dispatch</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='13'">local shipped</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='14'">arrived at delivery terminal</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='15'">on process</span>
                  <span style="color: #6983ff" v-if="record.shipmentStatus==='16'">delivered</span>
                </template>
              </a-progress>
            </a>
          </div>
        </template>



        <detail-list slot="shipment_number" size="small" :col="1" class="detail-layout" slot-scope="text, record">
          <detail-list-item term="客户单号">{{record.customerReference}}</detail-list-item>
          <detail-list-item term="系统编号">{{record.shipmentNo}}</detail-list-item>
          <div>
            <h3 :style="{ margin: '16px 0', color: 'rgba(4, 0, 255, 0.85)'}">
              派送单号
            </h3>
            <a-list size="small" bordered >
              <a-list-item  v-for="num in record.erpShipmentLabelList" :key="num.id">
               <a :href="'https://t.17track.net/zh-cn#nums='+num.trackNumber" target="_blank">{{ num.trackNumber}}</a>
              </a-list-item>
            </a-list>
          </div>
        </detail-list>

        <detail-list slot="shipper" size="small" :col="2" class="detail-layout" slot-scope="text, record">
          <detail-list-item term="发件人名称">{{record.shipperName}}</detail-list-item>
          <detail-list-item term="发件人公司">{{record.shipperCompany}}</detail-list-item>
          <detail-list-item term="发件人手机">{{record.shipperTelephone}}</detail-list-item>
          <detail-list-item term="发件人电话">{{record.shipperMobile}}</detail-list-item>
          <detail-list-item term="发件人邮箱">{{record.shipperEmail}}</detail-list-item>
          <detail-list-item term="发件人国家">{{record.shipperCountry}}</detail-list-item>
          <detail-list-item term="发件人省(州)">{{record.shipperState}}</detail-list-item>
          <detail-list-item term="发件人城市">{{record.shipperCity}}</detail-list-item>
          <detail-list-item term="收件人地址">{{record.shipperAddress}}</detail-list-item>
          <detail-list-item term="发件人街道">{{record.shipperStreet}}</detail-list-item>
          <detail-list-item term="发件人邮编">{{record.shipperPostcode}}</detail-list-item>
        </detail-list>

        <detail-list slot="consignee" size="small" :col="2" class="detail-layout" slot-scope="text, record">
          <detail-list-item term="收件人名称">{{record.consigneeName}}</detail-list-item>
          <detail-list-item term="收件人公司">{{record.consigneeCompany}}</detail-list-item>
          <detail-list-item term="收件人手机">{{record.consigneeTelephone}}</detail-list-item>
          <detail-list-item term="收件人电话">{{record.consigneeMobile}}</detail-list-item>
          <detail-list-item term="收件人邮箱">{{record.consigneeEmail}}</detail-list-item>
          <detail-list-item term="收件人国家">{{record.consigneeCountry}}</detail-list-item>
          <detail-list-item term="收件人省(州)">{{record.consigneeState}}</detail-list-item>
          <detail-list-item term="收件人城市">{{record.consigneeCity}}</detail-list-item>
          <detail-list-item term="收件人地址1">{{record.consigneeAddress1}}</detail-list-item>
          <detail-list-item term="收件人地址2">{{record.consigneeAddress2}}</detail-list-item>
          <detail-list-item term="收件人街道">{{record.consigneeStreet}}</detail-list-item>
          <detail-list-item term="收件人楼号">{{record.consigneeHouse}}</detail-list-item>
          <detail-list-item term="收件人邮编">{{record.consigneePostcode}}</detail-list-item>
        </detail-list>

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
              <a-menu-item v-show="record.shipmentLogId_dictText>2?false:true">
                <a-popconfirm title="确定删除吗?" @confirm="() => handleDelete(record.id)">
                  <a>删除</a>
                </a-popconfirm>
              </a-menu-item>
              <a-menu-item v-show="record.labelContent">
                  <a @click="print(record.labelContent)">打印标签</a>
              </a-menu-item>
            </a-menu>
          </a-dropdown>
        </span>

      </a-table>
    </div>

    <erpShipment-modal ref="modalForm" @ok="modalFormOk"></erpShipment-modal>

    <TrackLogModal ref="trackLogModal"> </TrackLogModal>
  </a-card>
</template>

<script>

  import { JeecgListMixin } from '@/mixins/JeecgListMixin'
  import ErpShipmentModal from './modules/ErpShipmentModal'
  import TrackLogModal from './modules/TrackLogModal'
  import JDictSelectTag from '@/components/dict/JDictSelectTag.vue'
  import JDate from '@/components/jeecg/JDate.vue'
  import {filterMultiDictText} from '@/components/dict/JDictSelectUtil'
  import JSelectUserByDep from '@/components/jeecgbiz/JSelectUserByDep'
  import JMultiSelectTag from "@/components/dict/JMultiSelectTag"
  import JSearchSelectTag from '@/components/dict/JSearchSelectTag'
  import DetailList from '@/components/tools/DetailList'
  import { dragscroll } from 'vue-dragscroll'
  import {lodopPrint} from '@/utils/lodop/LodopFuncs'
  const DetailListItem = DetailList.Item;
  export default {
    name: "ErpShipmentList",
    mixins: [JeecgListMixin],
    directives: {
      'dragscroll': dragscroll
    },
    components: {
      ErpShipmentModal,
      TrackLogModal,
      JSelectUserByDep,
      JDictSelectTag,
      JMultiSelectTag,
      JSearchSelectTag,
      JDate,
      DetailList,
      DetailListItem,
      lodopPrint,
    },

    data() {
      return {
        description: '订单表管理页面',
        // 表头
        columns: [
          {
            title: '单号',
            key: 'shipmentNumber',
            fixed: "left",
            width: 200,
            scopedSlots: {customRender: 'shipment_number'},
          },
          {
            title: '#',
            dataIndex: '',
            key: 'rowIndex',
            width: 60,
            align: "center",
            customRender: function (t, r, index) {
              return parseInt(index) + 1;
            }
          },
          {
            title: '订单状态',
            key: 'shipmentStatus',
            align: "center",
            width: 100,
            scopedSlots: {customRender: 'shipment_status'},
          },
          {
            title: '服务',
            align: "center",
            width: 80,
            dataIndex: 'serviceId_dictText'
          },
          {
            title:'包裹数量',
            align:"center",
            width: 80,
            dataIndex: 'shipmentQuantity',
            customRender:function (t, r, index) {
              return t+"/件";
            }
          },
          {
            title:'订单总重',
            align:"center",
            width: 80,
            dataIndex: 'shipmentWeight',
            customRender:function (t, r, index) {
              return t+"/KG";
            }
          },
          {
            title: '发件人信息',
            key: 'shipper',
            width: 390,
            scopedSlots: {customRender: 'shipper'},
          },
          {
            title: '收件人信息',
            key: 'consignee',
            width: 390,
            scopedSlots: {customRender: 'consignee'},
          },
          {
            title: '用户',
            align: "center",
            width: 100,
            dataIndex: 'username_dictText'
          },
          {
            title: '创建时间',
            align: "center",
            width: 100,
            dataIndex: 'createTime'
          },
          {
            title: '更新时间',
            align: "center",
            width: 100,
            dataIndex: 'updateTime'
          },
          {
            title: '贸易类型',
            align: "center",
            width: 100,
            dataIndex: 'tradeType_dictText'
          },
          {
            title: '货物类型',
            align: "center",
            width: 100,
            dataIndex: 'cargoType_dictText'
          },
          {
            title: '清关方式',
            align: "center",
            width: 100,
            dataIndex: 'ccType_dictText'
          },
          {
            title: '报关方式',
            align: "center",
            width: 100,
            dataIndex: 'cdType_dictText'
          },
          {
            title: '交税方式',
            align: "center",
            width: 100,
            dataIndex: 'taxMode_dictText'
          },
          {
            title: '税号',
            align: "center",
            width: 100,
            dataIndex: 'taxNo'
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
          list: "/erp/shipment/list",
          delete: "/erp/shipment/delete",
          deleteBatch: "/erp/shipment/deleteBatch",
          exportXlsUrl: "/erp/shipment/exportXls",
          importExcelUrl: "erp/shipment/importExcel",
        },
        dictOptions: {},
      }
    },
    computed: {
      importExcelUrl: function () {
        return `${window._CONFIG['domianURL']}/${this.url.importExcelUrl}`;
      },
    },
    methods: {
      initDictConfig() {
      },
      trackLogModal(record){
        this.$nextTick(()=>{
          const modalObj={
            title:record.shipmentNo,
            visible:true,
            width:600,
            fullscreen:false,
            switchFullscreen:true
          }
          this.$refs.trackLogModal.trackModal=modalObj;
          this.$refs.trackLogModal.shipment=record;
        })
      },
      print(v){
        return lodopPrint(v);
      },
      batchPrint(){
        const that=this;
        if(this.selectionRows.length>0){
          for (let i=0;i<this.selectionRows.length;i++){
            const row=this.selectionRows[i];
            if(row.labelContent){
              this.print(row.labelContent);
            }else{
              that.$message.warn(row.customerReference+"未生成把标签！");
              break;
            }
          }

        }
      }
    }
  }

</script>
<style lang="less">
</style>