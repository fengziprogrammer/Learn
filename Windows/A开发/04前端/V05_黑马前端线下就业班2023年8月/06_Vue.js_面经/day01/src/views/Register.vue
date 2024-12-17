<template>
  <div class="login-page">
    <!-- 登录标题 -->
    <van-nav-bar title="面经注册" />
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
        <van-button block type="info" native-type="submit">注册</van-button>
      </div>
    </van-form>
    <!-- 超链接 -->
    <router-link class="link" to="/login">已有账号，去登录</router-link>
  </div>
</template>

<script>
// 导入配置好的 request.js
// import request from '@/utils/request'

// 导入 API 方法
import { registerAPI } from '@/api/user'

export default {
  name: 'register-page',
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
    // 点击注册的时候，执行。
    async onSubmit (values) {
      try {
        // values ==== {username: 'laotang', password: '123123'}
        // console.log('submit', values)
        await registerAPI(values)
        // request({
        //   method: 'POST',
        //   url: '/h5/user/register',
        //   data: values
        // })
        // console.log(res)
        this.$toast('注册成功') // 提示
        this.username = this.password = '' // 重置表单
        this.$router.push('/login') // 跳转到登录
      } catch (err) {
        // 注册失败，提示信息
        if (err.response) {
          this.$toast(err.response.data.message) // 如果有响应结果，则提示响应结果中的信息
        } else {
          this.$toast('注册失败') // 如果没有响应结果，则笼统的提示一下
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
