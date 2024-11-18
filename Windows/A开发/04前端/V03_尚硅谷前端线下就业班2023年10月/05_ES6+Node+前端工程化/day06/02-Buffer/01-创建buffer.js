// 创建Buffer
const b1 = Buffer.alloc(12);
const b2 = Buffer.alloc(10, 0x20);
const b3 = Buffer.alloc(10, 'a');
const b4 = Buffer.alloc(10, 257);

// 创建不安全的 buffer
const b5 = Buffer.allocUnsafe(12);

// 通过数组和字符串创建buffer
const b6 = Buffer.from('hello 高小乐');
const b7 = Buffer.from([1,2,3,'乐']);

console.log(b1);
console.log(b2);
console.log(b3);
console.log(b4);
console.log('');

console.log(b5);
console.log(b6);
console.log(b7);