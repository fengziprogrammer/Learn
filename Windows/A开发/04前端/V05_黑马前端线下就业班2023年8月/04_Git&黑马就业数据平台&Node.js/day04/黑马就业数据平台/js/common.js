// 1. 配置axios基地址
axios.defaults.baseURL = 'https://hmajax.itheima.net'

// 2. 公共的 提示框函数
const showToast = (msg) => {
  // alert(msg)//
  // 2.1 先生成实例对象
  const mytoast = document.querySelector('.my-toast')
  const toastObj = new bootstrap.Toast(mytoast)
  toastObj.show()
  // 2.2 让提示框组件内容改变
  document.querySelector('.toast-body').innerHTML = msg
}
// showToast('成功')
const data = localStorage.getItem('userMsg') ? JSON.parse(localStorage.getItem('userMsg')) : {}

// 3. 公共的 token是否存在验证
const checkToken = () => {
  // 3.1 先去本地存储获取token
  const { token } = data
  // console.log(token)
  if (!token) {
    // 3.2 提示用户登录
    showToast('请先登录')
    // 3.3 跳转至登录页
    setTimeout(() => {
      location.href = './login.html'
    }, 1500)
  }
}

// 4. 回显用户名
const renderUname = () => {
  const { username } = data
  if (username) {
    document.querySelector('.username').innerHTML = username
  }
}
// 5. 退出登录
const logout = () => {
  document.querySelector('#logout').addEventListener('click', e => {
    // 5.1 清空本地存储
    localStorage.removeItem('userMsg')
    // 5.2 提示用户
    showToast('退出成功')
    // 5.3 跳转首页
    setTimeout(() => {
      location.href = './login.html'
    }, 1500)
  })
}
// 6. 请求拦截器 => 每次请求发送之前都会经过这个处理函数
// 添加请求拦截器 axios.interceptors.request.use(成功的回调函数,失败的回调函数)
axios.interceptors.request.use(config => {
  // 在发送请求之前做些什么
  // console.log('我被经过了') 
  // config 请求相关的信息 url method...
  // console.log(config.headers.Authorization)
  // 只有有了token才添加到请求头
  const { token } = data
  if (token) {
    config.headers['Authorization'] = token
  }
  return config
}, error => {
  // 对请求错误做些什么
  return Promise.reject(error)
})


// 7. 添加响应拦截器
// axios.interceptors.response.use(成功的回调函数,失败的回调函数)
axios.interceptors.response.use(response => {
  // 2xx 范围内的状态码都会触发该函数。
  // 对响应数据做点什么
  // console.log(response.data) // 此时已经被 axios 包装过了
  // 数据剥离 => 在 响应拦截器的 return response.data 即可
  return response.data
}, error => {
  // 超出 2xx 范围的状态码都会触发该函数。
  // console.dir(error)
  if (error.response.status === 401) {
    // token过期或被篡改
    showToast('您的登录信息过期,请重新登录')
    // 清除存储数据
    localStorage.removeItem('userMsg')
    // 跳转登录页
    setTimeout(() => {
      location.href = './login.html'
    }, 1500)
  }
  // 对响应错误做点什么
  return Promise.reject(error)
})
