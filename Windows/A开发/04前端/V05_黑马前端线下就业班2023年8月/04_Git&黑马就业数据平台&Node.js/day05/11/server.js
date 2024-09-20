/**
 * 目标：编写 web 服务，监听请求的是 /index.html 路径的时候，
 *    返回 dist/index.html 时钟案例页面内容
 * 步骤：
 *  1. 基于 http 模块，创建 Web 服务
 *  2. 使用 req.url 获取请求资源路径，并读取 index.html 里字符串内容返回给请求方
 *  3. 其他路径，暂时返回不存在提示
 *  4. 运行 Web 服务，用浏览器发起请求
 */
const http = require('http')
const fs = require('fs')
const path = require('path')
// 1. 基于 http 模块，创建 Web 服务
const server = http.createServer()
// 2. 监听 request 请求
server.on('request', (req, res) => {
  // 2.1 使用 req.url 获取请求资源路径
  //    并读取 index.html 里字符串内容返回给请求方
  if (req.url === '/index.html' || req.url === '/') {
    // res.end('index')
    fs.readFile(path.join(__dirname, 'dist/index.html'), (err, data) => {
      res.end(data.toString())
    })
  } else {
    res.setHeader('Content-type', 'text/html;charset=utf-8')
    res.end('请求的资源部存在')
  }
})
server.listen(3000, () => {
  console.log('3000端口服务已启动')
})
