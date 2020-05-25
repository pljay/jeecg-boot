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

        <a-form-item label="订单号" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-search-select-tag v-decorator="['shipmentId', validatorRules.shipmentId]" dict="erp_shipment,shipment_no,id" />
        </a-form-item>
        <a-form-item label="时间" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-date placeholder="请选择时间" v-decorator="[ 'time', validatorRules.time]" :trigger-change="true" :show-time="true" date-format="YYYY-MM-DD HH:mm:ss" style="width: 100%"/>
        </a-form-item>
        <a-form-item label="状态" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['status', validatorRules.status]" :trigger-change="true" dictCode="shipment_status" placeholder="请选择状态"/>
        </a-form-item>
        <a-form-item label="状态描述" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'statusDes', validatorRules.statusDes]" placeholder="请输入状态描述"></a-input>
        </a-form-item>
        <a-form-item label="中文详情" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-textarea v-decorator="['cnContent', validatorRules.cnContent]" rows="4" placeholder="请输入中文详情"/>
        </a-form-item>
        <a-form-item label="英文详情" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-textarea v-decorator="['enContent', validatorRules.enContent]" rows="4" placeholder="请输入英文详情"/>
        </a-form-item>
        <a-form-item label="目的国详情" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-textarea v-decorator="['dnContent', validatorRules.dnContent]" rows="4" placeholder="请输入目的国详情"/>
        </a-form-item>

      </a-form>
    </a-spin>
  </a-modal>
</template>

<script>

  import { httpAction } from '@/api/manage'
  import pick from 'lodash.pick'
  import { validateDuplicateValue } from '@/utils/util'
  import JDate from '@/components/jeecg/JDate'
  import JDictSelectTag from "@/components/dict/JDictSelectTag"
  import JSearchSelectTag from '@/components/dict/JSearchSelectTag'

  export default {
    name: "ErpShipmentLogModal",
    components: {
      JDate,
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
          shipmentId: {rules: [
          ]},
          time: {rules: [
          ]},
          status: {rules: [
          ]},
          statusDes: {rules: [
          ]},
          cnContent: {rules: [
          ]},
          enContent: {rules: [
          ]},
          dnContent: {rules: [
          ]},
        },
        url: {
          add: "/erp/shipmentLog/add",
          edit: "/erp/shipmentLog/edit",
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
          this.form.setFieldsValue(pick(this.model,'createTime','updateBy','updateTime','shipmentId','time','status','statusDes','cnContent','enContent','dnContent'))
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
        this.form.setFieldsValue(pick(row,'createTime','updateBy','updateTime','shipmentId','time','status','statusDes','cnContent','enContent','dnContent'))
      },


    }
  }
</script>