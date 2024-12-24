//处理请求体数据
const http = require('http');
//一 引入 querystring 
const qs = require('querystring');

const server = http.createServer((request, response) => {
    //1. 声明变量
    let body = '';
    //2. 绑定事件  data
    request.on('data', chunk => {  // 64k
        body += chunk;
    });
    //3. 绑定事件  end
    request.on('end', () => {
        // username=yuxiang&password=123456
        //              ||
        //              \/
        // {username: 'yuxiang', password: 123456}
        //二 解析数据 转化为对象
        const data = qs.parse(body);

        response.end('recevie OK');
    });
});

server.listen(9000, () => {
    console.log('开张啦!!');
});