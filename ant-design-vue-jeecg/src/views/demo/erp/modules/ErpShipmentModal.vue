<template>
  <j-modal
    ref="modal"
    class="j-modal-box"
    :title="title"
    :width="1200"
    :visible="visible"
    :maskClosable="false"
    :confirmLoading="confirmLoading"
    :switchFullscreen="switchFullscreen"
    @ok="handleOk"
    @cancel="handleCancel">
    <a-spin :spinning="confirmLoading">
      <!-- 主表单区域 -->
      <a-form :form="form">
        <a-row>
          <a-col :span="12">
            <a-form-item label="客户单号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'customerReference', validatorRules.customerReference]" placeholder="请输入客户单号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="系统编号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipmentNo']" placeholder="系统编号（自动生成）" readonly ></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="服务" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-search-select-tag v-decorator="['serviceId', validatorRules.serviceId]" dict="erp_user_channel,name,id" />
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="包裹数量" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input-number v-decorator="[ 'shipmentQuantity', validatorRules.shipmentQuantity]" placeholder="请输入包裹数量" />
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="订单总重" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input-number v-decorator="[ 'shipmentWeight', validatorRules.shipmentWeight]" placeholder="请输入订单总重" />
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="用户" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-select-user-by-dep v-decorator="['username', validatorRules.username]" :trigger-change="true" :multi="false"/>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="贸易类型" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-dict-select-tag type="radio" v-decorator="['tradeType', validatorRules.tradeType]" :trigger-change="true" dictCode="trade_type" placeholder="请选择贸易类型"/>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="货物类型" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-multi-select-tag type="list_multi" v-decorator="['cargoType', validatorRules.cargoType]" :trigger-change="true" dictCode="cargo_type" placeholder="请选择货物类型"/>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="清关方法" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-dict-select-tag type="radio" v-decorator="['ccType', validatorRules.ccType]" :trigger-change="true" dictCode="cc_method" placeholder="请选择清关方法"/>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="报关方法" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-dict-select-tag type="radio" v-decorator="['cdType', validatorRules.cdType]" :trigger-change="true" dictCode="cd_method" placeholder="请选择报关方法"/>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="交税方式" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <j-dict-select-tag type="radio" v-decorator="['taxMode', validatorRules.taxMode]" :trigger-change="true" @change="showTaxInput" dictCode="tax_mode" placeholder="请选择交税方式"/>
            </a-form-item>
          </a-col>
          <a-col :span="12" v-if="taxInputFlag">
            <a-form-item label="税号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'taxNo', validatorRules.taxNo]" placeholder="请输入税号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人名称" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperName', validatorRules.shipperName]" placeholder="请输入发件人名称"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人公司" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperCompany', validatorRules.shipperCompany]" placeholder="请输入发件人公司"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人手机号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperTelephone', validatorRules.shipperTelephone]" placeholder="请输入发件人手机号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人电话号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperMobile', validatorRules.shipperMobile]" placeholder="请输入发件人电话号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人邮箱" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperEmail', validatorRules.shipperEmail]" placeholder="请输入发件人邮箱"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人国家(大写二字简码)" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperCountry', validatorRules.shipperCountry]" placeholder="请输入发件人国家(大写二字简码)"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人省(州)" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperState', validatorRules.shipperState]" placeholder="请输入发件人省(州)"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人城市" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperCity', validatorRules.shipperCity]" placeholder="请输入发件人城市"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人地址" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperAddress', validatorRules.shipperAddress]" placeholder="请输入发件人地址"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人街道" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperStreet', validatorRules.shipperStreet]" placeholder="请输入发件人街道"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="发件人邮编" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'shipperPostcode', validatorRules.shipperPostcode]" placeholder="请输入发件人邮编"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人姓名" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeName', validatorRules.consigneeName]" placeholder="请输入收件人姓名"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人公司" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeCompany', validatorRules.consigneeCompany]" placeholder="请输入收件人公司"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人手机号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeTelephone', validatorRules.consigneeTelephone]" placeholder="请输入收件人手机号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人电话号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeMobile', validatorRules.consigneeMobile]" placeholder="请输入收件人电话号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人邮箱" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeEmail', validatorRules.consigneeEmail]" placeholder="请输入收件人邮箱"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人国家(大写二字简码)" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeCountry', validatorRules.consigneeCountry]" placeholder="请输入收件人国家(大写二字简码)"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人省/州" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeState', validatorRules.consigneeState]" placeholder="请输入收件人省/州"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人城市" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeCity', validatorRules.consigneeCity]" placeholder="请输入收件人城市"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人地址1" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeAddress1', validatorRules.consigneeAddress1]" placeholder="请输入收件人地址1"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人地址2" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeAddress2', validatorRules.consigneeAddress2]" placeholder="请输入收件人地址2"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人街道" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeStreet', validatorRules.consigneeStreet]" placeholder="请输入收件人街道"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人楼号" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneeHouse', validatorRules.consigneeHouse]" placeholder="请输入收件人楼号"></a-input>
            </a-form-item>
          </a-col>
          <a-col :span="12">
            <a-form-item label="收件人邮编" :labelCol="labelCol" :wrapperCol="wrapperCol">
              <a-input v-decorator="[ 'consigneePostcode', validatorRules.consigneePostcode]" placeholder="请输入收件人邮编"></a-input>
            </a-form-item>
          </a-col>

        </a-row>
      </a-form>

      <!-- 子表单区域 -->
      <a-tabs v-model="activeKey" @change="handleChangeTabs">
        <a-tab-pane tab="包裹表" :key="refKeys[0]" :forceRender="true">
          <j-editable-table
            :ref="refKeys[0]"
            :loading="erpShipmentParcelTable.loading"
            :columns="erpShipmentParcelTable.columns"
            :dataSource="erpShipmentParcelTable.dataSource"
            :maxHeight="300"
            :rowNumber="true"
            :rowSelection="true"
            :actionButton="true"/>
        </a-tab-pane>

        <a-tab-pane tab="产品表" :key="refKeys[1]" :forceRender="true">
          <j-editable-table
            :ref="refKeys[1]"
            :loading="erpShipmentProductTable.loading"
            :columns="erpShipmentProductTable.columns"
            :dataSource="erpShipmentProductTable.dataSource"
            :maxHeight="300"
            :rowNumber="true"
            :rowSelection="true"
            :actionButton="true"/>
        </a-tab-pane>

      </a-tabs>

    </a-spin>
  </j-modal>
