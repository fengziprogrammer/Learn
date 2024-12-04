const fs = require('fs');
const converByte = require('./converbyte');


// 获取文件大小
const filename = '../../课堂视频/01-模块的路径问题.wmv';
fs.stat(filename, (err, stat) => {
    if (err) {
        console.log('文件读取失败：', err.message);
        return;
    }

    console.log('B:', stat.size);
    console.log('KB:', converByte(stat.size, 1));
    console.log('MB:', converByte(stat.size, 2));
    console.log('GB:', converByte(stat.size, 3));
    console.log('TB:', converByte(stat.size, 4));
})

