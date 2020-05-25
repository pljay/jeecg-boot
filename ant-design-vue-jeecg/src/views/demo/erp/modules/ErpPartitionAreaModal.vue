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

        <a-form-item  label="分区" :labelCol="labelCol" :wrapperCol="wrapperCol" v-show="false">
          <a-input  v-decorator="['partitionSetId']" ></a-input>
        </a-form-item>
        <a-form-item label="节点" :labelCol="labelCol" :wrapperCol="wrapperCol">
          <a-tree-select
            showSearch
            :loadData="asyncLoadTreeData"
            :treeData="treeData"
            :dropdownStyle="{ maxHeight: '200px', overflow: 'auto' }"
            v-model="selectValue"
            :multiple="true"
            searchPlaceholder="Please select"
            placeholder="Please select"
          />
        </a-form-item>
        <a-form-item  :labelCol="labelCol" :wrapperCol="wrapperCol"  v-show="false">
          <a-input v-decorator="['postcodeId']" ></a-input>
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
    name: "ErpPartitionAreaModal",
    components: {
      JDictSelectTag,
    },
    data () {
      return {
        form: this.$form.createForm(this),
        title:"操作",
        width:800,
        visible: false,
        selectValue:undefined,
        partitionSetId:'',
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
          partitionSetId: {rules: [
            ]},
          postcodeId: {rules: [
            ]},
        },
        url: {
          tree:"/erp/postcode/treeList",
          add: "/erp/partitionArea/add",
          edit: "/erp/partitionArea/edit",
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
      add (val) {
        this.partitionSetId=val;
        this.edit({});
      },
      edit (record) {
        this.form.resetFields();
        this.model = Object.assign({}, record);
        this.visible = true;
        this.$nextTick(() => {
          let obj = {'partitionSetId': this.partitionSetId};
          this.form.setFieldsValue(obj);
          this.form.setFieldsValue(pick(this.model,'postcodeId'));
        })
      },
      close () {
        this.$emit('close');
        this.visible = false;
        this.clearValue();
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
            if(!this.partitionSetId){
              this.$message.warn("请选择分区");
              this.close();
              return false;
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
        this.form.setFieldsValue(pick(row,'postcodeId'))
      },
      clearValue(){
        this.form.resetFields();
        this.selectValue=undefined;
      }
    },
    watch: {
      selectValue(value) {
        //treeSelect 开启多选后数据类型自动更改为Arry .jion(',')转为字符串
        console.log("邮编treeModal 所选值："+value)
        let obj = {"postcodeId": value.join(",")};
        this.form.setFieldsValue(obj);
      },
    }
  }
</script>