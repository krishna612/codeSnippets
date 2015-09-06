package lists;
//624
public class FindLoopedList {
	
	public boolean isListLooped(ListNode head){
		if(head.getNext()==null||head.getNext().getNext()==null)
			return false;
		boolean bool = false;
		ListNode singlePointer,doublePointer;
		singlePointer = head.getNext();
		doublePointer = head.getNext().getNext();
		while((doublePointer!=singlePointer)&&(doublePointer.getNext()==null)&&(doublePointer.getNext().getNext()==null)){
			singlePointer = singlePointer.getNext();
			doublePointer = doublePointer.getNext().getNext();
		}
		if(doublePointer==singlePointer)
			bool = true;
		return bool;
	}

}
