//given a list reverse its contents
package lists;

public class ReverseList {
	ListDataStructure list;
    ListNode head,prev,current,next;
	public ReverseList(ListDataStructure list){
    	this.list = list;
		this.head = list.getHead();
    }
	public void reverseList(){
	   prev = null;
	   current = this.head;
	   while(current!=null){
		   next = current.getNext();
		   current.setNext(prev);
		   prev = current;
		   current = next;
	   }
	   this.list.setHead(prev);
   }
}
