// 使用ES6模块的语法 导入内部模块
import * as fs from 'node:fs';
fs.writeFile('data1.txt', 'hello world', err=>{});


// 1 导入模块   模块中使用 export default 关键字暴露了一个数据
import mod01 from './modules/01-mod.js';
console.log(mod01);
mod01.say();
console.log('');
console.log('');


// 2 导入模块 模块中使用 export 关键字暴露多个数据
import {user, data as datas} from './modules/02-mod.js';
import {getMessage} from './modules/02-mod.js';
console.log(user);
console.log(datas);
console.log(getMessage);
// 将模块中暴露的所有数据导出到一个对象
import * as mod02 from './modules/02-mod.js';
console.log(mod02);
console.log('');
console.log('');


// 3. 导入模块 块中使用 export 关键字暴露多个数据，是合并到一块暴露的
import {num01,num03} from './modules/03-mod.js';
console.log(num01);
console.log(num03);
import * as num from './modules/03-mod.js';
console.log(num);
console.log('');
console.log('');


// 4. 导入模块 整个目录作为模块
import mod04 from './modules/mod04/index.js';
console.log(mod04);
