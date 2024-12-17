//引入 http 模块
const http = require('http');
//一. 引入 url 模块
const url = require('url');
const fs = require('fs');
//调用方法 创建服务对象
const server = http.createServer(function(request, response){
    // console.log(request.headers);
    let ip = getClientIP(request);
    let content = ip + '---' + url.parse(request.url, true).query.word+'\r\n'
    if(url.parse(request.url, true).query.word){
        fs.writeFileSync('./200826.log',content , {flag: 'a'});
        response.end('recevied');
    }else{
        response.end('daoluan');
    }
});

function getClientIP(req) {
    return req.headers['x-forwarded-for'] || // 判断是否有反向代理 IP
        req.connection.remoteAddress || // 判断 connection 的远程 IP
        req.socket.remoteAddress || // 判断后端的 socket 的 IP
        req.connection.socket.remoteAddress;
};

//监听端口 启动服务
server.listen(80, function(){
    console.log('服务已经启动, 端口 80 监听中.....');
});

//启动 HTTP 服务
// http://192.169.20.41/s?word=干啥呢