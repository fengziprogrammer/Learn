//1. 引入 fs 模块
const fs = require('fs');

//2. 创建读取流对象
const rs = fs.createReadStream('./file/刻意练习.mp3');

//3. 绑定事件 when 当....时候   chunk 块   当读取完一块数据后 触发
rs.on('data', (chunk) => {
    console.log(chunk.length);
}); 

// 读取流打开的时候触发
rs.on('open', () => {
    console.log('读取流打开了');
});