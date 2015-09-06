package lists;

public class FindMiddleNodeTest {
	public static void main(String[] args) {
		 ListDataStructure list = new ListDataStructure();
			Data tmp;
			for(int i=0;i<11;i++){
				tmp = new Data(i);
				list.addAtEnd(tmp);
			}
		 System.out.println("finding middle node of the list: ");
		 FindMiddleNode middle = new FindMiddleNode();
		 ListNode mid = middle.findMiddle(list.getHead());
		 System.out.println(mid.getDataNode().getData());
	 }
}
