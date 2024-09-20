/**
 * 目标：基于 Web 服务，开发-省份列表数据接口
 * 步骤：
 *  1. 创建 Web 服务
 *  2. 使用 req.url 获取请求的资源路径，读取 json 文件数据返回
 *  3. 其他请求的路径，暂时返回不存在的提示
 *  4. 运行 Web 服务，用浏览器请求地址查看效果
 */
const http = require('http')
const fs = require('fs')
const path = require('path')
// 1. 创建 Web 服务
const server = http.createServer()
server.on('request', (req, res) => {
  // 2. 使用 req.url 获取请求的资源路径，读取 json 文件数据返回
  // console.log(req.url)
  if (req.url === '/api/province') {
    // console.log('/api/province') 
    // 当监听到 客户端 访问了 '/api/province' 这个接口,我就去读取 data/province.json文件
    fs.readFile(path.join(__dirname, 'data/province.json'), (err, data) => {
      if (err) return res.end('请求失败')
      res.setHeader('Content-type', 'application/json')
      res.end(data)
    })
  } else {
    res.setHeader('Content-type', 'text/html;charset=utf-8')
    res.end('访问的资源不存在 404')
  }
})
server.listen(3000, () => {
  console.log('开始监听3000端口')
})