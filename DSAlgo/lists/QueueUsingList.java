package lists;

public class QueueUsingList {
	ListDataStructure list = new ListDataStructure();
	
	
	public void queue(Data data){
		list.addAtEnd(data);
	}
	
	public Data dequeue() throws EmptyListException{
		return list.removeAtFront();
	}
	
	public int getSize(){
		return this.list.getLength();
	}

}
