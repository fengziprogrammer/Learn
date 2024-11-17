package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写超类中含有throws声明异常抛出的方法时对throws的几种特殊的重写规则
 */
public class ThrowsDemo {
    public void dosome()throws IOException, AWTException {}
}

class SubClass extends ThrowsDemo{
//    public void dosome()throws IOException, AWTException {}

    //允许子类方法抛出部分异常
//    public void dosome()throws IOException{}

    //可以不再抛出任何异常
//    public void dosome(){}

    //可以抛出超类方法抛出异常的子类型异常
//    public void dosome()throws FileNotFoundException {}

    //不允许抛出额外异常
//    public void dosome()throws SQLException {}

    //不允许抛出超类方法抛出异常的超类异常
//    public void dosome()throws Exception{}
}





