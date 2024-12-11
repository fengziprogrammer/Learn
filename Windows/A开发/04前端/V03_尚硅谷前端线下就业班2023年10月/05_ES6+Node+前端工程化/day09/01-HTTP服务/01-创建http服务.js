// 导入模块
const http = require('http');

/*
    1. 创建 http 服务的方法的参数是个回调函数
    2. 回调函数在接收到请求的时候自动执行
    3. 回调函数在执行的时候，接收到两个参数，分别是请求对象，响应对象
    4. createServer 方法返回一个对象
*/
const server = http.createServer((req, res) => {
    console.log('我接收到了一个请求！ 客户端IP：', req.socket.remoteAddress);
    // 设置响应
    res.end('<h1>Welcome to My WebSite</h1>');
});

// 启动服务 给http服务对象监听端口, 服务启动成功，回调函数就执行
// 端口号如果是 80，浏览器中的地址可以省略端口号
server.listen(8080, () => {
    console.log('http server is running on 8080');
});

// 第二个参数可以设置 ip
// server.listen(8080, '127.0.0.1', () => {
//     console.log('http server is running on 8080');
// });



/*
   注意：
   1. 修改代码之后，要重新启动服务，先 ctrl+c 结束，再重新运行
   2. 如果端口号被占用，可以换一个端口或者关闭占用端口的进程

*/