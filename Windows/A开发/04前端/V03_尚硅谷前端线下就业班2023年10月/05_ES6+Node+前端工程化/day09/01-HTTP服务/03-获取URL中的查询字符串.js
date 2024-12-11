// 导入模块
const http = require('http');
const url = require('url');


// 创建服务
const server = http.createServer((req, res) => {
    if (req.url === '/favicon.ico') {
        return res.end();
    }

    // 第一种方式 解析url
    const urlInfo =  url.parse(req.url, true);
    // console.log(urlInfo.query);

    // 第二种方式 解析 url
    // const urlInfo = new URL('http://127.0.0.1/' + req.url);
    // console.log(urlInfo.searchParams);
    // console.log(urlInfo.searchParams.get('a'));
    // console.log(urlInfo.searchParams.get('b'));

    // 设置响应的内容
    const content = `
    <h1>恭喜您，提交成功！</h1>
    <p>wd: ${urlInfo.query.wd}</p>
    <p>type: ${urlInfo.query.type}</p>
    <p>origin: ${urlInfo.query.origin}</p>
    `;

    // 设置响应头
    res.setHeader('Content-type', 'text/html;charset=utf-8');
    // 做出响应
    res.end(content);
});

// 启动服务
server.listen(8080, () => {
    console.log('http server is runing on 8080');
});