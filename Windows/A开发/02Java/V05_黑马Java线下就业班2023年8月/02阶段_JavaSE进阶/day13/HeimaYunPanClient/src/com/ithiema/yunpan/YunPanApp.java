package com.ithiema.yunpan;
// 客户端入口
public class YunPanApp {
    public static void main(String[] args) {
        // 创建客户端  浏览, 上传 , 下载 业务逻辑类
        FileUpDownService service = new FileUpDownServiceImp();
        // 启动客户端
        service.start();
    }
}
