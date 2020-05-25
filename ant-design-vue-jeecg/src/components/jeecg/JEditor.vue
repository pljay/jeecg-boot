<template>
  <div class="tinymce-editor">
    <editor
      v-model="myValue"
      :init="init"
      :disabled="disabled"
      @onClick="onClick">
    </editor>
  </div>
</template>

<script>
  import Vue from 'vue'
  import { ACCESS_TOKEN,USER_INFO} from "@/store/mutation-types"
  import tinymce from 'tinymce/tinymce'
  import Editor from '@tinymce/tinymce-vue'
  import 'tinymce/themes/silver/theme'
  import 'tinymce/plugins/image'
  import 'tinymce/plugins/link'
  import 'tinymce/plugins/media'
  import 'tinymce/plugins/table'
  import 'tinymce/plugins/lists'
  import 'tinymce/plugins/contextmenu'
  import 'tinymce/plugins/wordcount'
  import 'tinymce/plugins/colorpicker'
  import 'tinymce/plugins/textcolor'
  import 'tinymce/plugins/fullscreen'
  import 'tinymce/plugins/paste'
  import { getFileAccessHttpUrl } from '@/api/manage';

  const  upload_url= window._CONFIG['domianURL']+"/sys/common/upload";
  let  token='';
  let  userInfo='';
  export default {
    components: {
      Editor,
      Vue,
      ACCESS_TOKEN,
      USER_INFO
    },
    props: {
      value: {
        type: String,
        required:false
      },
      triggerChange:{
        type: Boolean,
        default: false,
        required:false
      },
      disabled: {
        type: Boolean,
        default: false
      },
      plugins: {
        type: [String, Array],
        default: 'lists image link media table textcolor wordcount contextmenu fullscreen paste'
      },
      toolbar: {
        type: [String, Array],
        default: 'undo redo |  formatselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | lists link unlink image media table | removeformat | fullscreen ',
        branding:false
      }
    },
    data() {
      return {
        //初始化配置
        init: {
          language_url: '/tinymce/langs/zh_CN.js',
          language: 'zh_CN',
          skin_url: '/tinymce/skins/lightgray',
          height: 300,
          plugins: this.plugins,
          toolbar: this.toolbar,
          branding: false,
          menubar: false,
          toolbar_drawer: false,
          paste_data_images: true,
          file_picker_types: 'file media',
          images_upload_handler: (blobInfo, success) => {
            const img = 'data:image/jpeg;base64,' + blobInfo.base64()
            success(img)
          },
          file_picker_callback: function(callback, value, meta) {
            //文件分类
            var filetype='.pdf, .txt, .zip, .rar, .7z, .doc, .docx, .xls, .xlsx, .ppt, .pptx, .mp3, .mp4';
            //模拟出一个input用于添加本地文件
            var input = document.createElement('input');
            input.setAttribute('type', 'file');
            input.setAttribute('accept', filetype);
            input.click();
            input.onchange = function() {
              var file = this.files[0];
              var xhr, formData;
              xhr = new XMLHttpRequest();
              xhr.withCredentials = false;
              xhr.open('POST', upload_url);
              xhr.setRequestHeader("X-Access-Token",token);
              xhr.onload = function () {
                var json;
                if (xhr.status != 200) {
                  failure('HTTP Error: ' + xhr.status);
                  return;
                }
                json = JSON.parse(xhr.responseText);
                callback((window._CONFIG['staticDomainURL']+"/"+json.message),{title: json.message.split("/")[1],text:json.message.split("/")[1]});
              };
              formData = new FormData();
              formData.append('file', file, file.name);
              formData.append('biz', userInfo.username);
              xhr.send(formData);
            }
          }
        },
        myValue: this.value
      }
    },
    created(){
      token = Vue.ls.get(ACCESS_TOKEN);
      userInfo = Vue.ls.get(USER_INFO);
      console.log( userInfo )
    },
    mounted() {
      tinymce.init({})
    },
    methods: {
      onClick(e) {
        this.$emit('onClick', e, tinymce)
      },
      //可以添加一些自己的自定义事件，如清空内容
      clear() {
        this.myValue = ''
      }
    },
    watch: {
      value(newValue) {
        this.myValue = (newValue == null ? '' : newValue)
      },
      myValue(newValue) {
        if(this.triggerChange){
          this.$emit('change', newValue)
        }else{
          this.$emit('input', newValue)
        }
      }
    }
  }

</script>
<style scoped>
</style>