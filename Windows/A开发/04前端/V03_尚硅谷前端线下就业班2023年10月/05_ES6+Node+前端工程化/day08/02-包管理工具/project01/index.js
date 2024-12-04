// 使用第三方包
/*
    1. 先找是否存在内置模块 lodash
    2. 再从当前目录中的 node_modules 里面找 lodash
    3. 如果没有，会从上级目录的 node_modules 里面找 lodash， 一直向上找
    4. 最后会找全局 node_modules

*/
const _ = require('lodash');
const chalk = require('chalk');
const uniq = require('uniq');
const converbyte = require('converbyte');


const arr = [1,2,3,4,5,6,7,8,9,10];
console.log(_.chunk(arr, 3));

console.log(chalk.red('高小乐一口水喝掉一个太平洋！'));
console.log(chalk.bgRed('高小乐一顿饭吃一头猪！'));

console.log(uniq([10,20,30,40,50,40,30,30,20]));

console.log(converbyte(3445454545, 3).toFixed(2) + 'GB');




