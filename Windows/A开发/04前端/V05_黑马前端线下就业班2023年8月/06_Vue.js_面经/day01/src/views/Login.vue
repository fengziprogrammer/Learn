<template>
  <div class="login-page">
    <!-- 登录标题 -->
    <van-nav-bar title="面经登录" />
    <!-- 表单 -->
    <van-form @submit="onSubmit">
      <van-field
        v-model="username"
        name="username"
        label="账号"
        placeholder="请求输入账号"
        :rules="userRules"
      />
      <van-field
        v-model="password"
        type="password"
        name="password"
        label="密码"
        placeholder="请输入密码"
        :rules="[
          { required: true, message: '请填写密码' },
          { pattern: /^\S{6,20}$/, message: '请输入6~20位的密码' }
        ]"
      />
      <div style="margin: 16px">
        <van-button block type="info" native-type="submit">登录</van-button>
      </div>
    </van-form>
    <!-- 超链接 -->
    <router-link class="link" to="/register">还没有账号，去注册</router-link>
  </div>
</template>

<script>
// 导入API方法
import { loginAPI } from '@/api/user'

export default {
  name: 'login-page',
  data () {
    return {
      username: '',
      password: '',
      userRules: [
        // required 必须，表示用户名必填
        { required: true, message: '请填写用户名' },
        // 使用正则验证，验证用户名 2~10 为的数字字母下划线组合
        { pattern: /^\w{2,10}$/, message: '请输入2~10为的用户名' }
      ]
    }
  },
  methods: {
    // 点击登录的时候，执行。
    async onSubmit (values) {
      try {
        // values ==== {username: 'laotang', password: '123123'}
        // console.log('submit', values)
        const { data: res } = await loginAPI(values)
        // console.log(res)
        localStorage.setItem('mobile-token', res.data.token) // 存储token
        this.$toast('登录成功') // 提示
        this.username = this.password = '' // 清空输入框
        this.$router.push('/article') // 跳转到 面经列表页
      } catch (err) {
        if (err.response) {
          this.$toast(err.response.data.message)
        } else {
          this.$toast('登录失败')
        }
      }
    }
  }
}
</script>

<style lang="less" scoped>
.link {
  float: right;
  margin-right: 20px;
  font-size: 14px;
  color: #1989fa;
}
</style>
