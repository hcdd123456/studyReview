package review;

/**
 * 冒泡排序
 * @author hc
 * @create 2020/9/16 0016 14:49
 */
public class BubbleSort {

    public static void main(String[] args) {

        int a[]={5,3,4,8,6,1,4,5,2};
        int t = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
