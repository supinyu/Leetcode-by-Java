/*
链表题：主要考察基础能力，考察的思想是快速排序partition
思路：
1、定义两个指针，一个比x小，一个比x大于或者等于
2、最后在第一个链表接到第二个链表的前面
3、循环条件：遍历链表
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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode left_dummyHead=new ListNode (0);
        ListNode right_dummyHead=new ListNode (0);
        ListNode left=left_dummyHead,right=right_dummyHead;   //定义两个游动的指针，进行判断左边是小于的右边是大于的
        while(head!=null){
            if(head.val<x){
                left.next=head;
                left=left.next;
            }else{
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;   //定义结尾
        left.next=right_dummyHead.next; //左右两个链表连接起来
        return left_dummyHead.next;     //返回头指针
    }
}