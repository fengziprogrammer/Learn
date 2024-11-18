// 导入模块
const fs = require('fs');
const path = require('path');


// 要写入文件的地址
// const filename = path.join(__dirname, './data/b.txt');
const filename = path.resolve('./data/b.txt');

// 要写入的内容
const data01 = '你好小乐' + Math.random() + '\n';
// const data02 = Buffer.alloc(20, 100);

// -----------------------------------------------------
// 异步f方式 写入文件
// fs.writeFile(filename, data01, err => {
//     if (err) {
//         console.log('写入失败！', err.errno, err.code);
//     } else {
//         console.log('写入成功！');
//     }
// })


// ----------------------------------------------------------
// 同步方式 写入文件
// try {
//     fs.writeFileSync(filename, data01);
//     console.log('写入成功！');
// } catch (err) {
//     console.log('写入失败！');
// }


// ---------------------------------------------------------------
// 异步方式 追加写
// fs.appendFile(filename, data01, err => {
//     if (err) {
//         console.log('写入失败！');
//     } else {
//         console.log('写入成功！');
//     }
// });


// -------------------------------------------------------------------
// 同步方式写入
try {
    for (let i = 0; i <= 10000; i ++) {
        fs.appendFileSync(filename, data01);
    }
} catch (err) {
    console.log('写入失败！');
}


