// 导入模块
const http = require('http');
const url = require('url');
const path = require('path');
const fs = require('fs');

// 创建服务
const server = http.createServer((req, res) => {
    // 从url中获取路径名
    const pathname = url.parse(req.url).pathname;

    console.log(pathname);
   
    // 根据路径不同做出不同的响应
    switch (pathname) {
        case '/index.html': 
            fs.readFile(path.resolve(__dirname, 'public', 'index.html'), (err,data) => {
                if (err) {
                    res.writeHead(500,'Internal Server Error', {
                        'Content-type': 'text/html;charset=utf-8'
                    });
                    res.end('<h1>500 服务器发生未知错误！ </h1>')
                } else {
                    res.end(data);
                }
            });
            break;
        case '/learn.html': 
            fs.readFile(path.resolve(__dirname, 'public', 'learn.html'), (err,data) => {
                if (err) {
                    res.writeHead(500,'Internal Server Error', {
                        'Content-type': 'text/html;charset=utf-8'
                    });
                    res.end('<h1>500 服务器发生未知错误！ </h1>')
                } else {
                    res.end(data);
                }
            });
            break;
        case '/videos.html': 
            fs.readFile(path.resolve(__dirname, 'public', 'videos.html'), (err,data) => {
                if (err) {
                    res.writeHead(500,'Internal Server Error', {
                        'Content-type': 'text/html;charset=utf-8'
                    });
                    res.end('<h1>500 服务器发生未知错误！ </h1>')
                } else {
                    res.end(data);
                }
            });
            break;
        case '/dist/css/bootstrap.min.css':
            fs.readFile(path.resolve(__dirname, 'public', 'dist/css/bootstrap.min.css'), (err,data) => {
                if (err) {
                    res.writeHead(500,'Internal Server Error', {
                        'Content-type': 'text/html;charset=utf-8'
                    });
                    res.end('<h1>500 服务器发生未知错误！ </h1>')
                } else {
                    res.end(data);
                }
            });
            break;
        default:
            res.writeHead(404,'Not Found', {
                'Content-type': 'text/html;charset=utf-8'
            });
            res.end('<h1>404 您访问的页面不存在！</h1>')
    }
});

// 启动服务
server.listen(8080, () => {
    console.log('http server is running on 8080');
});