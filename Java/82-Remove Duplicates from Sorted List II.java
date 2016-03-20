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
        ListNode prev=dummyHead;//指针指向头结点,循环条件下一个和下下一个,即至少有两个元素
        while(prev.next!=null&&prev.next.next!=null){  
            if(prev.next.val==prev.next.next.val){
                int temp=prev.next.val;     //如果值相等，把值取出来放入一个变量中
                while(prev.next!=null&&prev.next.val==temp){ //进入迭代循环，从相等元素的第一个值开始进行迭代，从前面开始删除，prev是相等元素前面的那个指针
                    prev.next=prev.next.next;
                }
            }else{
                prev=prev.next; //指针增加1
            }
            
        }
        return dummyHead.next;
    }
}