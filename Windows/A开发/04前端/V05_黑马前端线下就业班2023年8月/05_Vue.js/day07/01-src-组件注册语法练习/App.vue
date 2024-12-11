<template>
  <div class="app">
    <HmHeader></HmHeader>
    <HmMain />
    <hm-footer></hm-footer>
  </div>
</template>

<script>
/**
 * 局部注册组件，三个步骤：
 * 1. 导入
 * 2. 注册组件 --- 注册成html标签（这样，标签就代表组件了）
 * 3. 页面中使用 <HmHeader></HmHeader>
 */
// 导入组件
import HmHeader from './components/HmHeader.vue'
import HmMain from './components/HmMain.vue'
import HmFooter from './components/HmFooter.vue'

export default {
  // 注册组件
  components: {
    // 标签名: 导入的变量名
    HmHeader: HmHeader,
    HmMain: HmMain,
    HmFooter: HmFooter
  }
}
</script>

<style lang="scss" scoped>
.app {
  padding: 10px;
  background-color: #87ceeb;
}
</style>
