package lists;

public class FindMiddleNode {
	
	public ListNode findMiddle(ListNode head){
	  ListNode singlePointer = head;
	  ListNode doublePointer = head;
	  while((doublePointer.getNext()!=null) && (doublePointer.getNext().getNext()!=null)){
		  singlePointer = singlePointer.getNext();
		  doublePointer = doublePointer.getNext().getNext();
	  }
	  return singlePointer;	
	}
}
