// 导入模块
const express = require('express');

// 创建服务
const app = express();

app.get('/', (req, res) => {
    res.send('<h1>欢迎访问本网站！</h1>');
});

// 启动服务
app.listen(8080, () => {
    console.log('http server is runing on :8080');
})