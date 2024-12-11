<template>
  <div>
    <h2>App组件</h2>
    <p>App组件</p>
    <hr />
    <my-test></my-test>
    <hr />
    <my-test></my-test>
    <hr />
    <my-test></my-test>
  </div>
</template>

<script>
import MyTest from './components/MyTest'
export default {
  components: {
    MyTest
  }
}
</script>

<style scoped>
p {
  color: blue;
}
</style>
