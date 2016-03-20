/*
链表题：主要考察基础能力，需要注意的是去除链表中的数字
思路：
1、边界条件，链表为空直接返回
2、最好定义一个头指针
3、尽量减少指针的定义，节省空间
4、指针从头指针开始，判断头指针的下一个指针即第一个值，和头指针的下下一个值进行判断
5、如果相等将头指针的下下一个值
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode dummyHead=new ListNode(0);//建立一个空指针
        dummyHead.next=head;
        head=dummyHead;
        while(head.next!=null&&head.next.next!=null){
            if(head.next.val==head.next.next.val){
                head.next.next=head.next.next.next;
            }else{
                head=head.next;
            }
        }
        return dummyHead.next;
    }
}