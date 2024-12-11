<template>
  <div>
    <button @click="abc = true">删除</button>

    <!-- <MyDialog :abc="abc" @update:abc="hanle"></MyDialog> -->
    <MyDialog :abc.sync="abc"></MyDialog>

    <!-- 
      :属性.sync="变量"
      等同于 :属性="变量"  +  @update:属性="xxx"
    -->
  </div>
</template>

<script>
import MyDialog from './components/MyDialog.vue'
export default {
  data() {
    return {
      abc: false // 控制弹层显示和隐藏
    }
  },
  // methods: {
  //   hanle(val) {
  //     this.abc = val
  //   },
  // },
  components: {
    MyDialog
  }
}
</script>

<style>
body {
  background-color: #b3b3b3;
}
</style>
