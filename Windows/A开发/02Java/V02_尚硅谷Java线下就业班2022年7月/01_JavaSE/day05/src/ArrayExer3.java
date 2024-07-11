/*
用一个数组存储26个英文字母的小写形式，并遍历显示小写字母以及它对应的大写字母，例如：a->A
提示：小写字母'a'对应编码值是97，字母'b'对应编码值是98，依次类推
​    大写字母'A'对应编码值是65，字母'B'对应编码值是66，依次类推
 */
public class ArrayExer3 {
    public static void main(String[] args) {
//        char[] letters = {'a','b','c',...};//麻烦
        char[] lowCaseletters = new char[26];
        char[] upperCaseletters = new char[26];

        for (char c = 'a', b = 'A'; c <= 'z' && b <= 'Z'; c++, b++) {
            lowCaseletters[c - 97] = c;
            upperCaseletters[b - 65] = b;
            System.out.println(lowCaseletters[c - 97] + "->" + upperCaseletters[b - 65]);
        }
    }
}
