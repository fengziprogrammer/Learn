require('http')
.createServer((request, response) => {
    //行
        //状态码
        response.statusCode = 404;
        response.statusCode = 500;
        //状态字符串
        response.statusMessage = 'TEST';
    //头
        response.setHeader('Content-type','text/html;charset=utf-8');
        //自定义头信息
        response.setHeader('abc', '1000');
    //体 (响应体不能为空)
        response.write('11111');
        response.write('222222');
        response.write('33333');
        response.write('44444');
        response.end();
})
.listen(80)