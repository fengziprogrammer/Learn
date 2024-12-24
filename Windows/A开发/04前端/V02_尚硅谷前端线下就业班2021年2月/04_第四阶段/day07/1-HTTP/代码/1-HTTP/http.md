### 本资源由 itjc8.com 收集整理
HTTP

## 请求报文
1. 请求行
2. 请求头
3. 空行
4. 请求体
```
请求行          GET https://www.baidu.com/ HTTP/1.1
请求头          Accept: text/html, application/xhtml+xml, image/jxr, */*
               Accept-Language: zh-Hans-CN,zh-Hans;q=0.5  (q 喜好系数)
               User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; rv:11.0) like Gecko
               Accept-Encoding: gzip, deflate
               Host: www.baidu.com
               Connection: Keep-Alive
               Cookie: ispeed_lsm=10; COOKIE_SESSION=32033820_0_3_3_2_7
空行
请求体
```
### 请求行
```
GET https://www.baidu.com/ HTTP/1.1
```
* GET                       请求方式  GET, POST  <form method="POST">
* https://www.baidu.com/    URL(统一资源定位符)
* HTTP/1.1                  HTTP协议版本   

URL 
```  
https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1#logo
```
* https                     协议部分. http  ftp  mongodb ssh
* www.baidu.com             主机名(域名、IP地址)   192.168.1.25
* /s                        路径部分  
* ie=utf-8&f=8&rsv_bp=1     查询字符串部分
* #logo                     锚点

### 请求头
格式:  `头名: 头值`

* Accept            接受的内容的类型
* Accept-Language   接受的语言
* User-Agent        用户代理(客户端的字符串标记)
* Accept-Encoding   接受的压缩方式 
* Host              主机名
* Connection        连接  Keep-Alive 保持连接  close 关闭
* Cookie            小甜饼 (自动携带当前主机下的 cookie 向服务器发送请求)

### 请求体
内容非常灵活
```
123
为loveyou
1u2o31hjoire1hjr2oi1je1oie2joi

login_email=779498590@qq.com&login_password=GREM9pus.fek-soos
```

## HTTP 响应报文
* 响应行
* 响应头
* 空行
* 响应体
```
响应行          HTTP/1.1 200 OK
响应头          Bdpagetype: 1                               (百度服务器自定的响应头  不知道)
                a: 100
                b: 200
                Bdqid: 0xfd96f92900160379                   (编号)
                Cache-Control: private
                Connection: keep-alive
                Content-Type: text/html;charset=utf-8
                Date: Mon, 28 Sep 2020 02:07:55 GMT
                Expires: Mon, 28 Sep 2020 02:07:15 GMT
                Server: BWS/1.1
                Set-Cookie: BDSVRTM=0; path=/
                Set-Cookie: BD_HOME=1; path=/
                Set-Cookie: H_PS_PSSID=32815_3261; path=/; domain=.baidu.com
                Strict-Transport-Security: max-age=172800
                Traceid: 1601258875064046285818273066492592784249
                X-Ua-Compatible: IE=Edge,chrome=1
                Content-Length: 286000
空行
响应体           <!DOCTYPE html><!--STATUS OK-->
                <html><head><meta http-equiv="Content-Type" content="text/html;charset=utf-8"><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><meta content="always" name="referrer"><meta name="theme-color" content="#2932e1"><meta name="description" content="全球最大的中文搜索引擎、致力于让网民更便捷地获取信息，找到所求。百度超过千亿的中文网页数据库，可以瞬间找到相关的搜索结果。"><link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" /><link rel="search" type="application/opensearchdescription+xml" href="/content-search.xml" title="百度搜索" /><link rel="icon" sizes="any" mask href="//www.baidu.com/img/
```

### 响应行
```
HTTP/1.1 200 OK
```
* HTTP/1.1  HTTP协议的版本号
* 200       响应状态码 200 OK  404 找不到  500 服务器内部错误
* OK        状态字符串

状态码与状态字符串一般是一一对应的.

### 响应头
格式:  『头名: 头值』
* Cache-Control     缓存控制  private 私有  public
* Connection        连接设置  keep-alive  
* Content-Type      『响应体』数据的内容类型
* Date              响应时间
* Expire            设定缓存失效的时间
* Server            服务, 表明服务器所使用技术
* Set-Cookie        设定 cookie 的
* Strict-Transport-Security    严格安全传输  
* Traceid           编号ID
* X-Ua-Compatible: IE=Edge,chrome=1       
* Content-Length    响应体长度(字节)

### 响应体
内容格式非常的灵活


## 复盘
1. 请求报文 (行头体)
* 请求行   GET   http://www.baidu.com/s   HTTP/1.1
* 请求头   Host: www.baidu.com
           User-Agent: chrome firefox IE
           name: fangfang
           height: 165cm
* 请求体    
           内容格式灵活  123  abc 

2. 响应报文(行头体) 
* 响应行   HTTP/1.1  200  OK 
* 响应头   Content-Type: text/html;charset=utf-8
          Connection: keep-alive
          Date: s123123123
          abc: 100
          def: 200
* 响应体  
          内容格式灵活
          HTML
          CSS
          JS
          XML
          JSON
          图片
          字体

> 请求头和响应头中不能使用『中文』

3. 网页加载过程不是一次性的. 而是循序渐进的
   1. 第一次先获取 HTML 内容的数据
   2. 遇到 link 标签, 发送 HTTP 请求获取 CSS 资源
   3. 遇到 script 标签, 发送 HTTP 请求获取 JavaScript 资源
   4. 遇到 img 标签, 发送 HTTP 请求获取 图片 资源
   5. iframe frameset

4. 一定要掌握住, 使用chrome网络控制台查看请求与响应的详细内容 ********

### 常用 HTTP 端口
* 8000
* 8888
* 3000
* 9999
* 8080
默认端口 80

### 127.0.0.1
该 IP 地址永远指向本机