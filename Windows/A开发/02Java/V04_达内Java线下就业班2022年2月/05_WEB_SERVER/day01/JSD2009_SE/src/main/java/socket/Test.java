package socket;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int pw = 12;
        int[] allOut = {1,4,6,8,9,23,56,87,3,65,12,88,97,93};
        System.out.println(Arrays.toString(allOut));
        //将pw的值从数组中删除
        for(int i=0;i<allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i] = allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}
