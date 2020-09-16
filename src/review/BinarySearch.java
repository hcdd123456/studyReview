package review;

import java.util.Arrays;

/**
 * 二分查找
 * @author hc
 * @create 2020/9/16 0016 15:04
 */
public class BinarySearch {

    public static void main(String[] args) {

        int a[]={2,5,8,9,10,12};
        //查询条件
        int key = 5;

        int low = 0;
        int high = a.length - 1;

        int result =0;
        while (low <= high){
            int mid = (low + high) >>> 1;
            if(key == a[mid]){
                result = mid;
                break;
            }else if(key < a[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        System.out.println(result);
    }

}
