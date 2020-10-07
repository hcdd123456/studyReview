package review;


/**
 * @author hc
 * @create 2020/10/7 0007 22:08
 */
public class Upper_bound_ {

    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        if(v >  a[n-1]){
            return n + 1;
        }
        int result = 0;
        int low = 0, high = n;
        while (low <= high){
            int mid =  (low + high)/2;
            if(a[mid] == v){
                result = mid;
                return result;
            }
            else if(a[mid] < v){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        Upper_bound_ u = new Upper_bound_();
        int a[] = {2,3,3,5,7};
        int i = u.upper_bound_(5, 4, a);
        System.out.println(i);

    }

}
