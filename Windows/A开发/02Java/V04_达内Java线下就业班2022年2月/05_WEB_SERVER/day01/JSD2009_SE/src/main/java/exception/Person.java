package exception;

/**
 * 使用当前类测试异常的抛出
 * throw关键字可以主动抛出一个异常，通常下列情况我们会向方法外抛出异常:
 * 1:当前方法出现了一个异常，但是该异常不应当在当前方法中被处理时我们可以
 *   将其抛出给调用者解决。
 * 2:当前方法遇到了一个满足语法(程序可以运行),但是不满足业务问题时，可以
 *   主动实例化一个异常抛出给调用者告知这样操作不对。
 * 当前Person中我们以第二种方式演示异常的抛出
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
//            throw new RuntimeException("年龄不合法");
            /*
                通常一个方法中使用throw抛出一个异常时就要在当前方法上
                使用throws声明该异常的抛出告知调用者。只有RuntimeException
                是一个例外。
             */
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
