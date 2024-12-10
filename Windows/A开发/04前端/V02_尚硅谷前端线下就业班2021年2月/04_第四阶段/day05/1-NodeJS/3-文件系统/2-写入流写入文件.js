//1. 引入 fs 模块
const fs = require('fs');

//2. 创建写入流对象
// const ws = fs.createWriteStream('./home.html');
const ws = fs.createWriteStream('./home.js');

//3. 执行写入
// ws.write('<html>');
// ws.write(`
//     <head>
//         <title>这是一个脚本创建的文件哦</title>
//     </head>
//     <body>
//         <h1>哎呦 不错哦~</h1>
//     </body>
// `)
// ws.write('</html>');

ws.write(`
    const body = document.body;
    body.style.background = 'pink';
    setTimeout(() => {
        alert('恭喜中奖啦!!!');
    }, 1000);
`)

//4. 关闭写入流
ws.close();