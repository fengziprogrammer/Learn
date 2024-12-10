// 1. 引入模块
const fs = require('fs');

//2. 调用方法
// fs.rename('./home.js', './index.js', err => {
//     if(err) throw err;
//     console.log('重命名成功');
// });

// fs.rename('./index.html', './project/首页.html', err => {
//     if(err) throw err;
//     console.log('重命名成功');
// });

//同步API
fs.renameSync('./project/app.css', './project/index.css');