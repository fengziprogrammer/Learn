// 创建 buffer
const b = Buffer.from('Hello 高小乐');

console.log(b);
console.log(b[0]);
console.log(b[6]);
console.log('');

b.forEach((item,index) => {
    console.log(item, index);
});
console.log('');


console.log(b.toString());