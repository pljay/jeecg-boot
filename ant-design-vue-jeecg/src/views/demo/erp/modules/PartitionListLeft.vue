<template>
  <a-card :loading="cardLoading" :bodyStyle="{maxHeight:'800px',overflow:'auto'}" :bordered="false"  title="分区列表">

    <a-spin :spinning="loading">
      <a-tree
        showLine
        checkStrictly
        :expandedKeys.sync="expandedKeys"
        :selectedKeys="selectedKeys"
        :loadData="asyncLoadTreeData"
        :treeData="treeData"
        @select="onSelect"
      />
    </a-spin>
  </a-card>
</template>

<script>
  import { getAction } from '@/api/manage'


  export default {
    name: 'PartitionListLeft',
    data() {
      return {
        cardLoading: true,
        loading: false,
        url:{
          rootList:"/erp/partition/rootList",
          childrenList:"/erp/partition/childrenList"
        },
        treeData: [],
        selectedKeys: [],
        expandedKeys: []
      }
    },
    created() {
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
            partitionId:pid
          }
          getAction(this.url.childrenList,param).then(res=>{
              if(res.success){
                treeNode.dataRef.children=res.result;
              }
              this.treeData = [...this.treeData];
              resolve()
            }
          )
        });
      },
      loadRoot(){
        this.loading = true;
        // update-begin- --- author:wangshuai ------ date:20200102 ---- for:去除默认选中第一条数据、默认展开所有第一级
        // 默认选中第一条数据、默认展开所有第一级
        // if (res.result.length > 0) {
        //   this.expandedKeys = []
        //   res.result.forEach((item, index) => {
        //     if (index === 0) {
        //       this.selectedKeys = [item.id]
        //       this.emitInput(item.orgCode)
        //     }
        //     this.expandedKeys.push(item.id)
        //   })
        // }
        // update-end- --- author:wangshuai ------ date:20200102 ---- for:去除默认选中第一条数据、默认展开所有第一级
        return new Promise(resolve => {
          getAction(this.url.rootList,null).then(res=>{
              if(res.success){
                this.treeData=res.result;
              }
              this.treeData = [...this.treeData];
              resolve()
            this.loading = false
            this.cardLoading = false
            }
          )
        });

      },
      queryTreeData(keyword) {
        // this.commonRequestThen(queryDepartTreeList({
        //   departName: keyword ? keyword : undefined
        // }))
      },

      handleSearch(value) {
        // if (value) {
        //   this.commonRequestThen(searchByKeywords({ keyWord: value }))
        // } else {
        //   this.queryTreeData()
        // }
      },
      onSelect(selectedKeys,info) {
        console.log('selected',  info);
        if (selectedKeys.length > 0 && this.selectedKeys[0] !== selectedKeys[0]) {
          this.selectedKeys = [selectedKeys[0]]
          let pid =info.node.dataRef.key;
          console.log(pid);
          this.emitInput(pid)
        }
      },
      emitInput(pid) {
        this.$emit('input', pid)
      },
      commonRequestThen(promise) {
        this.loading = true
        promise.then(res => {
          if (res.success) {
            this.treeData = res.result
            this.treeData = [...this.treeData];
            // update-begin- --- author:wangshuai ------ date:20200102 ---- for:去除默认选中第一条数据、默认展开所有第一级
            // 默认选中第一条数据、默认展开所有第一级
            // if (res.result.length > 0) {
            //   this.expandedKeys = []
            //   res.result.forEach((item, index) => {
            //     if (index === 0) {
            //       this.selectedKeys = [item.id]
            //       this.emitInput(item.orgCode)
            //     }
            //     this.expandedKeys.push(item.id)
            //   })
            // }
            // update-end- --- author:wangshuai ------ date:20200102 ---- for:去除默认选中第一条数据、默认展开所有第一级
          } else {
            this.$message.warn(res.message)
          }
        }).finally(() => {
          this.loading = false
          this.cardLoading = false
        })
      },

    }
  }
</script>

<style scoped>

</style>