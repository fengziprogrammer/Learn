package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个文件:test.txt
        File file = new File("./test.txt");
        //boolean exists()该方法是判断File表示的文件或目录是否已经存在
        if(file.exists()){
            System.out.println("该文件已存在！");
        }else{
            file.createNewFile();//创建该文件
            System.out.println("文件已创建!");
        }
    }
}





