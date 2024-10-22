package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("./demo");
        if(dir.exists()){
            dir.delete();//删除目录时要求该目录必须是空的
            System.out.println("目录已删除");
        }else{
            System.out.println("目录不存在!");
        }
    }
}





