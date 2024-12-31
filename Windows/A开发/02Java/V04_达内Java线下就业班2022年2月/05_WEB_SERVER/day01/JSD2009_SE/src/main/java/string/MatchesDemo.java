package string;

/**
 * 字符串支持正则表达式的方法一:
 * boolean matches(String regex)
 * 使用给定的这则表达式验证当前字符串的格式，匹配则返回true
 * 注:无论给定的正则表达式是否添加了边界匹配符"^$"都是做全匹配验证的
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "fancq@tedu.cn";
        /*
            email的正则表达式
            [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}
