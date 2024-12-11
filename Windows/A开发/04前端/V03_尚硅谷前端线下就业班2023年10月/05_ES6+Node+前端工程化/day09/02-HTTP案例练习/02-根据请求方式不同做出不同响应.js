/*
    所有请求方式 / 或者 /index    响应首页
    get方式 /login          加载登录页面
    post方式 /login         执行登录
    其他路径             404
*/


// 导入模块
const http = require('http');
const url = require('url');
const fs = require('fs');
const path = require('path');
const qs = require('querystring');

// 创建服务
const server = http.createServer((req, res) => {
    // 获取到 url 中的路径名部分
    const pathname = url.parse(req.url).pathname;

    // 根据路径和请求方式判断 做出不同的响应
    if (pathname === '/' || pathname === '/index') {
        const resBody = `
        <h1>首页</h1>
        <hr>
        <a href="/login">登录</a>
        `;
        res.writeHead(200, 'OK', {
            'Content-type': 'text/html;charset=utf-8'
        });
        res.end(resBody);
    } else if (pathname === '/login' && req.method === 'GET') {
        // 读取文件 login.html
        fs.readFile(path.resolve(__dirname, './login.html'), (err,data) => {
            if (err) {
                res.writeHead(500, 'Internal Server Error', {
                    'Content-type': 'text/html;charset=utf-8'
                });
                res.end('<h1>500 服务器错误！</h1>');
            } else {
                res.end(data);
            }
        });
    } else if (pathname === '/login' && req.method === 'POST') {
        // 接收表单提交的数据
        let reqBody = '';
        req.on('data', chunk => {
            reqBody += chunk;
        });
        // 读取请求体完毕
        req.on('end', () => {
            // 解析请求体
            const body = qs.parse(reqBody);
            
            // 定义响应内容
            let resBody = '';
            // 执行模拟登录
            if (body.username === 'admin' && body.pwd === '123456') {
                // 登录成功
                resBody = '<p>登录成功！ <a href="/">返回首页</a></p>';
            } else {
                // 登录失败
                resBody = '<p>登录失败！ <a href="/login">重新登录</a></p>';
            }

            // 作出响应
            res.writeHead(200, 'OK', {
                'Content-type': 'text/html;charset=utf-8'
            });
            res.end(resBody);

        });
    } else {
        res.writeHead(404, 'Not Found', {
            'Content-type': 'text/html;charset=utf-8'
        });
        res.end('<h1>404 页面不存在！</h1>');
    }


});

// 启动服务
server.listen(8080, () => {
    console.log('http server is runing on 8080');
});
