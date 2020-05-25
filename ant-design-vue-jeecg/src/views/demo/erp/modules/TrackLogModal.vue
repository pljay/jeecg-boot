<template >
  <j-modal
    :visible.sync="trackModal.visible"
    :width="trackModal.width"
    :title="trackModal.title"
    :fullscreen.sync="trackModal.fullscreen"
    :switchFullscreen="trackModal.switchFullscreen"
  >
        <a-steps  direction="vertical"  >
          <a-step  v-for="log in shipment.shipmentLogList" :key="log.id"
                   :title=trackStatus[log.shipmentStatus]
                   :status="shipmentStatueRender(log.shipmentStatus)"
                   :description="log.time  +'  '+ log.cnContent">
          </a-step>
        </a-steps>
  </j-modal>
</template>

<script>
  import { mixinDevice } from '@/utils/mixin.js'
  import PageLayout from '@/components/page/PageLayout'
  const eum={
    0:'have exception',
    1:'create',
    2:'manifest',
    3:'pickup',
    4:'hub-out',
    5:'departure',
    6:'in-transit',
    7:'arrive',
    8:'customs clearance',
    9:'customs released',
    10:'handover to last mile',
    11:'received at local warehouse',
    12:'local dispatch',
    13:'local shipped',
    14:'arrived at delivery terminal',
    15:'on process',
    16:'delivered',
    17:'deliver failed',
  }


  export default {
    name: "trackLog",
    components: {
      PageLayout,
    },
    mixins: [mixinDevice],
    data () {
      return {
        trackStatus:eum,
        shipment:{shipmentLogList:[],
          shipmentLogId_dictText:"0"},
        trackModal:{
          title: '这里是标题',
          width:600,
          visible: false,
          fullscreen: true,
          switchFullscreen: true,
        },
      }
    },
    methods:{
      shipmentStatueRender(val) {
        if (val==0||val==17) {
          return 'error';
        } else {
          return 'finish';
        }
      }
    }
  }
</script>

<style lang="less" scoped>

  .detail-layout {
    margin-left: 44px;
  }
  .text {
    color: rgba(0, 0, 0, .45);
  }

  .heading {
    color: rgba(0, 0, 0, .85);
    font-size: 20px;
  }

  .no-data {
    color: rgba(0, 0, 0, .25);
    text-align: center;
    line-height: 64px;
    font-size: 16px;

    i {
      font-size: 24px;
      margin-right: 16px;
      position: relative;
      top: 3px;
    }
  }

  .mobile {
    .detail-layout {
      margin-left: unset;
    }
    .text {

    }
    .status-list {
      text-align: left;
    }
  }
</style>