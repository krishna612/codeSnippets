package leetcode;

import leetcode.ListReverse.ListNode;
//750 800 1015 1040
//640 710 (getting memory limit exceeded, need to debug this further)
public class ListReverseM {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
	 int count=1;
	 ListNode current=head,prev=null,next=null,first=null,last=null;
	 
	 //navigate in the list till it points to mth node
	 while(count<m){
		 prev = current;
		 current = current.next;
		 count++;
	 }
	 first = prev;
	 if(m==1){first = head;}
	 
	 //now reverse procedure
	 prev = current;
	 last = current;
	 current = current.next;
	 while(count<n){
		 next = current.next;
		 current.next = prev;
		 prev = current;
		 current = current.next;
		 count++;
	 }
	 
	 //linking pointers
	 first.next = prev;
	 last.next = current;
	 return head;        
	}

}
