import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ArticleItem from '@/components/ArticleItem'
// ---------------------------- 方式一：完整导入使用 ------------------------------
import Vant from 'vant'
import 'vant/lib/index.css'
import 'vant/lib/index.less' // 引入vant的less文件
Vue.component('ArticleItem', ArticleItem)
Vue.use(Vant)

// Toast('普通提示')
// Toast.success('成功提示')
// ---------------------------- 方式二：自动按需导入使用 ----------------------------
// import { Button, Tabbar, TabbarItem } from 'vant'

// Vue.use(Tabbar)
// Vue.use(TabbarItem)
// Vue.use(Button)

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
