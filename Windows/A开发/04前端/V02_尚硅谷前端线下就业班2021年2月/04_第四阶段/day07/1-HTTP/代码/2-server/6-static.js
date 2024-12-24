/**
 * 创建一个 HTTP 服务
 * 
 * GET    /index.html      public/index.html     响应一个文件中的内容
 * GET    /css/app.css     public/css/app.css   响应文件内容
 * GET    /css/home.css    public/css/home.css   响应文件内容
 * GET    /js/app.js       public/js/app.js      响应文件内容
 */
//1. 引入 http 模块
const http = require('http');
const url = require('url');
const fs = require('fs');
//2. 创建服务对象 create 创建  server 服务
const server = http.createServer(function(request, response){
    //获取路径   /index.html
    let pathname = url.parse(request.url, true).pathname;
    //  /index.html   =>  __dirname + '/public/index.html'
    // 网站的根目录  服务根据请求路径到『指定文件夹』下找文件, 那么这个『指定的文件夹』就是网站的根目录
    // let directory = __dirname + '/public';
    let directory = __dirname + '/public';
    let filePath = directory + pathname;
    //读取文件内容  D:/www/share/day07/public/index.html
    fs.readFile(filePath, (err, data) => {
        //如果有错误
        if(err){
            //404 响应
            response.statusCode = 404;
            response.end('<h1>404 Not Found</h1>')
        }else{
            //响应文件内容
            response.end(data);
        }
    })
});

//3. 监听端口, 启动服务  
server.listen(80, function(){
});