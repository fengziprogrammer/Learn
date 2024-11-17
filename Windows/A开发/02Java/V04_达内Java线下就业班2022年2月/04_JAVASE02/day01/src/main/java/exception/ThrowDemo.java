package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        Person p = new Person();
        /*
            当我们调用一个含有throws声明异常抛出的方法时，编译器要求必须
            处理这个异常，处理方式有两种:
            1:使用try-catch捕获该异常
            2:在当前方法上继续使用throws声明这个异常的抛出
            具体选取那种取决于异常处理的责任问题
         */
        try {
            p.setAge(10000);//满足语法，但是不满足业务逻辑
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("他今年:"+p.getAge()+"岁");
        System.out.println("程序结束了!");
    }
}
