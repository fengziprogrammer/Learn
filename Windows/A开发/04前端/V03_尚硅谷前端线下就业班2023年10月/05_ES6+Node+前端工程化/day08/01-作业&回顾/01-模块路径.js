const fs = require('fs');
const add = require('./add.js');

fs.readFile('./data.txt', 'utf-8', (err, data) => {
    if(err) {
        console.log('文件读取失败：', err.message);
        return;
    }
    console.log(data);
});

console.log(add(100,200));;
console.log('');


