package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取当前目录中的所有.txt文件
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs= dir.listFiles(new FileFilter(){
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.endsWith(".txt");
                }
            });
            System.out.println("一共:"+subs.length+"个");
        }
    }
}
