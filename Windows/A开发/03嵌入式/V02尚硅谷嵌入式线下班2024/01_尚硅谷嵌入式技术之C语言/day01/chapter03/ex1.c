#include <stdio.h>

int main()
{
    // 声明两个变量a，b，以及保存和的变量sum
    int a, b, sum;

    // 用户输入两个数，保存到a、b
    printf("请输入两个数（用空格分割）：");
    scanf("%d %d", &a, &b);

    // 计算两数和，并打印输出
    sum = a + b;

    printf("输入两数的和为：%d\n", sum);

    return 0;
}