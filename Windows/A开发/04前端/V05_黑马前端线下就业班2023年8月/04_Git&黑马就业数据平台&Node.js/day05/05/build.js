/**
 * 目标二：压缩 js 里代码，并整合到 html 中一起运行
 *  2.1 读取 public/index.js 内容
 *  2.2 使用正则替换内容字符串里的，回车符\r 换行符\n 打印语句console.log('xxx');
 *  2.3 确认后，拼接 html 内容写入到 dist/index.html 内
 */
const fs = require('fs')
const path = require('path')
const url = path.join(__dirname, 'public/index.html')
fs.readFile(url, (err, data) => {
  if (err) return console.log('读取错误')
  let str = data.toString().replace(/[\r\n]/g, '')

  // 2.1 读取 public/index.js 内容
  fs.readFile(path.join(__dirname, 'public/index.js'), (err, data) => {
    // console.log(data.toString())
    // 2.2 使用正则替换内容字符串里的，回车符\r 换行符\n 打印语句console.log('xxx');
    const strJs = data.toString().replace(/[\r\n]/g, '').replace(/console.log\('.+?'\);/g, '')
    // console.log(strJs)
    // 2.3 确认后，拼接 html 内容写入到 dist/index.html 内
    str += `<script>${strJs}</script>`
    fs.writeFile(path.join(__dirname, 'dist/index.html'), str, err => {
      if (!err) console.log('写入成功')
    })
  })
})
