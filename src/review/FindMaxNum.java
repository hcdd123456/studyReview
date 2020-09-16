package review;

/**
 * 在一个有8个整数(18,25,7,36,13,2,,89,63)的数组中找出其中最大的数及其下标。
 * @author hc
 * @create 2020/9/16 0016 15:27
 */
public class FindMaxNum {

    public static void main(String[] args) {

        int a[] = {18,25,7,36,13,2,89,63};
        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if(a[i]>max){
                max = a[i];
                index = i;
            }
        }
        System.out.println(index);
    }

}
