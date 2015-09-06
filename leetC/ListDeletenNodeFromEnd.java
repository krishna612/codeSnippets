package leetcode;

import leetcode.ListReverse.ListNode;
//705 730 550 557
//running time: 324ms
public class ListDeletenNodeFromEnd {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPtr=head, fastPtr=head;
        while(n>0){
        	fastPtr = fastPtr.next;
        	n--;
        }
        if(fastPtr==null){
        	head = head.next;
        	slowPtr = null;
        }
        else{
        	while(fastPtr.next!=null){
        		fastPtr = fastPtr.next;
        		slowPtr = slowPtr.next;
        	}
        	ListNode toBeDeleted = slowPtr.next;
        	slowPtr.next = toBeDeleted.next;
        	toBeDeleted.next = null;
        	toBeDeleted = null;
        }
    	return head;    
    }

}
