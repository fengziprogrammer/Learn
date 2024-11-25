package file;

import java.io.File;

/**
 * 创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录demo
//        File dir = new File("demo");
        //在当前目录下创建目录:./a/b/c/d/e/f
        File dir = new File("a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("该目录已存在!");
        }else{
//            dir.mkdir();//创建的目录所在的目录必须存在，否则创建不成功
            dir.mkdirs();//会将不存在父目录一同创建出来
            System.out.println("该目录已创建!");
        }
    }
}





