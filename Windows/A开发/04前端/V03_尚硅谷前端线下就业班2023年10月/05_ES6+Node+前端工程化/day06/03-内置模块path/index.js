// 引入模块
const path = require('path');

// join 拼接路径 会正确使用当前系统的路径分隔符，类Unix系统是"/"，Windows系统是"\"。
console.log(path.join('./images', 'data'));
console.log(path.join(__dirname, 'data', './images/banner_images'));
console.log(path.join(__dirname, 'data', '../images/banner_images'));
console.log('');

// isAbsolute() 判断是否是绝对路径
console.log(path.isAbsolute('./images/100.jpg'));
console.log(path.isAbsolute(__filename));
console.log('');


console.log('路径中的目录部分：', path.dirname(__filename));
console.log('路径中的文件名部分：', path.basename(__filename));
console.log('路径中的扩展名部分：', path.extname(__filename));
console.log('');


console.log(path.resolve('./images', 'data'));
console.log('');