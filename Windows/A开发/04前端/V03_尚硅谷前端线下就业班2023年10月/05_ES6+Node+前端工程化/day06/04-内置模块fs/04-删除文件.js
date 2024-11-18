const fs = require('fs');

fs.unlink('./a.md', err => {
    if (err) {
        console.log('文件删除失败！');
    } else {
        console.log('文件删除成功！');
    }
})