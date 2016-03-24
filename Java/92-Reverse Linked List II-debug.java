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
        ListNode Head2=prev;//Ҫ��ת�����ǰһ��ֵ��ָ�벻�ٱ䶯���Ժ�����ֵ���嵽���ָ��ĺ���
        prev=Head2.next;//prev��ֵ���ٱ仯�����ֵ����Ҫ��ת�б�ĵ�һ��ֵ���Ժ�prevָ�벻�ٱ䶯��һֱָ�������
        ListNode cur=prev.next;//���ָ���ֵ�Ǳ䶯�ģ�һֱָ��Ҫͷ����Ǹ�ֵ
		System.out.println(cur.val);
        for(int j=0;j<n-m;j++){	
            prev.next=cur.next;//����������һ��Ҫ��ת��ֵ������prev�ĺ��棬��ʱcur��ΪҪͷ���ֵ
            cur.next=Head2.next;//��cur�嵽Head2�ĺ��棬���Ƚ�Head2.next��ֵ�ŵ�Ҫ�����cur�ĺ���
            Head2.next=cur;//�ٰ�cur�ŵ�Head2�ĺ���
            cur=prev.next;//Ҫ���ָ��䶯          
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
