package code;

import java.util.Stack;

/**
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 * @author hc
 * @create 2020/9/15 0015 0:02
 */
public class TwoStacksQueue {

    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    //push栈倒入pop栈
    private void pushToPop(){
        if(stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
        pushToPop();
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }

    @Override
    public String toString() {
        return "TwoStacksQueue{" +
                "stackPush=" + stackPush +
                ", stackPop=" + stackPop +
                '}';
    }

    public static void main(String[] args) {
        TwoStacksQueue twoStacksQueue = new TwoStacksQueue();
        twoStacksQueue.add(5);
        System.out.println(twoStacksQueue.toString());
        twoStacksQueue.add(2);
        System.out.println(twoStacksQueue.toString());
        twoStacksQueue.add(4);
        System.out.println(twoStacksQueue.toString());
        twoStacksQueue.add(3);
        System.out.println(twoStacksQueue.toString());
        System.out.println(twoStacksQueue.peek());
        System.out.println(twoStacksQueue.poll());
        System.out.println(twoStacksQueue.poll());
        System.out.println(twoStacksQueue.poll());
        System.out.println(twoStacksQueue.toString());
    }

}
