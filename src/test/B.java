package test;

/**
 * 1.程序入口main方法要执行首先要加载类B 2.静态域：分为静态变量，静态方法，静态块。
 * 这里面涉及到的是静态变量和静态块，当执行到静态域时，按照静态域的顺序加载。并且静态域只在类的第一次加载时执行
 * 3.每次new对象时，会执行一次构造块和构造方法，构造块总是在构造方法前执行（当然，第一次new时，会先执行静态域，静态域〉构造块〉构造方法）
 * 注意：加载类时并不会调用构造块和构造方法，只有静态域会执行
 * 4.根据前三点，首先加载类B，执行静态域的第一个静态变量，static b1=new B，输出构造块和构造方法（空）。
 * ps:这里为什么不加载静态方法呢？因为执行了静态变量的初始化，意味着已经加载了B的静态域的一部分，
 * 这时候不能再加载另一个静态域了，否则属于重复加载 了（静态域必须当成一个整体来看待。否则加载会错乱）
 * 于是，依次static b2 =new B，输出构造块，再执行静态块，完成对整个静态域的加载，再执行main方法，new b，输出构造块。
 * @author hc
 * @create 2020/9/23 0023 16:26
 */
public class B
{
    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    public static void main(String[] args)
    {
        B t = new B();
    }
}
