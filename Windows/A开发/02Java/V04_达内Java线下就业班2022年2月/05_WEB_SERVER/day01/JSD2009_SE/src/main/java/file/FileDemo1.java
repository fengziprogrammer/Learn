package file;


import java.io.File;

/**
 * java.io.File
 * File的每一个实例用于表示硬盘上的一个文件或目录的。
 * 使用File可以:
 * 1:访问该文件或目录的属性信息(名字，大小，修改时间等)
 * 2:创建或删除文件和目录
 * 3:访问一个目录中的所有子项
 *
 * 使用File不能读写文件数据，有其他API可以做到
 */
public class FileDemo1 {
    public static void main(String[] args) {
        /*
            File创建时需要指定其表示的文件或目录的路径信息，而路径有两种写法:
            绝对路径:
            例如:E:/idea_workspace/JSD2009_SE/demo.txt
            相对路径:
            例如:./demo.txt

            绝对路径的优点在于清晰没明了，但是位置是固定的，跨平台不利。
            相对路径的优点在于适应性好，利于跨平台。但是缺点是不清晰，需要视
            当前程序的运行环境而定。
            在idea(eclipse也相同)中当前目录的位置是当前程序所在的目录，这里
            相当于是JSD2009_SE这个目录
         */
        File file = new File("./demo.txt");

        String name = file.getName();
        System.out.println(name);

        long length = file.length();
        System.out.println(length+"字节");

        boolean cr = file.canRead();//是否可读
        boolean cw = file.canWrite();//是否可写
        System.out.println("可读:"+cr);
        System.out.println("可写:"+cw);

        boolean ih = file.isHidden();//是否是隐藏的
        System.out.println("是否隐藏:"+ih);
    }
}
