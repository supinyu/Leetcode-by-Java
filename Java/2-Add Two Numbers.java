/*
链表题：主要考察基础能力，需要注意的是进位的问题，还有特殊情况就是两个不一样长怎么办
思路：
1、做竖式计算，从低位到高位相加，定义一个变量存储进位
2、最好定义一个头指针
3、循环控制条件两个链表全为空时
4、取值时进行一下判断如果为空，取值为0
5、两个数相加，取整就是进位，取余就是这一位的值，把值赋值到新的链表时，注意指针的移动
6、两个链表如果非零，进行自增操作
7、循环结束，判断进位是否大于0，如果大于新建节点，调加到链表
8、返回头节点的下一个节点
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode p=l1,q=l2,curr=dummyHead;
        int carry=0;
        while(p!=null || q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int digit=x+y+carry;
            carry=digit/10;
            curr.next=new ListNode(digit%10);
            curr=curr.next;
            if(p!=null)
                p=p.next;
            if(q!=null)
                q=q.next;
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
    }
}