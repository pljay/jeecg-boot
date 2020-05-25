<template>
  <a-row type="flex" :gutter="16">
    <a-col :md="8" :sm="24">
      <postcode-list-left v-model="pid"/>
    </a-col>
    <a-col :md="24-8" :sm="24">
      <postcode-list-Right v-model="pid"/>
    </a-col>
  </a-row>
</template>

<script>
  import PostcodeListLeft from './modules/PostcodeListLeft'
  import PostcodeListRight from './modules/PostcodeListRight'

  export default {
    name: 'PostcodeList',
    components: {
      PostcodeListLeft,
      PostcodeListRight
    },
    data() {
      return {
        description: '邮编页面',
        pid:''
      }
    },

    methods: {}
  }
</script>
<style scoped>
  @import '~@assets/less/common.less';
</style>