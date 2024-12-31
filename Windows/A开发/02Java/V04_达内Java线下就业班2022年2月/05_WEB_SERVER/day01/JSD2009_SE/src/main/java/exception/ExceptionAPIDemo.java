package exception;

/**
 * 异常常见的方法
 */
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");

        String str = "a";
        try{
            System.out.println(Integer.parseInt(str));
        }catch(Exception e){
            //向控制台输出错误信息，便于debug
            e.printStackTrace();
            //获取异常消息，通常用来给用户提示
            System.out.println(e.getMessage());
        }

        System.out.println("程序结束了...");
    }
}
