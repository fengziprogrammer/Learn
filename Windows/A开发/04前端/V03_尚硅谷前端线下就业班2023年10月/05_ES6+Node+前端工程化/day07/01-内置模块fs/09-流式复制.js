// 导入模块
const fs = require('fs');
const path = require('path');

// 文件地址
const originFile = path.resolve(__dirname, '../../课堂视频/03-内置模块fs-删除目录和读取目录.wmv');
const targetFile = path.resolve(__dirname, './datas/视频.wmv');

// 创建读取流
const rs = fs.createReadStream(originFile);
// 创建写入取流
const ws = fs.createWriteStream(targetFile);

rs.pipe(ws);


// rs.on('end', () => {
//     console.log('文件复制成功！');
// })

// rs.on('data', chunk => {
//     ws.write(chunk);
// });

