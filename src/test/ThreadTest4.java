package test;

/**
 * @author hc
 * @create 2020/9/8 0008 15:46
 */
public class ThreadTest4 {

    public static void main(String[] args) {
        Windows4 windows4 = new Windows4();

        Thread t1 = new Thread(windows4);
        Thread t2 = new Thread(windows4);
        Thread t3 = new Thread(windows4);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows4 implements Runnable{

    private Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
                show();
        }
    }

    private synchronized boolean show(){//this
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
