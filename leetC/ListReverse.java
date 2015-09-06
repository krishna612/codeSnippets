package leetcode;
//646 652
//running time: 260ms
public class ListReverse {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
    
     public ListNode reverseList(ListNode head) {
         ListNode current,previous,next;
         current = head;
         previous = null;
         while(current!=null){
        	 next = current.next;
        	 current.next = previous;
        	 previous = current;
        	 current = next;
         }
    	 return previous;   
    }
}
