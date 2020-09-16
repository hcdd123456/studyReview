package code.stack;

import java.util.Stack;

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * @author hc
 * @create 2020/9/14 0014 16:58
 */
public class GetMin {


    @Override
    public String toString() {
        return "GetMin{" +
                "stackData=" + stackData +
                ", stackMin=" + stackMin +
                '}';
    }

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMin() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackMin.peek();
//        if (value == this.getmin()) {
//             this.stackMin.pop();
//        }疑惑  貌似书上错了
        return value;
    }

    public int getmin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        int a[] = {3,4,5,1,2,0,1,2,1,3,1};
        GetMin getMin = new GetMin();
        for (int i = 0; i < a.length ; i++) {
            getMin.push(a[i]);
        }
        System.out.println(getMin.pop());
        System.out.println(getMin.toString());
    }

}
