import Vue from 'vue'
import App from './App.vue'
import router from '@/router' // 导入的是某个文件夹中的index文件，index可以不写
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
