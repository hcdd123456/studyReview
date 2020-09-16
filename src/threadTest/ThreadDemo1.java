package threadTest;

/**
 * @author hc
 * @create 2020/9/7 0007 16:20
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
    }

}
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}