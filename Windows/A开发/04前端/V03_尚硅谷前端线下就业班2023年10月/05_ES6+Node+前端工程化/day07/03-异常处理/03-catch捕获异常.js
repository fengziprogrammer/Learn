try {
    // 系统报错  调用不存在的函数
    getInfo();

    // 主动抛出的错误
    // throw new Error('xiaole is not defiend');
} catch (err) {
    console.log('捕获到错误：', err.errno, err.message);
}

console.log('');
console.log('try catch 后面的语句！');