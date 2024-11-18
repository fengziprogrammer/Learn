// 引入模块
const fs = require('fs');
const path = require('path');

// 要读取文件的路径
const filename = path.join(__dirname, './data/a.txt');


// ----------------------------------------------------
// 异步方式 读取文件内容
/*
fs.readFile(filename, (err, data) => {
    if (err) {
        console.log('文件读取失败：', err.errno, err.code);
        return;
    }
    // console.log(data);  // Buffer 数据
    console.log(data.toString());
});
console.log('开始读取...');
*/

// 指定编码方式 直接对读取到二进制数据进行编码
fs.readFile(filename,'utf-8', (err, data) => {
    if (err) {
        console.log('文件读取失败：', err.errno, err.code);
        return;
    }
    console.log(data); 
  
});
console.log('开始读取...');


// -------------------------------------------
// 同步方式读取文件内容
// try {
//     // const data = fs.readFileSync(filename);
//     const data = fs.readFileSync(filename, 'utf-8');
//     console.log(data);
// } catch (error) {
//     console.log('文件读取失败：', error.errno, error.code);
// }
// console.log('开始读取...');
