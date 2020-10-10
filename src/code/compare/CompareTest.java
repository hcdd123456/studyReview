package code.compare;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author hc
 * @create 2020/10/10 0010 19:30
 */
public class CompareTest {


//    Comparable接口的使用举例：  自然排序
//    1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式。
//    2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
//    3. 重写compareTo(obj)的规则：
//        如果当前对象this大于形参对象obj，则返回正整数，
//        如果当前对象this小于形参对象obj，则返回负整数，
//        如果当前对象this等于形参对象obj，则返回零。
//    4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法。
//       在compareTo(obj)方法中指明如何排序

     @Test
    public void compareTo(){
         String[] arr = new String[]{"A","C","X","B","D"};
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
     }

     @Test
    public void compareTo1(){
         Goods[] goods = new Goods[4];
         goods[0] = new Goods("xiaomi",25);
         goods[1] = new Goods("xiaomi1",34);
         goods[2] = new Goods("xiaomi2",25);
         goods[3] = new Goods("xiaomi3",12);
         Arrays.sort(goods);
         System.out.println(Arrays.toString(goods));
     }

}
