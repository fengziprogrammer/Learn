package integer;

/**
 * JDK1.5推出时推出了一个新的特性:自动拆装箱
 * 该特性是编译器认可的而不是java虚拟机，当编译器在编译代码时发现有基本类型与
 * 引用类型相互赋值操作时会自动添加转换代码，这样我们在源代码中就不在需要编码
 * 来完成相互的转换。
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        int d = 123;
        /*
            下面代码会触发:自动装箱特性，编译器会补全转换代码
            Integer i = Integer.valueOf(d);
         */
        Integer i = d;
        /*
            自动拆箱
            d = i.intValue();
         */
        d = i;
    }
}
