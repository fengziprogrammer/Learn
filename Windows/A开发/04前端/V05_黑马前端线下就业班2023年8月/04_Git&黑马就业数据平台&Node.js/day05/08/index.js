/**
 * 目标：Web 服务支持中文字符
 * 问题：返回响应内容为，中文字符，浏览器无法正确显示
 * 原因：Web 服务没有设置响应头，指定说明内容类型和编码格式
 * 解决：设置响应头内容类型，让请求方能正确解析
 * 语法：res.setHeader('Content-Type', 'text/html;charset=utf-8')
 */
// 1. 引入 http 模块，创建 Web 服务对象
const http = require('http') // http模块是nodejs的内置模块 fs path..
// 创建 Web 服务对象
const serve = http.createServer()
// 2. 监听 request 事件 ,这个事件会监听浏览器的请求地址,并作出响应
serve.on('request', (req, res) => {
  // 给响应设置响应头,键 'Content-Type', 内容类型 
  // 值是 'text/html;charset=utf-8' 普通文本, 万国码解析方式
  res.setHeader('Content-Type', 'text/html;charset=utf-8')
  res.end('{"message": "请求成功"}')
})
// 3. 启动服务器,并告诉程序需要监听的端口号是什么
serve.listen(3000, () => {
  console.log('3000端口开始监听')
})