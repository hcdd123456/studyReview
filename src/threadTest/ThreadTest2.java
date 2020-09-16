package threadTest;

/**
 * 同部方法
 *
 * 共享数据
 * 锁
 *
 * @author hc
 * @create 2020/9/8 0008 15:32
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        Windows2 w1 = new Windows2();
        Windows2 w2 = new Windows2();
        Windows2 w3 = new Windows2();

        w1.setName("窗口1:");
        w2.setName("窗口2:");
        w3.setName("窗口3:");

        w1.start();
        w2.start();
        w3.start();
    }

}

class Windows2 extends Thread{

    private static Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
                show();
            }
    }


    private static synchronized boolean show(){//windows2.class
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票" + ticket);
            ticket--;
            return true;
        } else {
            return false;
        }
    }
}