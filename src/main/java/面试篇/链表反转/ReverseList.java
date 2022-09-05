package 面试篇.链表反转;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 郑元龙
 * @description: 单链表反转
 * @date 2022年08月12日 13:33
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseList {

        public ListNode reverseList(ListNode head) {
                System.out.println(head.val);
                Map<Integer,Integer> map = new HashMap<>();
                if(head == null || head.next == null) return head;
                ListNode newhead = reverseList(head.next);

                head.next.next = head;
                head.next = null;
                return newhead;
        }

        public static void main(String[] args) {
                //创建节点
                ListNode node1 = new ListNode();
                ListNode node2 = new ListNode();
                ListNode node3 = new ListNode();
                ListNode node4 = new ListNode();
                ListNode node5 = new ListNode();
                //生成链表
                node1.val = 1;
                node1.next = node2;
                node2.val = 2;
                node2.next = node3;
                node3.val = 3;
                node3.next = node4;
                node4.val = 4;
                node4.next = node5;
                node5.val = 5;
                node1.next = null;


                ReverseList list = new ReverseList();
                ListNode head = node1;
                list.reverseList(head);



        }

}
