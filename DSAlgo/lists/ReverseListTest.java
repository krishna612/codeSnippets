package lists;

public class ReverseListTest {
 public static void main(String[] args) {
	 ListDataStructure list = new ListDataStructure();
		Data tmp;
		for(int i=0;i<10;i++){
			tmp = new Data(i);
			list.addAtEnd(tmp);
		}
	 System.out.println("before reversing list: ");
	 list.printList();
	 ReverseList reverse = new ReverseList(list);
	 reverse.reverseList();
	 System.out.println("after reversing list: ");
	 list.printList();
 }
}
