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
  const { overview, year, salaryData, groupData } = res.data
  // 获取到数据后, 调用渲染函数,渲染页面不同区域
  // 1. 渲染 overview 
  renderOverview(overview)
  // 2. 渲染 折线图
  renderYear(year)
  // 3. 渲染 薪资分布 饼状图
  renderSalaryData(salaryData)
  // 4. 渲染每组薪资
  renderGroupData(groupData)
  // 5. 渲染男女薪资
  renderGenderData(salaryData)
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
/**
 * 目标5: 折线图渲染 => 函数
 *  5.1 封装函数
 *  5.2 整合图例
 *    init 初始化一个实例
 *    准备配置项
 *    调用配置项
 */
const renderYear = (year) => {
  // console.log(year)
  // 1. 初始化一个实例
  const myChart = echarts.init(document.querySelector('#line'))
  // 2. 准备配置项
  const option = {
    // 标题组件
    title: {
      text: '2022全学科薪资走势',
      left: 5,
      top: 10
    },
    // 网格组件
    grid: {
      top: '15%'
    },
    // 提示框组件
    tooltip: {
      show: true,
      trigger: 'axis'
    },
    yAxis: {
      type: 'value',
      // 分割线改成虚线
      splitLine: {
        lineStyle: {
          type: 'dashed'
        }
      }
    },
    xAxis: {
      type: 'category',
      // x轴坐标轴线
      axisLine: {
        // 轴线样式
        lineStyle: {
          type: 'dashed', // 轴线类型 虚线
          color: '#cccccc' // 轴线颜色
        }
      },
      data: year.map(item => item.month)
    },
    series: [
      {
        data: year.map(item => item.salary),
        type: 'line',
        smooth: true,
        // 折线图标记点的大小
        symbolSize: 10,
        // 线条样式
        lineStyle: {
          width: 10,
          color: {
            type: 'linear', // 线性渐变
            x: 0,
            y: 0,
            x2: 1,
            y2: 0,
            colorStops: [{
              offset: 0, color: '#479dee' // 0% 处的颜色
            }, {
              offset: 1, color: '#5c75f0' // 100% 处的颜色
            }],
            global: false // 缺省为 false
          }
        },
        // 区域样式
        areaStyle: {
          color: {
            type: 'linear', // 线性渐变
            x: 0,
            y: 0,
            x2: 0,
            y2: 1,
            colorStops: [{
              offset: 0, color: '#b2d7f7' // 0% 处的颜色
            }, {
              offset: 1, color: 'rgba(255,255,255,0)' // 100% 处的颜色
            }],
            global: false // 缺省为 false
          }
        }
      }
    ]
  }
  // 3. 调用配置项
  myChart.setOption(option)
}
/**
 * 目标6: 完成饼图渲染 => 薪资分布
 */
const renderSalaryData = (salaryData) => {
  // console.log(salaryData)
  // 生成图表
  // 1. 生成实例化对象
  const myChart = echarts.init(document.querySelector('#salary'))
  // 2. 准备配置项
  const option = {
    tooltip: {
      trigger: 'item'
    },
    title: {
      text: '班级薪资分布',
      top: 10, // 标题位置
      left: 10,
      textStyle: { // 文字大小
        fontSize: 16
      }
    },
    // 图例组件位置
    legend: {
      bottom: 0, // 图表位置
      left: 'center'
    },
    series: [
      {
        name: '班级薪资分布', // 提示框的title
        type: 'pie',
        // 饼图的大小 [内圆的半径, 外圆的半径]
        radius: ['60%', '80%'],
        // 提示线的堆叠策略,圆环图不需要设置
        // avoidLabelOverlap: false,
        // 饼状图链接处的样式
        itemStyle: {
          borderRadius: 20, // 圆角
          borderColor: '#fff', // 边框颜色
          borderWidth: 2 // 边框宽度
        },
        // 提示文字
        label: {
          show: false, // 不显示提示文字
        },
        // 高亮的扇区样式
        // emphasis: {
        //   label: {
        //     show: false,
        //     fontSize: 40,
        //     fontWeight: 'bold'
        //   }
        // },
        labelLine: {
          show: false
        },
        data: salaryData.map(item => ({
          value: item.g_count + item.b_count,
          name: item.label
        })),
      }
    ],
    // 颜色
    color: ['#fda224', '#5097ff', '#3abcfa', '#34d39a']
  }
  // 3. 调用配置项
  myChart.setOption(option)
}
/**
 * 目标7: 每组薪资图标
 */
