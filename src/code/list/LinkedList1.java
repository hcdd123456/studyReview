package code.list;

import java.util.LinkedList;

/**
 * 请使用LinkedL ist来模拟一个队列(先进先出
 * 的特性) : [必做题]
 * 1.1拥有放入对象的方法void put (Object o)
 * 1.2取出对象的方法0bject get ()
 * 1.3判断队列当中是否为空的方法boolean
 * isEmpty();并且，编写测试代码，验证你的队
 * 列是否正确。
 * @author hc
 * @create 2020/9/22 0022 20:51
 */
public class LinkedList1 {


    private LinkedList linkedList = new LinkedList();

    public void put(Object o){
        linkedList.addLast(o);
    }

    public Object get(){
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        boolean isSucess = true;
        if(linkedList.size() > 0){
            isSucess = false;
            return isSucess;
        }
        return isSucess;
    }


    public static void main(String[] args) {

        LinkedList1 queue = new LinkedList1();
        boolean b = queue.isEmpty();
        System.out.println(b);

        queue.put("1");
        queue.put("2");
        queue.put("3");
        queue.put("4");

        System.out.println(queue.isEmpty());

        System.out.println(queue.get());

    }

}
