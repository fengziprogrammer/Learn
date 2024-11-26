/*
    模块中暴露数据：
    ① 模块默认暴露的数据是个空对象
    ② 在模块中 给 module.exports 赋值， 它的值就是暴露的数据
    ③ 在模块中 给 module.exports 添加属性，实现暴露多个数据
    ④ 在模块中 给 exports （exports 是 module.exports 的别名）添加属性，实现暴露多个数据； 不能给 exports 重新赋值
    总结：
    module 是模块中的内置对象，具有属性 exports， module.exports 的初始值是个空对象， module.exports 的值就是该模块要暴露的数据
    变量 exports 和 module.exports 指向同一个对象



*/

// 导入模块
// 1. 模块中没有暴露数据，require() 返回空对象；  require()多次，但是模块只有第一次导入，模块代码执行一遍，后面都是换成
require('./modules/01-mod.js');
require('./modules/01-mod.js');
require('./modules/01-mod.js');
const mod01 = require('./modules/01-mod.js');
console.log(mod01);
console.log('');
console.log('');

// 2. 模块中可以通过给 module.exports 赋值实现暴露数据
const mod02 = require('./modules/02-mod.js');
console.log(mod02);
mod02.say();
// 如果模块暴露的数据是个对象 导入模块的时候可以使用解构赋值
const {name,age,say} = require('./modules/02-mod');
console.log(age);
say();
console.log('');
console.log('');


// 3, 模块中可以 给 module.exports 添加属性，可以暴露多个数据
// 导入模块会得到一个对象，暴露的多个数据都是对象的属性
const mod03 = require('./modules/03-mod');
console.log(mod03);
mod03.getMessage();
console.log('');
console.log('');


// 4，模块中可以 给 exports 添加属性，可以暴露多个数据; 但是不能给 exports 重新赋值
const mod04 = require('./modules/04-mod');
console.log(mod04);
console.log('');
console.log('');


// 5 导入 json 得到根据json数据解析出来的对象
const mod05 = require('./modules/05-mod');
console.log(mod05);
console.log('');
console.log('');


// 6 导入一个扩展名不是 .js、.json、.node 的模块文件
const mod06 = require('./modules/06-mod.sb');
console.log(mod06);
console.log('');
console.log('');



// 7 整个目录作为模块  在目录中的 pageage.son 中设置入口文件
const mod07 = require('./modules/07-mod');
console.log(mod07);
console.log('');
console.log('');


// 8. 整个目录作为模块,目录中没有配置入口文件，默认找 index.js 作为入口文件
const mod08 = require('./modules/08-mod');
console.log(mod08);
console.log('');
console.log('');

