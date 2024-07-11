/*
用一个数组存储26个英文字母的小写形式，并遍历显示小写字母以及它对应的大写字母，例如：a->A
提示：小写字母'a'对应编码值是97，字母'b'对应编码值是98，依次类推
​    大写字母'A'对应编码值是65，字母'B'对应编码值是66，依次类推
 */
public class ArrayExer3_Expand {
    public static void main(String[] args) {
        /*char[] lowCaseletters = new char[26];
        for (int i = 0; i < lowCaseletters.length; i++) {
            lowCaseletters[i] = (char)('a' + i) ;

            System.out.println(lowCaseletters[i] + "->" + (char)(lowCaseletters[i]-32));
        }*/

        System.out.println("---------------------------------");
        char[] lowCaseletters = new char[26];
        char[] upperCaseletters = new char[26];
        for (int i = 0; i < lowCaseletters.length; i++) {
            lowCaseletters[i] = (char)('a' + i) ;
            upperCaseletters[i] = (char)('A' + i) ;
            System.out.println(lowCaseletters[i] + "->" + upperCaseletters[i]);
        }
    }
}
