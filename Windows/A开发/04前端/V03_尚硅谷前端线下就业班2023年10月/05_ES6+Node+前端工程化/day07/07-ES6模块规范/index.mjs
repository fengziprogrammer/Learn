// ES语法 导入内置模块 fs
import {readFile, writeFile, appendFile} from 'node:fs'
writeFile('data.txt', 'hello', err=>{});

// 将模块中暴露的数据全部获取
import * as fs from 'node:fs';
fs.writeFile('data1.txt', 'hello world', err=>{})
