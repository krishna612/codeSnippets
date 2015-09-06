package lists;

public class StackUsingList {
	ListDataStructure list = new ListDataStructure();
	
	
	public void push(Data data){
		list.addAtEnd(data);
	}
	
	public Data pop() throws EmptyListException{
		return list.removeAtEnd();
	}
	
	public int getSize(){
		return this.list.getLength();
	}

}
