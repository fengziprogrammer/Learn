// 导入模块
const fs = require('fs');
const path = require('path');

// 文件地址
const file01 = path.resolve(__dirname, './datas/a.txt');
const file02 = path.resolve(__dirname, './datas');

fs.stat(file02, (err, stats) => {
    if (err) {
        console.log('错误：', err.message);
    } else {
        console.log(stats);
        console.log('是否是目录：', stats.isDirectory());
        console.log('是否是文件：', stats.isFile());
    }
})

// 同步方式
try {
    const stats = fs.statSync(file01)
    console.log(file01);
    console.log('是否是目录：', stats.isDirectory());
    console.log('是否是文件：', stats.isFile());
    console.log('');
} catch (err) {
    console.log('错误：', err,message);
}