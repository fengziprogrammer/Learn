//1. 引入 http 模块
const http = require('http');
//2. 调用方法 创建服务对象
/**
 * request 请求报文的封装对象
 * response 响应报文的封装对象
 */
const server = http.createServer(function(request, response){
    response.end('Hello Everyone H5200826');
});

//3. 监听端口 启动服务
server.listen(80, function(){
    console.log('服务已经启动, 端口 80 监听中.....');
});