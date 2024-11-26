// 导入模块
const fs = require('fs');
const path = require('path');

// 要读取目录的地址
const dirname = path.resolve(__dirname, './datas');

// // 异步方式 读取目录
fs.readdir(dirname, (err, data) => {
    if (err) {
        console.log('读取失败：', err.message);
    } else {
        for (let basename of data) {
            // console.log(basename);
            // console.log(path.resolve(dirname, basename));
            let filename = path.resolve(dirname, basename);
            fs.rmdir(filename, err => {
                if (err) {
                    console.log(filename + '删除失败！');
                } else {
                    console.log(filename + '删除成功！');

                }
            });
        }
    }
});

// 同步方式 读取目录
// try {
//     const files = fs.readdirSync(dirname);
//     console.log(files);
// } catch (err) {
//     console.log('读取失败：', err);
// }