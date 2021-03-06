package threadTest;

/**
 * @author hc
 * @create 2020/9/8 0008 15:46
 */
public class ThreadTest3 {

    public static void main(String[] args) {
        Windows3 windows3 = new Windows3();

        Thread t1 = new Thread(windows3);
        Thread t2 = new Thread(windows3);
        Thread t3 = new Thread(windows3);
        Thread t4 = new Thread(windows3);



        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t4.setName("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Windows3 implements Runnable{

    private Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//windows3
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":卖票" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
