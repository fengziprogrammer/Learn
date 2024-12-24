<template>
  <div class="layout-page">
    <!-- 二级路由的出口 -->
    <keep-alive :include="['article-page']">
      <router-view></router-view>
    </keep-alive>
    <!-- 底部标签 -->
    <van-tabbar route>
      <van-tabbar-item to="/article" icon="home-o">面经</van-tabbar-item>
      <van-tabbar-item to="/collect" icon="star-o">收藏</van-tabbar-item>
      <van-tabbar-item to="/like" icon="like-o">喜欢</van-tabbar-item>
      <van-tabbar-item to="/user" icon="user-o">我的</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'layout-page'
}
</script>

<style lang="less" scoped></style>
