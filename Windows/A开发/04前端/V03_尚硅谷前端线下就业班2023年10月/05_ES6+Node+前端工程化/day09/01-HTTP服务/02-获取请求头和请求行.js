// 导入模块
const http = require('http');
const {table} = require('table');

// 创建服务
const server = http.createServer((req, res) => {
    if (req.url === '/favicon.ico') {
        return res.end();
    }

    // 请求行
    console.log('请求方式：', req.method);
    console.log('URL：', req.url);
    console.log('协议版本：', req.httpVersion);
    // 获取IP地址
    console.log('客户端IP:', req.socket.remoteAddress);
    // 获取请求头
    // console.log(req.headers);
    console.log('客户端浏览器信息：', req.headers['user-agent']);
    console.log(table(Object.entries(req.headers)));

    // 设置响应头
    res.setHeader('Content-type', 'text/html;charset=utf-8');
    // 做出响应
    res.end('<h1>高小乐的交友网站</h1>');
});

// 启动服务
server.listen(8080, '127.0.0.1', () => {
    console.log('http server is runing on 8080');
})