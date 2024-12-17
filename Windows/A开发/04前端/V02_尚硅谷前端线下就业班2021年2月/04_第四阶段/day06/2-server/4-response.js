//1. 引入 http 模块
const http = require('http');
let port = 8080;
//2. 调用方法 创建服务对象
const server = http.createServer(function(request, response){
    //Content-Type
    //设置响应头
    response.setHeader('Content-type', 'text/html;charset=utf-8');
    //设置响应体
    response.end(`
        <!doctype html>
        <html>
            <head>
                <style>
                    h2{
                        color:#135;
                    }
                </style>
            </head>
            <body>
                <h2>周末愉快</h2>
            </body>
        </html>
    `);
});

//3. 监听端口 启动服务
server.listen(port, function(){
    console.log(`服务已经启动, 端口 ${port} 监听中.....`);
});