//文件写入
//1. 引入 fs 模块
const fs = require('fs');
//2-1 异步API. 调用 fs 中的方法 write 写入  File 文件
fs.writeFile('./index.html', '若以色见我，以音声求我，是人行邪道，不能见如来\r\n', { flag: 'a' }, function (err) {
    //判断 null
    if (err) {
        console.log('写入失败');
        console.log('失败的错误为' + err);
        return;
    }
    console.log('写入成功');
    // console.log(111);
});
// console.log(222);

//2-2 同步API
// fs.writeFileSync('./app.css', '*{margin:0;padding:0}');
// fs.writeFileSync('./app.js', Date.now());
// console.log(Date.now());


//同步与异步的演示
// const arr = [1,2,3,4,5,6,9];

// arr.forEach(item => {
//     // console.log(item * 10000);
//     console.log(11);
// });

// setTimeout(() => {
//     console.log(111);
// })

console.log('22');


