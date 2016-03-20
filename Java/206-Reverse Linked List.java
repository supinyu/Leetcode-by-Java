/*
链表题：主要考察基础能力，可以与前面的链表反转对比
思路：
1、只需要遍历一边
2、定义一个头指针，所有的值都插在头指针的后面
3、head指针指在第一个值，第一个值之后的值就是要插入的值，指针为cur
4、循环结束的条件就是值为空
5、插入的过程，cur指针的next赋值给head指针next；cur此时可以去头插
6、把cur指针放到第一的位置，cur的next指向头指针的下一个，进行插入
7、在把头结点接上，头结点的下一个是cur
8、cur指针完成任务，指向head的下一个值，继续循环
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode prev=dummyHead;
        ListNode cur=head.next;
        while(cur!=null){
            head.next=cur.next;
            cur.next=prev.next;
            prev.next=cur;
            cur=head.next;
        }
        return dummyHead.next;
    }
}