//文件夹操作
const fs = require('fs');

//创建文件夹
// fs.mkdir('./html', err => {
//     if(err) throw err;
//     console.log('创建成功');
// });

//读取文件夹 read 读取  dir 文件夹
// fs.readdir('./project', (err, files) => {
//     if(err) throw err;
//     //输出文件夹下的『文件列表』
//     console.log(files);
// });

fs.readdir('d:/', (err, files) => {
    if(err) throw err;
    //输出文件夹下的『文件列表』
    console.log(files);
});

//删除文件夹
// fs.rmdir('./project', {recursive: true},err => {
//     console.log(err);
// });