package epi;
import lists.ListNode;
//problem 7.1
//852 928
//given two sorted lists, merge both the lists, we should not use any extra space
public class Lists1MergeSortedLists {
   public ListNode merge(ListNode first, ListNode second){
	   ListNode finalHead = null,finalTmp=null,firstTmp=null,secondTmp=null;
	   if(first==null && second==null)
		   return null;
	   if(first==null)
		   return second;
	   if(second==null)
		   return first;
	   if(first.getDataNode().getData()<second.getDataNode().getData()){
		   finalHead = first;
		   firstTmp = first.getNext();
		   secondTmp = second;
	   }
	   else{
		   finalHead = second;
		   firstTmp = first;
		   secondTmp = second.getNext();
	   }
	   finalTmp = finalHead;
	   while(finalTmp!=null && firstTmp!=null && secondTmp!=null){
		   if(firstTmp.getDataNode().getData()<secondTmp.getDataNode().getData()){
			   finalTmp.setNext(firstTmp);
			   firstTmp = firstTmp.getNext();
		   }
		   else{
			   finalTmp.setNext(secondTmp);
			   secondTmp = secondTmp.getNext();
		   }
		   finalTmp = finalTmp.getNext();
	   }
	   while(finalTmp!=null && firstTmp!=null){
		   finalTmp.setNext(firstTmp);
		   finalTmp = finalTmp.getNext();
		   firstTmp = firstTmp.getNext();
	   }
	   while(finalTmp!=null && secondTmp!=null){
		   finalTmp.setNext(secondTmp);
		   finalTmp = finalTmp.getNext();
		   secondTmp = secondTmp.getNext();
	   }
	   return finalHead;
   }
}
