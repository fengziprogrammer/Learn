// 通过 给 moudle.exports 赋值暴露数据
const obj = {
    name: '小乐',
    age: 19,
    say() {
        console.log(this.name);
    }
}

// 后面的覆盖前面的
module.exports = 100;
module.exports = [10,20,30,40,50,60];
module.exports = obj;