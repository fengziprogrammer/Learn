//1. 引入 http 模块
const http = require('http');

//2. 创建服务对象 create 创建  server 服务
// request 是对HTTP请求报文的封装对象
// response 是对 HTTP 响应报文的封装对象
const server = http.createServer(function(request, response){
    //设置响应的内容
    response.end('Hello H5200721');
});

//3. 监听端口, 启动服务  
server.listen(80, function(){
    console.log('服务已经启动, 监听端口为 8000....');
});