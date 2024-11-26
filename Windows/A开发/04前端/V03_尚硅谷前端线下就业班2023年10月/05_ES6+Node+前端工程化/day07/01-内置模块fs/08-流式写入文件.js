// 导入模块
const fs = require('fs');
const path = require('path');

// 设置要写入文件的地址
const file = path.resolve(__dirname, './datas/content.txt');

// 创建写入流
const ws = fs.createWriteStream(file);

ws.on('close', () => {
    console.log('写入完毕！');
});

for (let i = 0; i < 100000; i ++) {
    ws.write(`${i} ${Math.random()} ${Date.now()} \n`);
}

ws.close();