package leetcode;

import leetcode.ListReverse.ListNode;

//725 808
//running time: 344ms
public class ListRotate {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
    
	public ListNode rotateRight(ListNode head, int k) {
	  //if k is higher than length we need to take modulus
	  if(head==null) return head;
	  int length = 0;
	  ListNode first = head;
	  while(first!=null){first=first.next;length++;}
	  k = k%length;
	  if(k==0) return head;
	  ListNode kthNodeFromEnd=head, lastNode=head,tmp=head;
	  while(k>0){
		  lastNode = lastNode.next;
		  k--;
	  }
	  while(lastNode!=null && lastNode.next!=null){
		  kthNodeFromEnd = kthNodeFromEnd.next;
		  lastNode = lastNode.next;
	  }
	  if(lastNode !=null){
	   tmp = kthNodeFromEnd;
	   kthNodeFromEnd = kthNodeFromEnd.next;
	   lastNode.next = head;
	   tmp.next = null;
	  }
	  head = kthNodeFromEnd;
      return head;    
    }
}
