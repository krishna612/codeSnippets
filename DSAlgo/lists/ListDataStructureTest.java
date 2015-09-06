package lists;

public class ListDataStructureTest {
  public static void main(String[] args) throws NotAcceptableIndexException, EmptyListException {
	ListDataStructure list = new ListDataStructure();
	Data tmp;
	for(int i=0;i<10;i++){
		tmp = new Data(i);
		list.addAtEnd(tmp);
	}
	System.out.println("printing list: ");
	list.printList();
	ListDataStructure list1 = new ListDataStructure();
	Data tmp1;
	for(int i=0;i<10;i++){
		tmp1 = new Data(i);
		list1.addAtFront(tmp1);
	}
	System.out.println("printing list1: ");
	list1.printList();
	System.out.println("Test: inserting at certain position");
	Data insert = new Data(9999);
	list.addAtIndex(0, insert);
	list.printList();
	System.out.println("removig element at end: ");
	list.removeAtEnd();
	list.printList();
	System.out.println("removig element at front: ");
	list.removeAtFront();
	list.printList();
	System.out.println("get node at index 4");
	System.out.println(list.getNodeAtIndex(4).getDataNode().getData());
  }
}
