//1. 引入 http 模块
const http = require('http');
const url = require('url');
//2. 创建服务对象
// request 对请求报文的封装对象
// respone 对响应报文的封装对象
const server = http.createServer((request, response) => {
    //获取请求的方法
    console.log(request.method);
    //URL
    console.log(request.url);
    //头信息  结果是一个对象, 而且所有的头的名字都已经变为『小写』
    console.log(request.headers);
    //获取 url 的路径部分
    let pathname = url.parse(request.url, true).pathname;
    //  /home?a=100&b=200   =>  {a:100, b:200}
    let query = url.parse(request.url, true).query;
    console.log(pathname);
    console.log(query);
    //设置响应体
    response.end('Hello review');
});

//3. 监听端口启动服务
server.listen(8000, () => {
    console.log('服务正在运行中....')
});