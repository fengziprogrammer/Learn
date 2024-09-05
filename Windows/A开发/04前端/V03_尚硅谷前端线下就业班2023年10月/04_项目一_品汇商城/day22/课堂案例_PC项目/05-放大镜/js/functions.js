// 函数库

/**
 * 获取元素的计算属性
 * @param Elment ele 元素
 * @param String attr css属性名
 * @param String 计算属性值
 */
 function getStyle(ele, attr) {
    if (window.getComputedStyle) {
       return  getComputedStyle(ele)[attr];
    } else {
       return ele.currentStyle[attr];
    }  
}


/**
 * 实现选项卡的函数
 * @param NodeList 选项卡标题的集合
 * @param NodeList 选项卡内容的集合
 */
function tab(tabNavItems, tabContentItems) {
   // 遍历 给每个导航监听事件
   tabNavItems.forEach(function(tabNavItem, index) {
      tabNavItem.onclick = function() {
          // 排他 所有的导航和内容取消选中
          for (var i = 0; i < tabNavItems.length; i ++) {
              tabNavItems[i].classList.remove('active');
              tabContentItems[i].classList.remove('active');
          }
          // 当前点击的导航和内容选中
          tabNavItem.classList.add('active');
          tabContentItems[index].classList.add('active');
      }
  });
}