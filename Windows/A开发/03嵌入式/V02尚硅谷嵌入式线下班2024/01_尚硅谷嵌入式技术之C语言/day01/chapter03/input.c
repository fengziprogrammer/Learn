#include <stdio.h>

int main()
{
    // 先声明一个变量
    int num;

    // 输出提示信息
    printf("请输入一个数字：");
    // 输入对应的数据，保存到num中
    scanf("%d", &num);
    // 输出查看一下输入保存的数据
    printf("刚才输入的数字是：%d\n", num);

    // 同时输入多个变量
    int num1, num2, num3;
    printf("请连续输入三个数字：");
    scanf("%d %d %d", &num1, &num2, &num3);
    printf("刚才输入的数据是： num1 = %d, num2 = %d, num3 = %d\n", num1, num2, num3);

    return 0;
}