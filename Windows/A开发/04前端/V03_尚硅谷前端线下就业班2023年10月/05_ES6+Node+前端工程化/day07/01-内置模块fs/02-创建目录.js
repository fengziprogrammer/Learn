// 导入模块
const fs = require('fs');
const path = require('path');

// 新目录的地址
const newDir = path.resolve(__dirname, `./datas/${Date.now()}`);
// const newDir = path.resolve(__dirname, `./datas/images`);
// const newDir = path.resolve(__dirname, `./datas/dist/news/contents/news_ab1212`);

// 异步方式 创建目录
// fs.mkdir(newDir, err => {
//     if (err) {
//         console.log('创建目录失败：', err.message);
//     } else {
//         console.log('创建目录成功！');
//     }
// });


// 异步方式 创建目录 递归方式创建多级目录
fs.mkdir(newDir, {recursive:true},err => {
    if (err) {
        console.log('创建目录失败：', err.message);
    } else {
        console.log('创建目录成功！');
    }
});


// 同步方式 创建目录
try {
    fs.mkdirSync(newDir);
} catch (err) {
    console.log('目录创建失败：', err.message);
}