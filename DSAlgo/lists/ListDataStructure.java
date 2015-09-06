package lists;

public class ListDataStructure {
	private ListNode head;
    private  int length;
	
	public ListNode getHead() {
		return this.head;
	}
	
	public void setHead(ListNode node){
		this.head = node;
	}
	
	public int getLength(){
		return this.length;
	}

	public void addAtEnd(Data data){
		if(this.head==null){
			this.head = new ListNode();
			this.head.setDataNode(data);
			return;
		}
		ListNode tmpNode = this.head;
		while(tmpNode.getNext()!=null){
			tmpNode = tmpNode.getNext();
		}
		tmpNode.setNext(new ListNode(data));
		this.length++;
	}
	
	public void addAtFront(Data data){
		if(this.head==null){
			this.head = new ListNode();
			this.head.setDataNode(data);
			return;
		}
		ListNode tmpNode = new ListNode(data);
		tmpNode.setNext(this.head);
		this.head = tmpNode;
		this.length++;
	}
	
	public void printList(){
		ListNode tmpNode = head;
		while(tmpNode.getNext()!=null){
			System.out.print(tmpNode.getDataNode().getData()+"->");
			tmpNode = tmpNode.getNext();
		}
		System.out.println(tmpNode.getDataNode().getData());
	}
	
	public void addAtIndex(int index, Data data) throws NotAcceptableIndexException{
		if(index<0 || index>length){
			throw new NotAcceptableIndexException();
		}
		if(index==0){
			addAtFront(data);
			return;
		}
		ListNode insertNode = new ListNode(data);
		if(this.head==null){
			this.head = insertNode;
		}
		ListNode tmpNode = this.head;
		int i=0;
		while(i<index-1){
			tmpNode = tmpNode.getNext();
			i++;
		}
		insertNode.setNext(tmpNode.getNext());
		tmpNode.setNext(insertNode);
		this.length++;
	}
	
	public Data removeAtEnd() throws EmptyListException{
		if(this.length==0){
			throw new EmptyListException();
		}
		ListNode tmpNode = this.head;
		ListNode prev = null;
		if(this.length==1){
			this.head = null;
			length--;
			return tmpNode.getDataNode();
		}
		while(tmpNode.getNext()!=null){
			prev = tmpNode;
			tmpNode = tmpNode.getNext();
		}
		prev.setNext(null);
		length--;
		return tmpNode.getDataNode();
	}
	
	public Data removeAtFront() throws EmptyListException{
		if(this.length==0){
			throw new EmptyListException();
		}
		ListNode tmpNode = this.head;
		this.head = this.head.getNext();
		tmpNode.setNext(null);
		length--;
		return tmpNode.getDataNode();
	}
	
	public ListNode getNodeAtIndex(int i) throws NotAcceptableIndexException{
		if(i>=this.length || i<0){
			throw new NotAcceptableIndexException();
		}
		ListNode node = this.head;
		while(i>0){
			node = node.getNext();
			i--;
		}
		return node;
	}
}
