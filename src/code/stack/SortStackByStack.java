package code.stack;

import java.util.Stack;

/**
 * 一个栈中元素的类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只许申请一个栈。除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序
 * @author hc
 * @create 2020/9/16 0016 19:24
 */
public class SortStackByStack {

    public static Stack<Integer> sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
//        while (!help.isEmpty()) {
//            stack.push(help.pop());
//        }
        return help;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(2);
        stack.add(1);
        stack.add(5);
        stack.add(3);
        System.out.println(SortStackByStack.sortStackByStack(stack));
    }

}
