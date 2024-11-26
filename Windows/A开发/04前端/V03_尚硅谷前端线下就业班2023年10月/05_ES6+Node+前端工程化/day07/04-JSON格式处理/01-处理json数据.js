// 导入模块
const fs = require('fs');
const path = require('path');

fs.readFile(path.resolve(__dirname, './data01.json'),'utf-8', (err, data) => {
    if (err) {
        console.log('读取文件失败：', err.message);
    }
    
    // 将json格式的字符串 解析成 对象
    const obj = JSON.parse(data);
    console.log(obj);
    console.log(obj.age);
    console.log(obj.child[2]);
    console.log('');
    console.log('');
});


fs.readFile(path.resolve(__dirname, './data02.json'), 'utf-8', (err, data) => {
    if (err) {
        console.log('文件读取失败：', err.message);
    }
    
    // 将json格式的字符串 解析成 对象
    const users = JSON.parse(data);

    console.log(users);
    users.forEach(user => {
        console.log(user);
    });
});