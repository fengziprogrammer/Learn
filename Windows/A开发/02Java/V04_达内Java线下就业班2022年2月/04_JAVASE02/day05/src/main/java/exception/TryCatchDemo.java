package exception;

/**
 * java异常处理机制中的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try {
//            String line = null;
//            String line = "";
            String line = "a";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
            //try语句块中报错语句以后的内容都不会执行
            System.out.println("!!!!!!!!!!");
        }catch(NullPointerException e){//try中代码不出错，catch不执行
            System.out.println("出现了空指针!");
        }catch(StringIndexOutOfBoundsException e){//catch可以写多个
            System.out.println("出现了下标越界!");
        /*
            catch如果捕获的是一个超类型的异常时，那么try中出现它的类型
            异常时都可以用这个catch进行捕获。通常以下情况我们会这样:
            1:多种异常使用同一种解决手段时，可以捕获这些类异常的超类。
            2:最终捕获Exception可以避免因为一个未捕获的异常导致程序中断

            多个catch的异常若存在继承关系，一定先捕获子类型异常，再捕获
            超类型异常。否则编译不通过。
         */
        }catch(Exception e){
            System.out.println("反正就是出了个错!");
        }
        System.out.println("程序结束了!");
    }
}
