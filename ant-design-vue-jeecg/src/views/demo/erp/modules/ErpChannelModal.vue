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

        <a-form-item label="渠道名称" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'channelName', validatorRules.channelName]" placeholder="请输入渠道名称"></a-input>
        </a-form-item>
        <a-form-item label="渠道代码" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'channelCode', validatorRules.channelCode]" placeholder="请输入渠道代码"></a-input>
        </a-form-item>
        <a-form-item label="access_token" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'accessToken', validatorRules.accessToken]" placeholder="请输入access_token"></a-input>
        </a-form-item>
        <a-form-item label="refresh_token" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'refreshToken', validatorRules.refreshToken]" placeholder="请输入refresh_token"></a-input>
        </a-form-item>
        <a-form-item label="配置内容" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'content', validatorRules.content]" placeholder="请输入配置内容"></a-input>
        </a-form-item>
        <a-form-item label="一票多件" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['multipleTickets']" :trigger-change="true" dictCode="judgment_status" placeholder="请选择一票多件"/>
        </a-form-item>
        <a-form-item label="渠道分区" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <j-dict-select-tag type="list" v-decorator="['partitionId']" :trigger-change="true" dictCode="erp_partition,name,id" placeholder="请选择渠道分区"/>
        </a-form-item>

      </a-form>
    </a-spin>
  </a-modal>
</template>

<script>

  import { httpAction } from '@/api/manage'
  import pick from 'lodash.pick'
  import JDictSelectTag from "@/components/dict/JDictSelectTag"

  export default {
    name: "ErpChannelModal",
    components: {
      JDictSelectTag,
    },
    props:{
      mainId:{
        type:String,
        required:false,
        default:''
      }
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
        validatorRules:{
        channelName:{rules: [{ required: true, message: '请输入渠道名称!' }]},
        channelCode:{rules: [{ required: true, message: '请输入渠道代码!' }]},
        accessToken:{},
        refreshToken:{},
        content:{},
        multipleTickets:{rules: [{ required: true, message: '请输入一票多件!' }]},
        partitionId:{},
        },
        url: {
          add: "/erp/supplier/addErpChannel",
          edit: "/erp/supplier/editErpChannel",
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
          this.form.setFieldsValue(pick(this.model,'createBy','createTime','updateBy','updateTime','sysOrgCode','supplierId','channelName','channelCode','accessToken','refreshToken','content','multipleTickets','partitionId'))
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
            formData['supplierId'] = this.mainId
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
        this.form.setFieldsValue(pick(row,'createBy','createTime','updateBy','updateTime','sysOrgCode','supplierId','channelName','channelCode','accessToken','refreshToken','content','multipleTickets','partitionId'))
      },


    }
  }
</script>
