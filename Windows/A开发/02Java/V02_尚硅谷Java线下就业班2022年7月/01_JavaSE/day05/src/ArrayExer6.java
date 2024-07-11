public class ArrayExer6 {
    public static void main(String[] args) {
        //随机产生10个[0,100)之间整数放到一维数组中，然后遍历所有随机数，并统计随机数中满足3的倍数有几个。
        //1.声明一个数组，并且初始化长度为10
        //声明格式：元素的类型[] 数组名 = new 元素的类型[长度];
        int[] arr = new int[10];

        //2、给元素赋值
        //3、顺便统计个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.println(arr[i]);
            if(arr[i] % 3==0){
                count++;
            }
        }

        System.out.println("3的倍数一共有：" + count);
    }
}