const renderGroupData = (groupData) => {
  console.log(groupData)
  // 1. 初始化
  const myChart = echarts.init(document.querySelector('#lines'))
  // 2. 配置项
  const option = {
    // 提示框组件
    tooltip: {},
    // 网格组件
    grid: {
      left: 70,
      top: 30,
      right: 30,
      bottom: 50
    },
    // x轴设置
    xAxis: {
      type: 'category',
      axisLine: {
        lineStyle: {
          type: 'dashed',
          color: '#ccc'
        }
      },
      data: groupData[1].map(item => item.name),
      axisLabel: {
        color: '#999' // 默认颜色和 axisLine 的color一致
      }
    },
    // y轴设置
    yAxis: {
      type: 'value',
      splitLine: {
        lineStyle: {
          type: 'dashed'
        }
      }
    },
    // 系列列表
    series: [
      {
        data: groupData[1].map(item => item.hope_salary),
        type: 'bar',
        itemStyle: { // 柱形图的图形颜色
          color: {
            type: 'linear',
            x: 0,
            y: 0,
            x2: 0,
            y2: 1,
            colorStops: [{
              offset: 0, color: '#34D39A' // 0% 处的颜色
            }, {
              offset: 1, color: 'rgba(52,211,154,0.2)' // 100% 处的颜色
            }],
            global: false // 缺省为 false
          }
        }
      },
      {
        data: groupData[1].map(item => item.salary),
        type: 'bar',
        itemStyle: {
          color: {
            type: 'linear',
            x: 0,
            y: 0,
            x2: 0,
            y2: 1,
            colorStops: [{
              offset: 0, color: '#499FEE' // 0% 处的颜色
            }, {
              offset: 1, color: 'rgba(73,159,238,0.2)' // 100% 处的颜色
            }],
            global: false // 缺省为 false
          }
        }
      }
    ]
  }
  // 3. 使用配置项
  myChart.setOption(option)

  // 4. 切换数据
  // 4.1 给组号绑定点击事件
  document.querySelector('#btns').addEventListener('click', e => {
    // 4.2 判断点的是不是button
    if (e.target.tagName === 'BUTTON') {
      // 4.3 排他
      document.querySelector('#btns').querySelector('.btn-blue').classList.remove('btn-blue')
      e.target.classList.add('btn-blue')
      // 4.4 获取我点击了那一组
      const group = e.target.innerHTML
      // console.log(groupData[group])
      option.xAxis.data = groupData[group].map(item => item.name)
      option.series[0].data = groupData[group].map(item => item.hope_salary)
      option.series[1].data = groupData[group].map(item => item.salary)
      // 重新渲染数据
      myChart.setOption(option)
    }
  })
}
/**
 * 目标8: 男女薪资分布
 */
const renderGenderData = (salaryData) => {
  const myChart = echarts.init(document.querySelector('#gender'))
  const option = {
    tooltip: {},
    title: [
      {
        text: '男女薪资分布',
        top: 10,
        left: 10,
        textStyle: {
          fontSize: 16
        }
      },
      {
        text: '男生',
        left: '50%',
        top: '45%',
        textStyle: {
          fontSize: 12
        }
      },
      {
        text: '女生',
        left: '50%',
        top: '85%',
        textStyle: {
          fontSize: 12
        }
      },
    ],
    // 颜色
    color: ['#fda224', '#5097ff', '#3abcfa', '#34d39a'],
    series: [
      {
        name: '男生',
        type: 'pie',
        radius: ['20%', '30%'], // 圆的半径
        center: ['50%', '30%'], // 圆的位置 
        // roseType: 'area', // 根据数据显示饼图的大小
        // itemStyle: {
        //   borderRadius: 8
        // },
        data: salaryData.map(item => ({
          value: item.b_count,
          name: item.label
        }))
      },
      {
        name: '女生',
        type: 'pie',
        radius: ['20%', '30%'], // 圆的半径
        center: ['50%', '70%'],
        // roseType: 'area',
        // itemStyle: {
        //   borderRadius: 8
        // },
        data: salaryData.map(item => ({
          value: item.g_count,
          name: item.label
        }))
      }
    ]
  }
  myChart.setOption(option)
}