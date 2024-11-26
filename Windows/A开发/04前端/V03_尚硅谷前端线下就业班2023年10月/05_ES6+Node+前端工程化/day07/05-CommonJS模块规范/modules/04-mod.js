// module.exports 添加数据
// module.exports 有个别名 exports      module.exports === exports

// 省略的写法 给 exports 添加属性
exports.username = '小乐';   // 相当于 module.exports.username = '小乐'
exports.password = '123123';  // 相当于 module.exports.password = '123123';

// 修改 exports 的值, exports 与原来的引用就断了，exports 就无法暴露数据了
// exports = [10,20,30,40,50];
