<template>
  <div>
    <h2>App组件</h2>
    <!-- 
      父传子语法：
        父：通过自定义属性的方式，向子组件传递数据
    -->
    <!-- <my-test :id="goodsList[0].id" :name="goodsList[0].name"></my-test> -->
    <!--
    <my-test :item="goodsList[0]"></my-test>
    <my-test :item="goodsList[1]"></my-test>
    <my-test :item="goodsList[2]"></my-test>
    -->
    <my-test
      v-for="item in goodsList"
      :key="item.id"
      :obj="item"
      @kanyidao="changePrice"
    ></my-test>
  </div>
</template>

<script>
import MyTest from './components/MyTest'
export default {
  data () {
    return {
      goodsList: [
        { id: 1, name: '方便面', price: 2.5, info: '好吃不贵' },
        { id: 2, name: '火腿肠', price: 2, info: '价钱合理' },
        { id: 3, name: '卤鸡蛋', price: 1.5, info: '我的最爱' }
      ]
    }
  },
  components: {
    MyTest
  },
  methods: {
    changePrice (id) {
      console.log(id)
      let row = this.goodsList.find(item => item.id === id)
      row.price--
    }
  }
}
</script>

<style scoped>
p {
  color: blue;
}
</style>
