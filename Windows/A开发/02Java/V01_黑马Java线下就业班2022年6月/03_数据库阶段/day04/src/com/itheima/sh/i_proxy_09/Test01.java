package com.itheima.sh.i_proxy_09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    需求：使用jdk的动态代理完成对UserService接口的代理，对接口中的三个方法：login delete query 增强
 */
public class Test01 {
    public static void main(String[] args) {
        /*
            1.在jdk中动态代理类是：Proxy
            2.使用动态代理类Proxy类中的静态方法可以生成代理接口UserService的实现类对象：
                static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
                     返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
         */
        //1.使用Proxy类调用静态方法生成接口UserService的实现类对象
        /*
            UserService userService = (UserService) Proxy.newProxyInstance(loader, interfaces, h);
                相当于下面的代码
             UserServiceImpl userService = new UserServiceImpl();
         */
        //userService 就是UserService接口的实现类对象(代理对象)
        /*
            3.static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)方法参数：
                    loader:类加载器负责将接口实现类加载到内存中，这里接口是UserService,都是自定义接口，可以使用AppClassloader类加载器加载
                    interfaces:表示使用动态代理代理的接口，一个类可以实现多个接口，所以这里是一个数组，其实这里就是{UserService.class}
                    h:属于InvocationHandler调用处理程序接口类型，处理的是接口中的抽象方法的，例如UserService中的三个方法：login() delete() query()
                        在InvocationHandler接口中具有一个抽象方法：
                             Object invoke(Object proxy, Method method, Object[] args) 在代理实例上处理方法调用并返回结果。
                       注意：我们一般在使用的时候都是使用InvocationHandler接口的匿名内部类方式生成该接口对象
         */
        //3.1获取UserService实现类的类加载器
        ClassLoader loader = UserService.class.getClassLoader();
        //3.2获取被代理的接口
        Class<?>[] interfaces = {UserService.class};
        //3.3生成调用处理程序接口InvocationHandler的对象
        /*
            父类或者父接口 对象名 = new 父类或者父接口(){
                重写方法
            }
         */
        InvocationHandler h = new InvocationHandler(){
            //重写方法
            /*
                4.InvocationHandler接口的方法invoke：只要我们使用UserService接口的代理对象调用一次接口中的方法就会执行一次invoke方法
                    举例：
                        1）第一次调用：userService.login(); 此时就会执行一次invoke(Object proxy, Method method, Object[] args)
                        2）第二次调用：userService.delete(); 此时就会执行一次invoke(Object proxy, Method method, Object[] args)
                        3）第三次调用：userService.query(); 此时就会执行一次invoke(Object proxy, Method method, Object[] args)
                5.invoke(Object proxy, Method method, Object[] args) 方法的参数：
                    1）Object proxy：生成的代理对象 不使用
                    2）Method method：表示当前正在执行的方法。例如：当前正在执行login()，那么此时method就表示login()方法
                    3）args：表示正在执行的方法的实参，这里对于UserService三个方法都是无参的，索引数组长度是0，Object[] args={}
                6. public Object invoke(Object proxy, Method method, Object[] args) 方法的返回值，是Object类型，表示执行当前方法的返回值。
                    举例：
                         userService.login(); ==== 那么这里就会将方法的返回值返回给调用位置
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //7.获取当前执行的方法的名字
                String methodName = method.getName();
                //获取系统时间
                long start = System.currentTimeMillis();
                //8.判断方法名
                if("login".equals(methodName)){
                    //说明是登录方法
                    try {
                        //模拟登录，去数据库查询数据
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("登录....");

                }else if("delete".equals(methodName)){
                    //说明是删除法
                    try {
                        //模拟登录，去数据库查询数据
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("删除....");
                }else if("query".equals(methodName)){
                    //说明执行的是查询方法
                    //说明是删除法
                    try {
                        //模拟登录，去数据库查询数据
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("查询....");
                }

                long end = System.currentTimeMillis();
                //输出耗时
                System.out.println("耗时:"+(end-start));
                //返回给login() delete() query()的调用者
                return null;
            }
        };
        UserService userService = (UserService) Proxy.newProxyInstance(loader, interfaces, h);

        //使用接口UserService对象userService调用接口中的方法
        userService.login();
        userService.delete();
        userService.query();
       
       
    }
}
