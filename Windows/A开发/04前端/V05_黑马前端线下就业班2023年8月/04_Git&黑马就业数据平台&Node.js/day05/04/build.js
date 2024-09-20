/**
 * 目标一：压缩 html 里代码
 * 需求：把 public/index.html 里的，回车/换行符去掉，写入到 dist/index.html 中
 *  1.1 读取 public/index.html 内容
 *  1.2 使用正则替换内容字符串里的，回车符\r 换行符\n
 *  1.3 确认后，写入到 dist/index.html 内
 */
const fs = require('fs')
const path = require('path')
// 1.1 读取 public/index.html 内容
const url = path.join(__dirname, 'public/index.html')
// console.log(url)
fs.readFile(url, (err, data) => {
  if (err) {
    return console.log('读取错误')
  }
  // console.log(data.toString())
  // 1.2 使用正则替换内容字符串里的，回车符\r 换行符\n
  const str = data.toString().replace(/[\r\n]/g, '')
  // console.log(str)
  // 1.3 确认后，写入到 dist/index.html 内
  fs.writeFile(path.join(__dirname, 'dist/index.html'), str, err => {
    if (!err) console.log('写入成功')
  })
})
