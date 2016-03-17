/*
链表题：主要考察基础能力，需要注意的是头插法
思路：
1、边界条件，链表为空或者之翻转一个字符
2、最好定义一个头指针
3、先空转m-1次，得到m-1这个这个位置，后面的指针就为要翻转的指针
4、定义一个指针一直指向m-1这个位置，指针为Head2
5、翻转链表的第一个，翻转完成后的最后一个，即为prev指针不再变动
6、定义一个可以变动的指针cur，不断的进行头插，插入到Head2之后
7、循环的次数n-m，初始结构顺序Head2 prev cur，过程中Head2 XXX prev cur
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m>=n||head==null){
            return head;
        }
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode prev=dummyHead;
        for(int i=0;i<m-1;i++){
            prev=prev.next;
        }
        ListNode Head2=prev;//要翻转链表的前一个值，指针不再变动，以后所有值都插到这个指针的后面
        prev=Head2.next;//prev的值不再变化，这个值就是要翻转列表的第一个值，以后prev指针不再变动，一直指向这个数
        ListNode cur=prev.next;//这个指针的值是变动的，一直指向要头插的那个值
        for(int j=0;j<n-m;j++){
            prev.next=cur.next;//作用是让下一个要翻转的值，接在prev的后面，此时cur即为要头插的值
            cur.next=Head2.next;//把cur插到Head2的后面，首先将Head2.next的值放到要插的数cur的后面
            Head2.next=cur;//再把cur放到Head2的后面
            cur=prev.next;//要插的指针变动
        }
        return dummyHead.next;
    }
}