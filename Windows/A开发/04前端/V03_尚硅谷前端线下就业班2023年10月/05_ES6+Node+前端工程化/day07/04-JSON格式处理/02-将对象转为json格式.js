// 导入模块
const fs = require('fs');
const path = require('path');
const url = require('url');

const siteAddress = 'https://learn.fuming.site:8888/front-end/node/add.html?name=xiaol&age=101#nav';
const urlObj = url.parse(siteAddress);

// 将对象处理成 json 格式的字符串
const jsonStr = JSON.stringify(urlObj);

// 将 json 字符串写入文件
fs.writeFile(path.resolve(__dirname, './data03.json'), jsonStr, err => {
    if (err) {
        console.log('文件写入失败：', err.message);
    } else {
        console.log('文件写入成功！');
    }
});