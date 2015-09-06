package lists;

public class FindLoopedListTest {
  public static void main(String[] args) throws NotAcceptableIndexException {
	  ListDataStructure list = new ListDataStructure();
		Data tmp;
		for(int i=0;i<10;i++){
			tmp = new Data(i);
			list.addAtEnd(tmp);
		}
	   System.out.println("giving unlooped list: ");
	   FindLoopedList findLoop = new FindLoopedList();
	   System.out.println(findLoop.isListLooped(list.getHead()));
	   System.out.println("making the list looped: ");
	   list.getNodeAtIndex(list.getLength()/2).setNext(list.getHead());
	   System.out.println(findLoop.isListLooped(list.getHead()));
  }
}
