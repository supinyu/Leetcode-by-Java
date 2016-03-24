class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
class Linklist 
{
	public static void main(String[] args) 
	{
		int[] num={1,2};
		ListNode test=addList(num);
		printList(test);
		ListNode res=reverseBetween(test,1,2);
		printList(res);

	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
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
		System.out.println(cur.val);
        for(int j=0;j<n-m;j++){	
            prev.next=cur.next;//作用是让下一个要翻转的值，接在prev的后面，此时cur即为要头插的值
            cur.next=Head2.next;//把cur插到Head2的后面，首先将Head2.next的值放到要插的数cur的后面
            Head2.next=cur;//再把cur放到Head2的后面
            cur=prev.next;//要插的指针变动          
        }
        return dummyHead.next;
    }
	public static void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}	
		System.out.println("----------");
	}
	public static ListNode addList(int[] num){
		int len=num.length;
		ListNode head=new ListNode(0);
		ListNode temp=head;
		for(int i=0;i<len;i++){
			ListNode end=new ListNode(num[i]);
			temp.next=end;
			temp=temp.next;
		}
		temp=null;	
		return head.next;
	}
	
}
