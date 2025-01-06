#include <stdio.h>

int main()
{
    // 声明变量，后面再赋值
    int a;
    a = 100;
    // 打印输出变量a
    printf("a = %d\n", a);

    // 声明变量，同时赋值
    int b = 200;
    printf("b = %d\n", b);

    // 变量的值可以改变
    a = 150;
    b = a;

    printf("a = %d\n", a);
    printf("b = %d\n", b);

    // 同时声明多个变量并赋值
    int c1 = 300, c2 = 400, c3;
    printf("c1 = %d, c2 = %d, c3 = %d\n", c1, c2, c3);

    // c4 = 200;
    // 100 = a;

    return 0;
}