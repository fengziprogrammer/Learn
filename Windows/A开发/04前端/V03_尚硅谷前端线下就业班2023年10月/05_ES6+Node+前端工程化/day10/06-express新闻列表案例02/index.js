// 导入模块
const express = require('express');

// 获取新闻数据
const newsData = require('./data.json');

// const res = newsData.map(item => '<li><a href="#">' + item.newsTitle + '</a></li>').join('');

// 创建服务
const app = express();

app.get('/', (req, res) => {
    res.redirect('/news');
});

// 新闻列表页
app.get('/news', (req, res) => {
    // 定义响应内容
    const resBody = `
    <!DOCTYPE html>
    <html lang="zh-CN">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>新闻列表</title>
    </head>
    <body>
        <h1>新闻列表</h1>
        <hr>
        <ul>
            ${newsData.map(item => '<li><a href="/news/'+item.id+'.html">'+item.newsTitle+'</a></li>').join('')}
        </ul>
    </body>
    </html>
    `

    // 响应
    res.send(resBody);
});


// 新闻详情页
app.get('/news/:id.html', (req, res) => {
    // 从URL参数中中获取id信息
    const id = req.params.id;

    // 根据id从数据中获取对应的新闻
    const newsItem = newsData.find(item => item.id === id);

    // 如果获取不到新闻数据
    if (!newsItem) {
        res.status(404).send('<h1>您的新闻走丢了~~~~</h1>');
        return;
    }

    // 定义响应内容
    const resBody = `
    <!DOCTYPE html>
    <html lang="zh-CN">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>新闻列表</title>
    </head>
    <body>
        <h1>${newsItem.newsTitle}</h1>
        <hr>
        <p>${newsItem.newsContent}</p>
    </body>
    </html>
    `
    // 响应
    res.send(resBody);
});

// 启动服务
app.listen(8080, () => {
    console.log('http server is runing on :8080');
})