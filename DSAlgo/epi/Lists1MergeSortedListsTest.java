package epi;

import lists.Data;
import lists.ListDataStructure;
import lists.ListNode;

public class Lists1MergeSortedListsTest {
	public static void main(String[] args) {
		ListDataStructure list1 = new ListDataStructure();
		ListDataStructure list2 = new ListDataStructure();
		//test1
//		list1.addAtEnd(new Data(1));
//		list1.addAtEnd(new Data(3));
//		list1.addAtEnd(new Data(5));
//		list1.addAtEnd(new Data(7));
//		list1.addAtEnd(new Data(19));
//		list1.addAtEnd(new Data(21));
//		list2.addAtEnd(new Data(2));
//		list2.addAtEnd(new Data(4));
//		list2.addAtEnd(new Data(6));
//		list2.addAtEnd(new Data(8));
//		list2.addAtEnd(new Data(10));
		//test2
		list1.addAtEnd(new Data(1));
		list1.addAtEnd(new Data(3));
		list1.addAtEnd(new Data(4));
		Lists1MergeSortedLists mergeLists = new Lists1MergeSortedLists();
		ListNode head = mergeLists.merge(list1.getHead(), list2.getHead());
		while(head!=null){
			System.out.println(head.getDataNode().getData());
			head = head.getNext();
		}
	}

}
