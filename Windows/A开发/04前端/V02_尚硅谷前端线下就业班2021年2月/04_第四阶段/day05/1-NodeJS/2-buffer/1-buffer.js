//Buffer 的声明创建
const buf_1 = Buffer.alloc(10);
const buf_2 = Buffer.allocUnsafe(10);
const buf_3 = Buffer.from('iloveyou');// from 来自
// console.log(buf_3);

//Buffer内容的读取和设置
//获取第一个字节的内容  105 对应的字符是多少
// console.log(buf_3[0]);
//1. 通过数字获取对应的 ASCII 字符
console.log(String.fromCharCode(105));
//2. 通过 ASCII 字符获取对应的编号
// console.log('a'.charCodeAt());
//将 Buffer 转化成字符串
// console.log(buf_3.toString());
//设置
// buf_3[0] = 99;
// console.log(buf_3.toString());

//关于溢出   舍弃高于 8 位的内容  ‭0001 0010 1100‬  =>  0010 1100‬  => 
// buf_3[0] = 300;
// console.log(buf_3.toString());

//关于中文 一个UTF-8中文字符占据三个字节
// const buf_4 = Buffer.from('我爱你');
// console.log(buf_4);

//字符集
// 1010101001    =>   356

// ASCII 
 
//     ||
//     ||
//     \/

// ASCII 扩展表(128-255)

//     ||
//     ||
//     \/

// 双字节码表
// * gbk
// * gb2312
// * big5

//     ||
//     ||
//     \/

// 万国码(unicode)
// 编码方式
// * utf-8
// * utf-16  

//unicode 表示
// let str = '\u6211\u7231\u4F60';//
// console.log(str);



