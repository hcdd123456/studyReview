package review;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 将一个数组中的重复元素保留一个其他的清零
 * @author hc
 * @create 2020/9/16 0016 15:53
 */
public class Deduplication {

    public static void main(String[] args) {
        //方法一
//        int a[] = {18,25,7,36,13,2,89,63,7,7,18};
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if(a[i] == a[j] && i != j){
//                    a[j] = 0;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

        //方法二
        int a[] = {18,25,7,36,13,2,89,63,7,7,18};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
