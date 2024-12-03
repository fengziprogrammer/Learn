// mv 
//1. 引入 fs 
const fs = require("fs");

//2. 移动文件
// fs.rename('./home.html','./file/home.html', (err) => {
//     if(err) {
//         console.log(err);
//         return;
//     }
//     console.log('移动成功');
// });

//重命名
// fs.rename('./index.html','./file/首页.html', (err) => {
//     if(err) {
//         console.log(err);
//         return;
//     }
//     console.log('移动成功');
// });

//同步 API renameSync
fs.renameSync('./1.html','./one.html');