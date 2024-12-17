<template>
  <div class="article-page">面经列表页</div>
</template>

<script>
import { articleAPI } from '@/api/article'
export default {
  name: 'article-page',
  data () {
    return {
      current: 1, // 页码，获取第1页的数据
      sorter: 'weight_desc' // weight_desc--获取推荐的面试题；  null--获取最新的面试题
    }
  },
  methods: {
    async article () {
      const { data: res } = await articleAPI({
        current: this.current,
        sorter: this.sorter
      })
      console.log(res)
    }
  },
  created () {
    this.article()
  }
}
</script>

<style lang="less" scoped>
.article-page {
  margin-bottom: 50px;
  margin-top: 44px;
  .my-nav {
    height: 44px;
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    z-index: 999;
    background: #fff;
    display: flex;
    align-items: center;
    > a {
      color: #999;
      font-size: 14px;
      line-height: 44px;
      margin-left: 20px;
      position: relative;
      transition: all 0.3s;
      &::after {
        content: '';
        position: absolute;
        left: 50%;
        transform: translateX(-50%);
        bottom: 0;
        width: 0;
        height: 2px;
        background: #222;
        transition: all 0.3s;
      }
      &.active {
        color: #222;
        &::after {
          width: 14px;
        }
      }
    }
    .logo {
      flex: 1;
      display: flex;
      justify-content: flex-end;
      > img {
        width: 64px;
        height: 28px;
        display: block;
        margin-right: 10px;
      }
    }
  }
}
</style>
