import Vue from 'vue'
import VueRouter from 'vue-router'

import Login from '@/views/Login'
import Register from '@/views/Register'
import Detail from '@/views/Detail'
import Home from '@/views/Home'

import Article from '@/views/Layout/Article'
import Collect from '@/views/Layout/Collect'
import Like from '@/views/Layout/Like'
import User from '@/views/Layout/User'

Vue.use(VueRouter)

const routes = [
  { path: '/login', component: Login },
  { path: '/register', component: Register },
  { path: '/detail', component: Detail },
  {
    path: '/',
    redirect: '/article',
    component: Home,
    children: [
      { path: 'article', component: Article }, // 面经列表
      { path: 'collect', component: Collect }, // 收藏
      { path: 'like', component: Like }, // 喜欢
      { path: 'user', component: User } // 我的
    ]
  }
]

const router = new VueRouter({
  routes
})

export default router
