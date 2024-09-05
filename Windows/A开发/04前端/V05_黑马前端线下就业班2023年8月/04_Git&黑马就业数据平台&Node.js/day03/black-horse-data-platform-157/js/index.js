/**
 * 目标1: 验证token
 */
checkToken()

/**
 * 目标2: 回显用户名
 */
renderUname()

/**
 * 目标3: 退出登录
 */
logout()
/**
 * 函数封装 => 获取数据
 */
/* const getData = async () => {
  // const data = localStorage.getItem('userMsg') ? JSON.parse(localStorage.getItem('userMsg')) : {}
  // const { token } = data
  try {
    const res = await axios({
      url: '/dashboard',
      method: 'GET',
      // headers: { // 请求头参数
      //   Authorization: token
      // }
    })
    // 获取到数据后, 调用渲染函数,渲染页面不同区域
    // 1. 渲染 overview 
    renderOverview(res.data.overview)
  } catch (err) {
    // if (err.response.status === 401) {
    //   // token过期或被篡改
    //   showToast('您的登录信息过期,请重新登录')
    //   // 清除存储数据
    //   localStorage.removeItem('userMsg')
    //   // 跳转登录页
    //   setTimeout(() => {
    //     location.href = './login.html'
    //   }, 1500)
    // }
  }
} */
const getData = async () => {
  const res = await axios({
    url: '/dashboard',
    method: 'GET',
  })
  // 获取到数据后, 调用渲染函数,渲染页面不同区域
  // 1. 渲染 overview 
  renderOverview(res.data.overview)
}
getData()
/**
 * 目标4: 渲染 统计数据
 *  4.1 获取数据
 *  4.2 渲染页面
 */
const renderOverview = (overview) => {
  // console.log(overview)
  // 4.2 渲染页面 => 数据的键 和  页面的类名一致
  Object.keys(overview).forEach(item => {
    document.querySelector(`.${item}`).innerHTML = overview[item]
  })
}