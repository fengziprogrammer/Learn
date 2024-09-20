/**
 * 目标：使用 http 模块，创建 Web 服务
 * Web服务：一个程序，用于提供网上信息浏览服务
 * 步骤：
 *  1. 引入 http 模块，创建 Web 服务对象
 *  2. 监听 request 事件，对本次请求，做一些响应处理
 *  3. 启动 Web 服务监听对应端口号
 *  4. 运行本服务在终端，用浏览器访问 http://localhost:3000/ 发起请求（localhost 是本机域名）
 * 注意：终端里启动了服务，如果想要终止按 ctrl c 停止即可
 */
// 1. 引入 http 模块，创建 Web 服务对象
const http = require('http') // http模块是nodejs的内置模块 fs path..
// 创建 Web 服务对象
const serve = http.createServer()
// 2. 监听 request 事件 ,这个事件会监听浏览器的请求地址,并作出响应
serve.on('request', (req, res) => {
  res.end('{message: chenggong}')
})
// 3. 启动服务器,并告诉程序需要监听的端口号是什么
serve.listen(3000, () => {
  console.log('3000端口开始监听')
})