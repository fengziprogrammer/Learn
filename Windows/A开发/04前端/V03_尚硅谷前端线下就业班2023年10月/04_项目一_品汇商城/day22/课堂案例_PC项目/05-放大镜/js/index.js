// 放大镜
(function() {
    // 获取相关元素
    var zoomBox = document.querySelector('#zoomBox');   // 放大镜外层包裹元素
    var smallImageBox = zoomBox.querySelector('.small-image');  // 小图包裹元素
    var largeImageBox = zoomBox.querySelector('.large-image');  // 大图包裹元素
    var maskBox = zoomBox.querySelector('.mask-box');  // 半透明蒙层

    // 监听鼠标进入小图区域的事件
    smallImageBox.onmouseenter = function() {
        // 蒙层显示
        maskBox.style.display = 'block';
        // 大图显示
        largeImageBox.style.display = 'block';
    };

    // 监听鼠标在小图区域移动事件
    smallImageBox.onmousemove = function(event) {
        // 获取鼠标在小图区域的位置  鼠标在视口上的位置 - 小图元素在视口上的位置
        var left = event.clientX - smallImageBox.getBoundingClientRect().left;
        var top = event.clientY - smallImageBox.getBoundingClientRect().top;

        // 根据鼠标在小图区域的位置，计算蒙层的位置 减去蒙层尺寸的一半
        left -= maskBox.offsetWidth / 2;
        top -= maskBox.offsetHeight / 2;

        // 限制蒙层的位置
        if (left < 0) {
            left = 0;
        } else if (left > smallImageBox.clientWidth - maskBox.offsetWidth) {
            left = smallImageBox.clientWidth - maskBox.offsetWidth;
        }

        if (top < 0) {
            top = 0;
        } else if (top > smallImageBox.clientHeight - maskBox.offsetHeight) {
            top = smallImageBox.clientHeight - maskBox.offsetHeight;
        }

        // 调整蒙层的位置
        maskBox.style.left = left + 'px';
        maskBox.style.top = top + 'px';

        // 调整大图的位置
        largeImageBox.scrollLeft = left * 2;
        largeImageBox.scrollTop = top * 2;
    };

    // 监听鼠标离开小图区域的事件
    smallImageBox.onmouseleave = function() {
        // 蒙层隐藏
        maskBox.style.display = 'none';
        // 大图隐藏
        largeImageBox.style.display = 'none';
    };

})();

