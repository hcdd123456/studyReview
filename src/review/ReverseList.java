package review;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author hc
 * @create 2020/10/7 0007 21:38
 */
public class ReverseList {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode newHead = null;
        ListNode cur = head;

        ListNode pre = null;
        while(cur!=null) {
            ListNode curNext=cur.next;
            if(curNext==null) {
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return newHead;
    }

}
