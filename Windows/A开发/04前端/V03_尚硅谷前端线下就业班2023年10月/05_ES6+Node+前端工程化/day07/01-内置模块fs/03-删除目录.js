// 导入模块
const fs = require('fs');
const path = require('path');

// 要删除的目录
const dirname01 = path.resolve(__dirname, './datas/images');
const dirname02 = path.resolve(__dirname, './datas/dist');

// 异步方式 删除空目录
fs.rmdir(dirname01, err => {
    if (err) {
        console.log('删除失败：', err.message);
    } else {
        console.log('删除成功！');
    }
});

// 异步方式 删除非空目录使用递归方式
fs.rmdir(dirname02, {recursive: true}, err => {
    if (err) {
        console.log('删除失败：', err.message);
    } else {
        console.log('删除成功！');
    }
});

// 同步方式 删除目录
try {
    fs.rmdirSync(dirname01);
    console.log('删除成功！');
} catch (err) {
    console.log('删除失败：', err.message);
}