/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead=new ListNode(0);
		dummyHead.next=head;
		ListNode prev=dummyHead;
		ListNode cur=head;
		while(cur!=null&&cur.next!=null){
			ListNode q=cur.next,r=cur.next.next;
			prev.next=q;
			q.next=cur;
			cur.next=r;
			prev=cur;
			cur=r;			
		}
		return dummyHead.next;
    }
}