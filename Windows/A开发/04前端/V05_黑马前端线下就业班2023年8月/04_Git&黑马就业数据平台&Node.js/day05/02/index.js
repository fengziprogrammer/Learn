/**
 * 目标：写入 try.txt 文件内容
 */
// 1. 引入 fs模块
const fs = require('fs')
// console.log(fs)

// 2. 写入文件 => 如果不存在这个文件,则会创建
fs.writeFile('../test.txt', '你好 node', err => {
  // console.log(err) // 如果写入 成功了 那么 err 参数就会是null
  if (err !== null) console.log('写入失败')
})

// 3. 读取文件
// fs.readFile('./try.txt', (err, data) => {
//   if (err) {
//     console.log(err)
//   } else {
//     console.log(data.toString())
//   }
// })

// cls 是cmd 的清屏命令