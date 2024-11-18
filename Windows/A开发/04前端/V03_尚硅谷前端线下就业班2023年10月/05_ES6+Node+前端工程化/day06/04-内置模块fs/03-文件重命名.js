// 导入模块
const fs = require('fs');

// 重命名 将a.txt 改成 a.md
// fs.rename('./data/a.txt', './data/a.md', err => {
//     if (err) {
//         console.log('重命名失败！');
//     } else {
//         console.log('重命名成功！');
//     }
// });


// 移动文件的位置
fs.rename('./data/a.md', './a.md', err => {
    if (err) {
        console.log('重命名失败！');
    } else {
        console.log('重命名成功！');
    }
});