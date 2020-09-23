package test;

/**
 * @author hc
 * @create 2020/9/23 0023 10:05
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Father father = new Father();
        Father student = new Student();
    }

}
class Father{
    public Father(){
        System.out.println("我是父类");
    }
}

class Student extends Father{
    public Student(){
        System.out.println("我是子类");
    }
}