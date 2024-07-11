//1、循环输出26个小写英文字母
public class Exam1 {
    public static void main(String[] args) {
        for(char c = 'a'; c <= 'z'; c++){
            System.out.println(c);
        }
        System.out.println("--------------------");
        for (int i=0; i<26; i++){
            System.out.println((char)('a' + i));
        }
    }
}

