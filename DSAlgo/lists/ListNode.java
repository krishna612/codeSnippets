package lists;

public class ListNode {
   private Data data;
   private ListNode next;
   
   public ListNode(){
	   
   }
   public ListNode(Data data){
	   this.data = data;
   }
   public Data getDataNode(){
	   return data;
   }
   
   public ListNode getNext(){
	   return next;
   }
   
   public void setDataNode(Data data){
	   this.data = data;
   }
   
   public void setNext(ListNode next){
	   this.next = next;
   }

   
}
