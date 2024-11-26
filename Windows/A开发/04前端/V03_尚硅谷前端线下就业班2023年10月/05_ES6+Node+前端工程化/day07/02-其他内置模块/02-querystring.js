// 导入模块
const qs = require('querystring');

// 定义查询字符串
const searchData = 'name=xiaole&age=101&address=上海';

// 将查询字符串解析成对象
console.log(qs.parse(searchData));
console.log('');

// 将对象转为查询字符串的形式
const user = {
    uasername: 'xiaolle',
    password: 666666,
    email: 'xiaole@qq.com',
    // drink() {}
};

console.log(qs.stringify(user));



