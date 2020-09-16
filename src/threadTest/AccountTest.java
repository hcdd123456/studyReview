package threadTest;

/**
 * @author hc
 * @create 2020/9/8 0008 19:37
 */

class Account{

    private double money;

    public Account(double money) {
        this.money = money;
    }

    //this  同一个对象account
    public synchronized void add(double str){
        money +=str;
        System.out.println(Thread.currentThread().getName()+"余额："+money);
    }


}

class Customer extends Thread{

    private Account account;

    public Customer(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.add(1000);
        }
    }
}

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("客户1：");
        c2.setName("客户2：");

        c1.start();
        c2.start();
    }

}
