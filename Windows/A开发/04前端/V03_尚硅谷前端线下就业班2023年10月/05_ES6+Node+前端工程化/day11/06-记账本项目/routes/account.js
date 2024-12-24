var express = require('express');
const path = require('path');
var router = express.Router();

// lowdb相关
const low = require('lowdb')
const FileSync = require('lowdb/adapters/FileSync')
const adapter = new FileSync(path.resolve(__dirname, '../dbs', 'db.json'));
const db = low(adapter)

// 生成唯一id的模块
const shortid = require('shortid');

// 账单列表
router.get('/', (req, res) => {
    // 从 lowdb 中取出数据
    const data = db.get('accounts').value();

    // 渲染模板 发送数据
    res.render('account/index', {data});
});

// 添加账单的表单
router.get('/create', (req, res) => {
    // 渲染模板
    res.render('account/create');
});

// 执行添加
router.post('/create', (req, res) => {
    // 创建一个唯一id
    const id = shortid.generate();
    // 向lowdb 添加数据
    db.get('accounts').unshift({id, ...req.body}).write();
    // 渲染成功页面
    res.render('account/success', {title:'账单添加成功~~~', url:'/account'});
});

// 执行删除
router.get('/delete/:id', (req, res) => {
    // 获取id
    const id = req.params.id;
    // 从 lowdb 中删除指定数据
    db.get('accounts').remove({id}).write();
    // 渲染成功的模板
    res.render('account/success', {title:'账单删除成功~~~', url:'/account'});
});

module.exports = router;
