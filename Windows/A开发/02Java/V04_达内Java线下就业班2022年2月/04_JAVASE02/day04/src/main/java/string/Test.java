package string;

public class Test {
    public static void main(String[] args) {
        String s1 = "www.baidu.com";
        String s2 = "http://www.tedu.cn";
        String s3 = "www.balabala.com.cn";
        System.out.println(getName(s1));//baidu
        System.out.println(getName(s2));//tedu
        System.out.println(getName(s3));//balabala

    }
    public static String getName(String line){
        int start = line.indexOf(".")+1;
        int end = line.indexOf(".",start);
        return line.substring(start,end);
    }
}
