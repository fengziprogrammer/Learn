package com.atguigu.a_jdk;

public class Demo06Text {
    public static void main(String[] args) {
        //method01();
        //method02();
        method03();
    }

    /**
     *   """"
     *
     *   """
     *    ""
     *   """
     */
    private static void method03() {
       String s = """
                Elly said,"Maybe I was a bird in another life."
                
                Noah said,"If you're a bird , I'm a bird."
               """;

        System.out.println(s);
    }

    /**
     * jdk15之后
     *
     * 可以使用""" 内容  """
     *
     * 如果使用三引号,在第三个引号后面必须换行
     */
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
     * jdk15之前 用字符串表示html
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
