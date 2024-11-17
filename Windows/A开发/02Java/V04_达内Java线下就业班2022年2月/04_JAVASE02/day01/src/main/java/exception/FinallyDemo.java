package exception;

/**
 * finally是异常处理机制的最后一块，它可以直接跟在try后面(这样用较少)或
 * 最后一个catch之后。
 * finally可以保证只要程序执行到try当中，无论try里面的语句是否抛出异常，
 * finally中的代码都必定执行。
 * 通常我们将释放资源这类操作放到finally中，比如IO操作后的关闭。
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String str = "";
            System.out.println(str.length());
            return;//try当中有return也要先执行完finally再结束方法
        }catch(Exception e){
            System.out.println("出错了");
        }finally{
            System.out.println("finally中的代码执行了!");
        }
        System.out.println("程序结束了");
    }
}







