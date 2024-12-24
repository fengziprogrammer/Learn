<template>
  <div class="collect-page">
    <!-- 标题 -->
    <van-nav-bar title="我的收藏" class="navbar" />
    <!-- 我收藏的面试题列表 -->
    <van-list
      v-model="loading"
      :finished="finished"
      finished-text="没有更多了"
      @load="onLoad"
    >
      <ArticleItem
        v-for="item in list"
        :key="item.id"
        :item="item"
      ></ArticleItem>
    </van-list>
  </div>
</template>

<script>
import { collectLikeListAPI } from '@/api/article'
export default {
  name: 'collect-page',
  data () {
    return {
      current: 1, // 页码，获取第1页的数据
      list: [], // 存储要展示的面经列表数据
      loading: false, // true表示不允许加载数据（正在加载某一页的数据）；false表示此时没有发生请求获取数据
      finished: false // false表示还有下一页数据可以加载；true表示数据已经加载完毕
    }
  },
  methods: {
    // 获取面经列表数据
    async onLoad () {
      // 会将loading设置为true，表示正在请求数据，此时不能重复加载
      const { data: res } = await collectLikeListAPI({
        page: this.current, // 接口文档要求的分页页码
        optType: 2
      })
      // console.log(res)
      // 拿到某一页数据之后，不是赋值给list；而是向list里面添加
      this.list.push(...res.data.rows)
      this.loading = false
      this.current++ // 将页码加1
      if (this.current > res.data.pageTotal) {
        this.finished = true // 数据已经加载完毕
      }
    }
  }
}
</script>

<style lang="less" scoped>
.collect-page {
  margin-bottom: 50px;
  // margin-top: 44px;
  .navbar {
    position: fixed;
    width: 100%;
    top: 0;
  }
  .van-list {
    margin-top: 50px;
  }
}
</style>