</template>

<script>

  import pick from 'lodash.pick'
  import { FormTypes,getRefPromise } from '@/utils/JEditableTableUtil'
  import { JEditableTableMixin } from '@/mixins/JEditableTableMixin'
  import { validateDuplicateValue } from '@/utils/util'
  import JDate from '@/components/jeecg/JDate'
  import JSelectUserByDep from '@/components/jeecgbiz/JSelectUserByDep'
  import JDictSelectTag from "@/components/dict/JDictSelectTag"
  import JMultiSelectTag from "@/components/dict/JMultiSelectTag"
  import JSearchSelectTag from '@/components/dict/JSearchSelectTag'

  export default {
    name: 'ErpShipmentModal',
    mixins: [JEditableTableMixin],
    components: {
      JDate,
      JSelectUserByDep,
      JDictSelectTag,
      JMultiSelectTag,
      JSearchSelectTag,
    },
    data() {
      return {
        visible:false,
        switchFullscreen:true,
        taxInputFlag:false,
        labelCol: {
          span: 6
        },
        wrapperCol: {
          span: 16
        },
        labelCol2: {
          span: 3
        },
        wrapperCol2: {
          span: 20
        },
        // 新增时子表默认添加几行空数据
        addDefaultRowNum: 1,
        validatorRules: {
          createTime: {rules: [
            ]},
          updateTime: {rules: [
            ]},
          customerReference: {rules: [
              {required: true, message: '请输入客户单号!'},
              { validator: (rule, value, callback) => validateDuplicateValue('erp_shipment', 'customer_reference', value, this.model.id, callback)},
            ]},
          serviceId: {rules: [
              {required: true, message: '请输入服务!'},
            ]},
          shipmentQuantity: {rules: [
            ]},
          shipmentWeight: {rules: [
            ]},
          username: {rules: [
              {required: true, message: '请输入用户!'},
            ]},
          tradeType: {rules: [
              {required: true, message: '请输入贸易类型!'},
            ]},
          cargoType: {rules: [
              {required: true, message: '请输入货物类型!'},
            ]},
          ccType: {rules: [
              {required: true, message: '请输入清关方法!'},
            ]},
          cdType: {rules: [
              {required: true, message: '请输入报关方法!'},
            ]},
          taxMode: { rules: [
              {required: true, message: '请输入交税方式!'},
            ]},
          taxNo: {rules: [
              {required: true, message: '请输入税号!'},
            ]},
          shipperName: {rules: [
              {required: true, message: '请输入发件人名称!'},
            ]},
          shipperCompany: {rules: [
              {required: true, message: '请输入发件人公司!'},
            ]},
          shipperTelephone: {rules: [
            ]},
          shipperMobile: {rules: [
            ]},
          shipperEmail: {rules: [
              {pattern:/^([\w]+\.*)([\w]+)@[\w]+\.\w{3}(\.\w{2}|)$/, message: '请输入正确的电子邮件!'},
            ]},
          shipperCountry: {rules: [
              {required: true, message: '请输入发件人国家(大写二字简码)!'},
            ]},
          shipperState: {rules: [
              {required: true, message: '请输入发件人省(州)!'},
            ]},
          shipperCity: {rules: [
              {required: true, message: '请输入发件人城市!'},
            ]},
          shipperAddress: {rules: [
              {required: true, message: '请输入发件人地址!'},
            ]},
          shipperStreet: {rules: [
              {required: true, message: '请输入发件人街道!'},
            ]},
          shipperPostcode: {rules: [
              {required: true, message: '请输入发件人邮编!'},
            ]},
          consigneeName: {rules: [
              {required: true, message: '请输入收件人姓名!'},
            ]},
          consigneeCompany: {rules: [
              {required: true, message: '请输入收件人公司!'},
            ]},
          consigneeTelephone: {rules: [
            ]},
          consigneeMobile: {rules: [
            ]},
          consigneeEmail: {rules: [
              {pattern:/^([\w]+\.*)([\w]+)@[\w]+\.\w{3}(\.\w{2}|)$/, message: '请输入正确的电子邮件!'},
            ]},
          consigneeCountry: {rules: [
              {required: true, message: '请输入收件人国家(大写二字简码)!'},
            ]},
          consigneeState: {rules: [
              {required: true, message: '请输入收件人省/州!'},
            ]},
          consigneeCity: {rules: [
              {required: true, message: '请输入收件人城市!'},
            ]},
          consigneeAddress1: {rules: [
              {required: true, message: '请输入收件人地址1!'},
            ]},
          consigneeAddress2: {rules: [
              {required: true, message: '请输入收件人地址2!'},
            ]},
          consigneeStreet: {rules: [
              {required: true, message: '请输入收件人街道!'},
            ]},
          consigneeHouse: {rules: [
            ]},
          consigneePostcode: {rules: [
              {required: true, message: '请输入收件人邮编!'},
            ]},
        },
        refKeys: ['erpShipmentParcel', 'erpShipmentProduct', ],
        tableKeys:['erpShipmentParcel', 'erpShipmentProduct', ],
        activeKey: 'erpShipmentParcel',
        // 包裹表
        erpShipmentParcelTable: {
          loading: false,
          dataSource: [],
          columns: [
            {
              title: '系统包裹号',
              key: 'parcelNo',
              type: 'readonly',
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '客户包裹号',
              key: 'parcelReference',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '体积重(KG)',
              key: 'volumeWeight',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
              validateRules: [{ required: true, message: '${title}不能为空' }],
            },
            {
              title: '重量(KG)',
              key: 'weight',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
              validateRules: [{ required: true, message: '${title}不能为空' }],
            },
            {
              title: '长(CM)',
              key: 'length',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
              validateRules: [{ required: true, message: '${title}不能为空' }],
            },
            {
              title: '宽(CM)',
              key: 'width',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
              validateRules: [{ required: true, message: '${title}不能为空' }],
            },
            {
              title: '高(CM)',
              key: 'height',
              type: FormTypes.input,
              width:"200px",
              placeholder: '请输入${title}',
              defaultValue: '',
              validateRules: [{ required: true, message: '${title}不能为空' }],
            },
          ]
        },
        // 产品表
        erpShipmentProductTable: {
          loading: false,
          dataSource: [],
          columns: [
            {
              title: '客户包裹号',
              key: 'parcelReference',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: 'SKU',
              key: 'sku',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '国外SKU',
              key: 'fgnSku',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: 'HSCODE',
              key: 'hscode',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '国外SKU',
              key: 'fgnHscode',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '中文品名',
              key: 'cnName',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '英文品名',
              key: 'enName',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '中文品牌名',
              key: 'cnBrand',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '英文品牌名',
              key: 'enBrand',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '中文材质',
              key: 'cnMaterial',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '英文材质',
              key: 'enMaterial',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '中文用途',
              key: 'cnUsage',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '英文用途',
              key: 'enUsage',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '中文规格型号',
              key: 'cnModel',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '英文规格型号',
              key: 'enModel',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '数量',
              key: 'quantity',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '单价',
              key: 'unitPrice',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
            {
              title: '单位重量',
              key: 'unitWeight',
              type: FormTypes.input,
              width:"100px",
              placeholder: '请输入${title}',
              defaultValue: '',
            },
          ]
        },
        url: {
          add: "/erp/shipment/add",
          edit: "/erp/shipment/edit",
          erpShipmentParcel: {
            list: '/erp/shipment/queryErpShipmentParcelByMainId'
          },
          erpShipmentProduct: {
            list: '/erp/shipment/queryErpShipmentProductByMainId'
          },
        }
      }
    },
    methods: {
      getAllTable() {
        let values = this.tableKeys.map(key => getRefPromise(this, key))
        return Promise.all(values)
      },
      /** 调用完edit()方法之后会自动调用此方法 */
      editAfter() {
        let fieldval = pick(this.model,'createTime','updateTime','customerReference','shipmentNo','shipmentLogId','serviceId','shipmentQuantity','shipmentWeight','username','tradeType','cargoType','ccType','cdType','taxMode','taxNo','shipperName','shipperCompany','shipperTelephone','shipperMobile','shipperEmail','shipperCountry','shipperState','shipperCity','shipperAddress','shipperStreet','shipperPostcode','consigneeName','consigneeCompany','consigneeTelephone','consigneeMobile','consigneeEmail','consigneeCountry','consigneeState','consigneeCity','consigneeAddress1','consigneeAddress2','consigneeStreet','consigneeHouse','consigneePostcode')
        this.$nextTick(() => {
          this.form.setFieldsValue(fieldval)
        });
        //表单赋值 判断包税/自税
        this.showTaxInput(pick(this.model, 'name', 'taxMode').taxMode);
        // 加载子表数据
        if (this.model.id) {
          let params = { id: this.model.id }
          this.requestSubTableData(this.url.erpShipmentParcel.list, params, this.erpShipmentParcelTable)
          this.requestSubTableData(this.url.erpShipmentProduct.list, params, this.erpShipmentProductTable)
        }
      },
      /** 整理成formData */
      classifyIntoFormData(allValues) {
        let main = Object.assign(this.model, allValues.formValue)

        return {
          ...main, // 展开
          erpShipmentParcelList: allValues.tablesValue[0].values,
          erpShipmentProductList: allValues.tablesValue[1].values,
        }
      },
      validateError(msg){
        this.$message.error(msg)
      },
      popupCallback(row){
        this.form.setFieldsValue(pick(row,'createTime','updateTime','customerReference','shipmentNo','shipmentLogId','serviceId','shipmentQuantity','shipmentWeight','username','tradeType','cargoType','ccType','cdType','taxMode','taxNo','shipperName','shipperCompany','shipperTelephone','shipperMobile','shipperEmail','shipperCountry','shipperState','shipperCity','shipperAddress','shipperStreet','shipperPostcode','consigneeName','consigneeCompany','consigneeTelephone','consigneeMobile','consigneeEmail','consigneeCountry','consigneeState','consigneeCity','consigneeAddress1','consigneeAddress2','consigneeStreet','consigneeHouse','consigneePostcode'))
      },
      showTaxInput(v){
        console.log("表单数据："+v);
        if(v==="1"){
          this.taxInputFlag=true;
        }else{
          this.taxInputFlag=false;
        }
      },
    }
  }
</script>

<style scoped>
</style>