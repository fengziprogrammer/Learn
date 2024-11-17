package apidoc;

/**
 *  文档注释是功能级注释，在类上，方法上，常量上使用
 *
 *  在类上使用时说明当前类的功能，设计意图等
 *
 * @author Xiloer
 */
public class ApiDocDemo {
    /**
     * sayHello方法中的问候语
     */
    public static final String INFO = "你好!";

    /**
     * 对给定的用户添加一个问候语
     * @param name 指定的用户的名字
     * @return  含有问候语的字符串
     */
   public String sayHello(String name){
       return "你好!"+ name;
   }
}










