<template>
  <div>
    <h3>测试组件</h3>
    <p>test组件</p>
    <div>
      <button @click="count--">-</button>
      <span>{{ count }}</span>
      <button @click="count++">+</button>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      count: 100
    }
  }
}
</script>

<style scoped>
div {
  background-color: pink;
}
p {
  color: red;
}
</style>
