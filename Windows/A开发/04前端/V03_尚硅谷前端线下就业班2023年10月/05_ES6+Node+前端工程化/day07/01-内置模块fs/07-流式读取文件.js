// 导入模块
const fs = require('fs');
const path = require('path');

// 要读取的文件地址
const file = path.resolve(__dirname, '../../课堂视频/03-内置模块fs-删除目录和读取目录.wmv');

// 创建文件读取流
const rs = fs.createReadStream(file);

rs.on('data', chunk => {
    console.log(chunk);
});

rs.on('end', () => {
    console.log('读取完毕！');
});

rs.on('error', () => {
    console.log('读取出错！');
});