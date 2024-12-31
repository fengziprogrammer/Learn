package file;

import java.io.File;

/**
 * 使用File删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        /*
            在相对路径中，"./"是可以忽略不写的，默认就是从当前目录开始。
            因此"./test.txt"与"test.txt"是一样的。
         */
        //将当前项目下的test.txt文件删除
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除!");
        }else{
            System.out.println("文件不存在!");
        }

    }
}
