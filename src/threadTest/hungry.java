package threadTest;

/**
 *
 * //懒汉式  线程安全
 * @author hc
 * @create 2020/9/8 0008 18:55
 */
public class hungry {

}

class Bank{

    private Bank(){}

    private static Bank instance = null;

    public static Bank getInstance(){
        if(instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
