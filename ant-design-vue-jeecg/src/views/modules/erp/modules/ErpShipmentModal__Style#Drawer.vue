<template>
  <a-drawer
    :title="title"
    :width="width"
    placement="right"
    :closable="false"
    @close="close"
    :visible="visible">
  
    <a-spin :spinning="confirmLoading">
      <a-form :form="form">

        <a-form-item label="客户单号" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'customerRefference', validatorRules.customerRefference]" placeholder="请输入客户单号"></a-input>
        </a-form-item>
        <a-form-item label="系统单号" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'shipmentNo', validatorRules.shipmentNo]" placeholder="请输入系统单号"></a-input>
        </a-form-item>
        <a-form-item label="渠道id" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'serviceId', validatorRules.serviceId]" placeholder="请输入渠道id"></a-input>
        </a-form-item>
        <a-form-item label="状态" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'shipmentStatus', validatorRules.shipmentStatus]" placeholder="请输入状态"></a-input>
        </a-form-item>
        <a-form-item label="撤销时间" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-date placeholder="请选择撤销时间" v-decorator="[ 'cancelTime', validatorRules.cancelTime]" :trigger-change="true" style="width: 100%"/>
        </a-form-item>
        <a-form-item label="发件人id" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'shipperId', validatorRules.shipperId]" placeholder="请输入发件人id"></a-input>
        </a-form-item>
        <a-form-item label="收件人id" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'consigneeId', validatorRules.consigneeId]" placeholder="请输入收件人id"></a-input>
        </a-form-item>
        <a-form-item label="收件人id" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'shipmentRemark', validatorRules.shipmentRemark]" placeholder="请输入收件人id"></a-input>
        </a-form-item>
        
      </a-form>
    </a-spin>
    <a-button type="primary" @click="handleOk">确定</a-button>
    <a-button type="primary" @click="handleCancel">取消</a-button>
  </a-drawer>
</template>

<script>

  import { httpAction } from '@/api/manage'
  import pick from 'lodash.pick'
  import { validateDuplicateValue } from '@/utils/util'
  import JDate from '@/components/jeecg/JDate'  
  
  export default {
    name: "ErpShipmentModal",
    components: { 
      JDate,
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
          customerRefference: {rules: [
          ]},
          shipmentNo: {rules: [
          ]},
          serviceId: {rules: [
          ]},
          shipmentStatus: {rules: [
          ]},
          cancelTime: {rules: [
          ]},
          shipperId: {rules: [
          ]},
          consigneeId: {rules: [
          ]},
          shipmentRemark: {rules: [
          ]},
        },
        url: {
          add: "/shipmentTest/erpShipment/add",
          edit: "/shipmentTest/erpShipment/edit",
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
          this.form.setFieldsValue(pick(this.model,'customerRefference','shipmentNo','serviceId','shipmentStatus','cancelTime','shipperId','consigneeId','shipmentRemark'))
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
        this.form.setFieldsValue(pick(row,'customerRefference','shipmentNo','serviceId','shipmentStatus','cancelTime','shipperId','consigneeId','shipmentRemark'))
      }
      
    }
  }
</script>

<style lang="less" scoped>
/** Button按钮间距 */
  .ant-btn {
    margin-left: 30px;
    margin-bottom: 30px;
    float: right;
  }
</style>