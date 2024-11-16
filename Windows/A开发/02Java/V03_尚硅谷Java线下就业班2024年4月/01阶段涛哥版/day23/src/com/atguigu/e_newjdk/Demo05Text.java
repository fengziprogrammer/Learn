package com.atguigu.e_newjdk;

public class Demo05Text {
    public static void main(String[] args) {
        //method01();
        //method02();
        method03();
    }

    private static void method03() {
        String s1 = "";//表示空串儿
        String s2 = """    
                """;//三引号必须换行


        //三引号中还可以嵌套双引号
        String s3 = """
                Elly said,"Maybe I was a bird in another life."
                                
                Noah said,"If you're a bird , I'm a bird."
                """;

        System.out.println(s3);
    }

    private static void method02() {
        String s = """
                <html>
                  <body>
                      <p>Hello, 尚硅谷</p>
                  </body>
                </html>
                """;
        System.out.println(s);
    }


    /**
     * jdk13之前:
     * 用字符串表示一个html,中间会掺杂转义字符以及拼接符号
     */
    private static void method01() {
        String s = "<html>\n" +
                "  <body>\n" +
                "      <p>Hello, 尚硅谷</p>\n" +
                "  </body>\n" +
                "</html>";
        System.out.println(s);
    }
}
