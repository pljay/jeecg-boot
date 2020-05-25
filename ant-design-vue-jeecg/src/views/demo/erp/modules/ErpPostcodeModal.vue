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
        <a-form-item label="节点" :labelCol="labelCol" :wrapperCol="wrapperCol" v-if="hidden">
          <a-tree-select
            showSearch
            :loadData="asyncLoadTreeData"
            :treeData="treeData"
            :dropdownStyle="{ maxHeight: '200px', overflow: 'auto' }"
            v-model="value"
            placeholder="Please select"
          />
        </a-form-item>
        <a-form-item  :labelCol="labelCol" :wrapperCol="wrapperCol"  v-show="false">
          <a-input v-decorator="['pid']" ></a-input>
        </a-form-item>

        <a-form-item label="值" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'value', validatorRules.value]" placeholder="请输入值"></a-input>
        </a-form-item>
        <a-form-item label="缩写" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-input v-decorator="[ 'abbr', validatorRules.abbr]" placeholder="请输入缩写"></a-input>
        </a-form-item>
      </a-form>
    </a-spin>
  </a-modal>
</template>

<script>

  import { httpAction,getAction } from '@/api/manage'
  import pick from 'lodash.pick'
  import { validateDuplicateValue } from '@/utils/util'
  import JDictSelectTag from "@/components/dict/JDictSelectTag"
  const  rootData=[{title:"国家列表",key:0,value:0,isLeaf:false}]
  export default {
    name: "ErpPostcodeModal",
    components: {
      JDictSelectTag
    },
    data () {
      return {
        hidden:true,
        value:undefined,
        form: this.$form.createForm(this),
        title:"操作",
        width:800,
        visible: false,
        model: {},
        treeData:[],
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
          pid: {rules: [
            ]},
          value: {rules: [
            ]},
          abbr: {rules: [
            ]},
          areaType: {rules: [
            ]},
        },
        url: {
          tree:"/erp/postcode/treeList",
          add: "/erp/postcode/add",
          edit: "/erp/postcode/edit",
        }
      }
    },
    created () {
      this.loadRoot();
    },
    methods: {
      asyncLoadTreeData(treeNode) {
        return new Promise(resolve => {
          if (treeNode.dataRef.children) {
            resolve();
            return;
          }
          let pid = treeNode.dataRef.key
          let param = {
            pid:pid
          }
          getAction(this.url.tree,param).then(res=>{
              if(res.success){
                treeNode.dataRef.children=res.result;
              }
              this.treeData = [...this.treeData];
              resolve()
            }
          )
        });
      },
      loadRoot() {
        this.treeData=rootData;
        this.treeData = [...this.treeData];
      },
      add () {
        this.hidden=true;
        this.edit({});
      },
      edit (record) {
        this.form.resetFields();
        this.model = Object.assign({}, record);
        this.visible = true;

        this.$nextTick(() => {
          this.form.setFieldsValue(pick(this.model,'id','abbr','areaType'));
          if(pick(this.model,'id').id){
            this.hidden=false
          }
          console.log(this.hidden)
          let obj={};
          switch(pick(this.model,'areaType').areaType) {
            case 1:
              obj={"value":pick(this.model,'id','country').country};
              this.form.setFieldsValue(obj);
              break;
            case 2:
              obj={"value":pick(this.model,'id','state').state};
              this.form.setFieldsValue(obj);
              break;
            case 3:
              obj={"value":pick(this.model,'id','city').city};
              this.form.setFieldsValue(obj);
              break;
            case 4:
              obj={"value":pick(this.model,'id','postcode').postcode};
              this.form.setFieldsValue(obj);
              break;
            default:
          }
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
        this.form.setFieldsValue(pick(row,'pid','value','abbr'))
      },
    },
    watch: {
      value(value) {
        console.log(value)
        let obj={"pid":value};
        this.form.setFieldsValue(obj);
      },
    }
  }
</script>