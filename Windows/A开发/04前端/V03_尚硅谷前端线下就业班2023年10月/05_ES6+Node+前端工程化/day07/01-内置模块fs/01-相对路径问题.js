// 导入模块
const fs = require('fs');
const path = require('path');

// 要读取文件的地址
// const filename = './datas/a.txt';
// const filename = path.resolve('./datas/a.txt')
const filename = path.resolve(__dirname, './datas/a.txt')
// const filename = path.join(__dirname, './datas/a.txt')



console.log('文件地址：', filename);
console.log('');

// 读取文件的内容
fs.readFile(filename, 'utf-8', (err,data) => {
    if (err) {
        console.log('文件读取失败：', err.message);
    } else {
        console.log(data);
    }
})