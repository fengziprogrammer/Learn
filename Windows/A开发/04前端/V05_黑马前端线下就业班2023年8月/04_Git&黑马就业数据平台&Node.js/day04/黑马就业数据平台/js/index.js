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
  const { overview, year, salaryData, groupData, provinceData } = res.data
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
  // 6. 渲染籍贯分布
  renderProvince(provinceData)
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
  // console.log(groupData)
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
/**
 * 目标9: 完成籍贯分布 => 寻找社区符合要求的示例
 */
function renderProvince(provinceData) {
  // console.log(provinceData)
  const dom = document.querySelector('#map')
  const myEchart = echarts.init(dom)
  // 数据 => 全国的省份数据
  const dataList = [
    { name: '南海诸岛', value: 0 },
    { name: '北京', value: 0 },
    { name: '天津', value: 0 },
    { name: '上海', value: 0 },
    { name: '重庆', value: 0 },
    { name: '河北', value: 0 },
    { name: '河南', value: 0 },
    { name: '云南', value: 0 },
    { name: '辽宁', value: 0 },
    { name: '黑龙江', value: 0 },
    { name: '湖南', value: 0 },
    { name: '安徽', value: 0 },
    { name: '山东', value: 0 },
    { name: '新疆', value: 0 },
    { name: '江苏', value: 0 },
    { name: '浙江', value: 0 },
    { name: '江西', value: 0 },
    { name: '湖北', value: 0 },
    { name: '广西', value: 0 },
    { name: '甘肃', value: 0 },
    { name: '山西', value: 0 },
    { name: '内蒙古', value: 0 },
    { name: '陕西', value: 0 },
    { name: '吉林', value: 0 },
    { name: '福建', value: 0 },
    { name: '贵州', value: 0 },
    { name: '广东', value: 0 },
    { name: '青海', value: 0 },
    { name: '西藏', value: 0 },
    { name: '四川', value: 0 },
    { name: '宁夏', value: 0 },
    { name: '海南', value: 0 },
    { name: '台湾', value: 0 },
    { name: '香港', value: 0 },
    { name: '澳门', value: 0 },
  ]
  // 循环遍历 dataList 拿 dataList每一项和 provinceData做对比
  dataList.forEach(item => {
    // 拿dataList的每一项的name 和 provinceData的name做对比
    // console.log(item.name)
    const res = provinceData.find(ele => {
      return ele.name.includes(item.name)
    })
    // console.log(res) // 服务器返回的数据并且 和 dataList对应的
    // 如果有数据,我需要让 dataList的每一项的value 和 provinceData的value一致
    if (res !== undefined) {
      item.value = res.value
    }
  })
  const max = Math.max(...dataList.map(item => item.value))
  const option = {
    // 标题组件
    title: {
      text: '籍贯分布',
      top: 10,
      left: 10,
      textStyle: {
        fontSize: 16,
      },
    },
    // 提示框组件
    tooltip: {
      trigger: 'item',
      formatter: '{b}: {c} 位学员',
      borderColor: 'transparent',
      backgroundColor: 'rgba(0,0,0,0.5)',
      textStyle: {
        color: '#fff',
      },
    },
    // 游标位置及设置
    visualMap: {
      min: 0,
      max,
      left: 'left',
      bottom: '20',
      text: [max, '0'],
      inRange: {
        color: ['#ffffff', '#0075F0'],
      },
      show: true,
      left: 40,
    },
    // 地图的配置项
    geo: {
      map: 'china',
      roam: false,
      zoom: 1.0,
      label: {
        normal: {
          show: true,
          fontSize: '10',
          color: 'rgba(0,0,0,0.7)',
        },
      },
      itemStyle: {
        normal: {
          borderColor: 'rgba(0, 0, 0, 0.2)',
          color: '#e0ffff',
        },
        // 高亮扇形区域设置
        emphasis: {
          areaColor: '#34D39A',
          shadowOffsetX: 0,
          shadowOffsetY: 0,
          shadowBlur: 20,
          borderWidth: 0,
          shadowColor: 'rgba(0, 0, 0, 0.5)',
        },
      },
    },
    series: [
      {
        name: '籍贯分布',
        type: 'map',
        geoIndex: 0,
        data: dataList,
      },
    ],
  }
  myEchart.setOption(option)
}

