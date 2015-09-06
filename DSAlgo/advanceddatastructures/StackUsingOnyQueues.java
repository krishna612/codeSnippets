package advanceddatastructures;

import java.util.ArrayList;

import lists.QueueUsingList;

//943 952 522 545
public class StackUsingOnyQueues implements StackInterface {
	//for now using library methods for implementing queues, since there is a tight coupling between the queue using list and the data node there.
	//should be replaced by own class once I am done with queue using array.
    ArrayList<DataNode> queue1 = new ArrayList<DataNode>();
    ArrayList<DataNode> queue2 = new ArrayList<DataNode>();
	
    @Override
	public DataNode peek() throws EmptyStackException {
    	DataNode popped = null;
		if(isEmpty()){
			throw new EmptyStackException();
		}
		else if(queue1.isEmpty()){
			while(queue2.size()>1){
				queue1.add(queue2.remove(0));
			}
			popped = queue2.get(0);
			queue1.add(queue2.remove(0));
		}
		else{
			while(queue1.size()>1){
				queue2.add(queue1.remove(0));
			}
			popped = queue1.get(0);
			queue2.add(queue1.remove(0));
		}
		return popped;
	}

	@Override
	public DataNode pop() throws EmptyStackException {
		DataNode popped = null;
		if(isEmpty()){
			throw new EmptyStackException();
		}
		else if(queue1.isEmpty()){
			while(queue2.size()>1){
				queue1.add(queue2.remove(0));
			}
			popped = queue2.remove(0);
		}
		else{
			while(queue1.size()>1){
				queue2.add(queue1.remove(0));
			}
			popped = queue1.remove(0);
		}
		return popped;
	}

	@Override
	public void push(DataNode node) {
		if(isEmpty()){
			queue1.add(node);
		}
		else if(queue1.isEmpty()){
			queue2.add(node);
		}
		else{
			queue1.add(node);
		}
	}

	@Override
	public boolean isEmpty() {
		return (queue1.isEmpty() && queue2.isEmpty());
	}

	
 
}
