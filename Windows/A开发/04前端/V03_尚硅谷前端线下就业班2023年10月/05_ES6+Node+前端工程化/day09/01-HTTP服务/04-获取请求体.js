// 导入模块
const http = require('http');
const qs = require('querystring');
const path = require('path');
const fs = require('fs');

// 创建服务
const server = http.createServer((req, res) => {
    if (req.url === '/favicon.ico') {
        return res.end();
    }

    // 定义字符串 用于拼接请求体
    let reqBody = '';

    // 给请求对象监听 data 事件   请求对象本质上就是以读取流
    req.on('data', chunk => {
        // += 会让 buffer 自动转为 string
        reqBody += chunk;
    });

    // 给请求对象监听 end 事件
    req.on('end', () => {
        // 处理请求体数据 得到对象
        const body = qs.parse(reqBody)
        // 定义文件中要存储的信息
        const content = `
        姓名： ${body.name}
        邮箱： ${body.email}
        电话： ${body.phone}
        生日： ${body.birthday}
        留言：
        ${body.message};
        `;
        // 定义文件名 将请求体信息存储到文件中
        const filename = path.resolve(__dirname, './dbs', req.socket.remoteAddress.slice(7) + '.txt')
        // 写入文件
        fs.writeFile(filename, content, err => {
            if (err) {
                // 设置响应头
                res.setHeader('Content-type', 'text/html;charset=utf-8');
                // 做出响应
                res.end('<h2>很遗憾！表单提交失败！</h2>');

            } else {
                // 设置响应头
                res.setHeader('Content-type', 'text/html;charset=utf-8');
                // 做出响应
                res.end('<h2>恭喜您！表单提交成功！</h2>');
            }
        });
    })

   
});

// 启动服务
server.listen(8080, () => {
    console.log('http server is runing on 8080');
});