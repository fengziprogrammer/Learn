// 监听主线程发过来的数据
onmessage = function(event) {

    //console.log('接收到主线程数据了：', event);

    // 根据接收到的数据进行计算
    var res = event.data[0] + event.data[1];

    // 将数据发送到主线程
    postMessage(res);
};
