<template>
  <a-row type="flex" :gutter="16">
    <a-col :md="8" :sm="24">
      <partition-list-left v-model="pid"/>
    </a-col>
    <a-col :md="24-8" :sm="24">
      <partition-list-Right v-model="pid"/>
    </a-col>
  </a-row>
</template>

<script>
  import PartitionListLeft from './modules/PartitionListLeft'
  import PartitionListRight from './modules/PartitionListRight'

  export default {
    name: 'PartitionList',
    components: {
      PartitionListLeft,
      PartitionListRight
    },
    data() {
      return {
        description: '分区管理',
        pid:0
      }
    },

    methods: {}
  }
</script>
<style scoped>
  @import '~@assets/less/common.less';
</style>