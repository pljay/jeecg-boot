<template>
  <a-modal
    :title="title"
    :width="width"
    :visible="visible"
    :confirmLoading="confirmLoading"
    @ok="handleOk"
    @cancel="handleCancel"
    cancelText="关闭">
    <a-spin :spinning="confirmLoading">
      <a-form :form="form">

        <a-form-item label="用户名称" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-select-user-by-dep v-decorator="['username', validatorRules.username]" :trigger-change="true"/>
        </a-form-item>
        <a-form-item label="渠道名称" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-search-select-tag v-decorator="['channelId', validatorRules.channelId]" dict="erp_channel,channel_name,id" />
        </a-form-item>
        <a-form-item label="服务代码" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'code', validatorRules.code]" placeholder="请输入服务代码"></a-input>
        </a-form-item>
        <a-form-item label="服务名称" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'name', validatorRules.name]" placeholder="请输入服务名称"></a-input>
        </a-form-item>
        <a-form-item label="标签格式" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['labelFormat', validatorRules.labelFormat]" :trigger-change="true" dictCode="label_format" placeholder="请选择标签格式"/>
        </a-form-item>
        <a-form-item label="标签大小" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['labelSize', validatorRules.labelSize]" :trigger-change="true" dictCode="label_size" placeholder="请选择标签大小"/>
        </a-form-item>
        <a-form-item label="标签来源" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['labelSource', validatorRules.labelSource]" :trigger-change="true" dictCode="label_source" placeholder="请选择标签来源"/>
        </a-form-item>
        <a-form-item label="状态" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['status', validatorRules.status]" :trigger-change="true" dictCode="channel_status" placeholder="请选择状态"/>
        </a-form-item>
        <a-form-item label="运费成本" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['freightCostId', validatorRules.freightCostId]" :trigger-change="true" dictCode="erp_freight_cost,name,id" placeholder="请选择运费成本"/>
        </a-form-item>
        <a-form-item label="运费报价" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['freightQuoteId', validatorRules.freightQuoteId]" :trigger-change="true" dictCode="erp_freight_quote,name,id" placeholder="请选择运费报价"/>
        </a-form-item>

      </a-form>
    </a-spin>
  </a-modal>
</template>

<script>

  import { httpAction } from '@/api/manage'
  import pick from 'lodash.pick'
  import { validateDuplicateValue } from '@/utils/util'
  import JSelectUserByDep from '@/components/jeecgbiz/JSelectUserByDep'
  import JDictSelectTag from "@/components/dict/JDictSelectTag"
  import JSearchSelectTag from '@/components/dict/JSearchSelectTag'

  export default {
    name: "ErpUserChannelModal",
    components: {
      JSelectUserByDep,
      JDictSelectTag,
      JSearchSelectTag,
    },
    data () {
      return {
        form: this.$form.createForm(this),
        title:"操作",
        width:800,
        visible: false,
        model: {},
        labelCol: {
          xs: { span: 24 },
          sm: { span: 5 },
        },
        wrapperCol: {
          xs: { span: 24 },
          sm: { span: 16 },
        },
        confirmLoading: false,
        validatorRules: {
          username: {rules: [
          ]},
          channelId: {rules: [
            {required: true, message: '请输入渠道名称!'},
          ]},
          code: {rules: [
            {required: true, message: '请输入服务代码!'},
            { validator: (rule, value, callback) => validateDuplicateValue('erp_user_channel', 'code', value, this.model.id, callback)},
          ]},
          name: {rules: [
            {required: true, message: '请输入服务名称!'},
          ]},
          labelFormat: {rules: [
            {required: true, message: '请输入标签格式!'},
          ]},
          labelSize: {rules: [
            {required: true, message: '请输入标签大小!'},
          ]},
          labelSource: {rules: [
            {required: true, message: '请输入标签来源!'},
          ]},
          status: {rules: [
            {required: true, message: '请输入状态!'},
          ]},
          freightCostId: {rules: [
          ]},
          freightQuoteId: {rules: [
          ]},
        },
        url: {
          add: "/erp/userChannel/add",
          edit: "/erp/userChannel/edit",
        }
      }
    },
    created () {
    },
    methods: {
      add () {
        this.edit({});
      },
      edit (record) {
        this.form.resetFields();
        this.model = Object.assign({}, record);
        this.visible = true;
        this.$nextTick(() => {
          this.form.setFieldsValue(pick(this.model,'username','channelId','code','name','labelFormat','labelSize','labelSource','status','freightCostId','freightQuoteId'))
        })
      },
      close () {
        this.$emit('close');
        this.visible = false;
      },
      handleOk () {
        const that = this;
        // 触发表单验证
        this.form.validateFields((err, values) => {
          if (!err) {
            that.confirmLoading = true;
            let httpurl = '';
            let method = '';
            if(!this.model.id){
              httpurl+=this.url.add;
              method = 'post';
            }else{
              httpurl+=this.url.edit;
               method = 'put';
            }
            let formData = Object.assign(this.model, values);
            console.log("表单提交数据",formData)
            httpAction(httpurl,formData,method).then((res)=>{
              if(res.success){
                that.$message.success(res.message);
                that.$emit('ok');
              }else{
                that.$message.warning(res.message);
              }
            }).finally(() => {
              that.confirmLoading = false;
              that.close();
            })
          }

        })
      },
      handleCancel () {
        this.close()
      },
      popupCallback(row){
        this.form.setFieldsValue(pick(row,'username','channelId','code','name','labelFormat','labelSize','labelSource','status','freightCostId','freightQuoteId'))
      },


    }
  }
</script>