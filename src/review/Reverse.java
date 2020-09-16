package review;

/**
 * 将一个数组中的元素逆序存放
 * @author hc
 * @create 2020/9/16 0016 15:32
 */
public class Reverse {

    public static void main(String[] args) {

        int a[] = {18,25,7,36,13,2,89};
        int length = a.length;
        int temp = 0;
        if(length % 2 == 0){
            for (int i = 0; i < length/2; i++) {
                temp = a[i];
                a[i] = a[length-1-i];
                a[length-1-i] = temp;
            }
        }else {
            for (int i = 0; i < (length-1)/2; i++) {
                temp = a[i];
                a[i] = a[length-1-i];
                a[length-1-i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
