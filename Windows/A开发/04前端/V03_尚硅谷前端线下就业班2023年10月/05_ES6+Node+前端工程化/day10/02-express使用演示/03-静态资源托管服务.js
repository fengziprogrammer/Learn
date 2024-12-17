// 导入模块
const express = require('express');
const path = require('path');

// 创建服务
const app = express();

// 实现静态资源文件托管服务 中间件
app.use(express.static(path.resolve(__dirname, 'public')));



// 启动服务
app.listen(8080, () => {
    console.log('http server is runing on :8080');
});