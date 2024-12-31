package file;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles方法有一个重载，允许我们传入一个文件过滤器，然后将该目录中符合
 * 过滤器要求的子项获取。
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        /*
            获取当前目录中名字里含有"a"的子项
         */
        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs= dir.listFiles(new FileFilter(){
                public boolean accept(File file) {
                    String name = file.getName();
                    int index = name.indexOf("a");
                    return index!=-1;
                }
            });
            System.out.println("一共:"+subs.length+"个");
        }
    }
}
