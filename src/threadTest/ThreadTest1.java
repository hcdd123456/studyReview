package threadTest;

/**
 *同步代码块
 *
 * 共享数据
 * 锁
 *
 * @author hc
 * @create 2020/9/8 0008 15:32
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();

        w1.setName("窗口1:");
        w2.setName("窗口2:");
        w3.setName("窗口3:");

        w1.start();
        w2.start();
        w3.start();
    }

}
class Windows extends Thread{

    private static Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Windows.class) {//类加载  唯一
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket > 0) {
                    System.out.println(getName() + ":卖票" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}