#include <stdio.h>

// 使用宏定义定义一个常量
#define PI 3.14

int main()
{
    // 计算圆的面积
    double area;
    double r = 1.2;

    area = PI * r * r;
    printf("area = %.2f\n", area);

    r = 2.4;
    area = PI * r * r;
    printf("area = %.2f\n", area);

    return 0;
}