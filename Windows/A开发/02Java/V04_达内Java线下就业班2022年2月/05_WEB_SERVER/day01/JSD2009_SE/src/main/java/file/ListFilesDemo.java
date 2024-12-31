package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录中的所有子项
        File dir = new File(".");
        /*
            boolean isFile() 判断当前File表示的是否为一个文件
            boolean isDirectory() 判断是否为一个目录
         */
       if(dir.isDirectory()){
           /*
                Files listFiles()
                获取当前File对象表示的目录中的所有子项，每个子项都以一个
                File对象形式表示最终以数组形式返回。
            */
           File[] subs = dir.listFiles();
           System.out.println("子项共:"+subs.length+"个");
           for(int i=0;i<subs.length;i++){
               System.out.println(subs[i].getName());
           }
       }else{
           System.out.println("不是一个目录");
       }

    }
}
