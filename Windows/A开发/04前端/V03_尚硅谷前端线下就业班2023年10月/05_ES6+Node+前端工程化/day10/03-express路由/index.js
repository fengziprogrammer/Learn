// 导入模块
const express = require('express');
const path = require('path');

// 创建服务
const app = express();

// ---------------------------------------
//1 路由匹配方式：字符串精准匹配
app.get('/home', (req, res) => {
    res.send('<h1>Home</h1>');
});

// ---------------------------------------
//2 路由匹配方式：字符串模糊匹配
/*
    ?   前面的字符一次或0次
    +   前面的字符一次或多次
    *   任意字符任意次
    ()  将多个字符作为整体
*/
// 匹配 /admin/ 、 /admin/index 等等
app.get('/admin/*', (req, res) => {
    res.send('<h1>Admin</h1>');
});

// app.get('/index.html?', (req, res) => {
// app.get('/index.html+', (req, res) => {
app.get('/index(.html)?', (req, res) => {
    res.send('<h1>首页</h1>');
});

// ---------------------------------------
// 3 路由匹配方式：正则模糊匹配
app.get(/.css$/, (req, res) => {
    res.send('<h1>这是一个快乐的页面！</h1>');
});


// ---------------------------------------
// 4  匹配到带有参数的 URL
app.get('/article/:id', (req, res) => {
    res.send('<h1>文章</h1>');
    console.log(req.params.id);
});


// --------------------------------------------
// 5 路由组合
// 分配匹配 get:/login 和 post:/login
app.route('/login')
   .get((req, res)=>{
        res.sendFile(path.resolve(__dirname, 'pages', 'login.html'));
   })
   .post((req, res)=>{
        res.send('<h1>表单提交成功！</h1>');
   });

// ---------------------------------------
// 6 给路由设置多个回调函数
app.get('/product/index', (req, res, next) => {
    //res.send('Product 首页1');
    // 继续执行下一个回调函数
    console.log('第一个回调函数');
    next();
}, (req, res) => {
    console.log('第二个回调函数');
    res.send('Product 首页2');
});


// -------------------------------------------
// 前面没有匹配到 执行到这里都会匹配
// 定制 404  
app.all('*', (req, res) => {
    res.status(404).send('<h1>404 页面不存在！</h1>');
});

   


// 启动服务
app.listen(8080, () => {
    console.log('http server is running on :8080');
});