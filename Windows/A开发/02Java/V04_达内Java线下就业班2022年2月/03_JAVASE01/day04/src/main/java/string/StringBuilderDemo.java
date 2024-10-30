package string;

/**
 * String的优化导致其必须是不变对象，然而这样就要求字符串不能频繁修改，否则性能
 * 非常差。对此java提供了一个专门优化并用于修改字符串的API:StringBuilder
 * 其内部维护一个可变的char数组，修改性能好开销小，并且提供了修改字符串内容的便捷
 * 操作，除了String本身的方法在这里有提供之外还提供了:增，删，改，插等操作
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //默认无参构造器创建时内部表示一个空字符串，相当于:""
//        StringBuilder builder = new StringBuilder();

        //将给定的字符串内容复制一份到StringBuilder中
        StringBuilder builder = new StringBuilder(str);
        /*
            追加操作:
            好好学习java
            好好学习java,为了找个好工作!
         */
        builder.append(",为了找个好工作!");
        str = builder.toString();
        System.out.println(str);

        /*
            修改内容:
            好好学习java,为了找个好工作!
            好好学习java,就是为了改变世界!
         */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);


        /*
            删除:
            好好学习java,就是为了改变世界!
            ,就是为了改变世界!
         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
            插入:
            ,就是为了改变世界!
            活着,就是为了改变世界!
         */
        builder.insert(0,"活着");
        System.out.println(builder);

        //翻转字符串
        builder.reverse();
        System.out.println(builder);

    }
}
