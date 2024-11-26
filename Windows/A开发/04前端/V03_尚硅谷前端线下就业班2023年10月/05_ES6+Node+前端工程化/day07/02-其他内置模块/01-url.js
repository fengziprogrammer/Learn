// 导入模块
const url = require('url');

// 定义url
const siteAddress = 'https://learn.fuming.site:8888/front-end/node/add.html?name=xiaol&age=101#nav';
console.log(siteAddress);
console.log('');


// 解析网址
const urlData = url.parse(siteAddress);
console.log(urlData);
console.log(urlData.query);
console.log('');

// 解析网址
const urlInfo = new url.URL(siteAddress);
console.log(urlInfo);
console.log(urlInfo.searchParams);