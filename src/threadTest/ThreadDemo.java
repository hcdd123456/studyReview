package threadTest;

/**
 * @author hc
 * @create 2020/9/6 0006 15:11
 */
public class ThreadDemo {

    public static void main(String[] args) {



        new Thread();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i%2 == 0){
                        System.out.println("t1:"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i%2 != 0){
                        System.out.println("t2:"+i);
                    }
                }
            }
        }.start();

    }

}
