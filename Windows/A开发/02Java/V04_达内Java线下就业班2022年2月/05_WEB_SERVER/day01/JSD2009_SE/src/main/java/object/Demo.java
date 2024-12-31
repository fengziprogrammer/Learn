package object;

/**
 * 测试Object中经常被重写的两个方法:toString和equals
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /*
            开发中将一个对象内容输出到控制台的操作很频繁，而这个方法输出对象
            时输出的是这个对象toString方法返回的字符串。
            Object中定义了这个方法，所以java中所有的类都有toString,但如果
            不妥善重写，则使用Object提供的该方法时返回的字符串格式为:
            类名@地址。这个对我们开发的帮助不大

            注:java API提供类大多已经重写了toString方法，通常只有我们自己
            定义类在使用它不理想时需要自行重写这个方法

         */
        System.out.println(p);
        /*
            java中任何类型与字符串连接结果都是字符串，而实际操作是会将调用
            该类型实例的toString方法并将返回的字符串与字符串进行连接操作。
         */
        String line = "这个对象是" + p;
        System.out.println(line);

        /*
            Object提供的另一个方法equals，目的是比较两个对象的"内容"是否
            相同。
            对于引用类型变量而言保存的是对象的地址，"=="是比较变量的值，因此
            就是比较地址，只有两个引用类型变量保存的地址相同(指向同一个对象)时
            才会为true。
            而equals并不关心他们是否为同一个对象，判断的是他们的内容是否相同

            注:Object的equals内部用"=="实现，因此如果子类不重写这个方法则
            没有意义。

         */
        Point p2 = new Point(1,2);
        System.out.println(p==p2);//比地址,判定是否为同一个对象
        System.out.println(p.equals(p2));


    }
}





