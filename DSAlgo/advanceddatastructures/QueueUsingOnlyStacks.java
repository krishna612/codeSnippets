package advanceddatastructures;
//526 557
public class QueueUsingOnlyStacks implements QueueInterface{
	StackUsingArray stack1,stack2;
    int current=0; //we can use enum as well, it can take only  0,1,2
	
    
    public QueueUsingOnlyStacks(){
       stack1 = new StackUsingArray();	
       stack2 = new StackUsingArray();	
    }
    
	@Override
	public DataNode top() throws EmptyQueueException {
		DataNode poppedNode = null;
		if(stack1.isEmpty() && stack2.isEmpty()){
			throw new EmptyQueueException();
		}
		else if (current==2){
			try {
				poppedNode = stack2.peek();
			} catch (EmptyStackException e) {
			   e.printStackTrace();
			}
		}
		else{
			while(!stack1.isEmpty()){
				try {
					stack2.push(stack1.pop());
				} catch (EmptyStackException e) {
					e.printStackTrace();
				}
			}
			try {
				poppedNode = stack2.peek();
				current = 2;
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
		}
		return poppedNode;
	}

	@Override
	public DataNode dequeue() throws EmptyQueueException {
		DataNode poppedNode = null;
		if(stack1.isEmpty() && stack2.isEmpty()){
			throw new EmptyQueueException();
		}
		else if (current==2){
			try {
				poppedNode = stack2.pop();
			} catch (EmptyStackException e) {
			   e.printStackTrace();
			}
		}
		else{
			while(!stack1.isEmpty()){
				try {
					stack2.push(stack1.pop());
				} catch (EmptyStackException e) {
					e.printStackTrace();
				}
			}
			try {
				poppedNode = stack2.pop();
				current = 2;
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
		}
		return poppedNode;
	}

	@Override
	public void enqueue(DataNode node){
		if(stack1.isEmpty() && stack2.isEmpty()){
			stack1.push(node);
			current = 1;
		}
		else if(current ==1){
			stack1.push(node);
		}
		else{
			while(!stack2.isEmpty()){
				try{
				  stack1.push(stack2.pop());
				}
				catch(Exception e){
				   e.printStackTrace();	
				}
			}
		    stack1.push(node);
		    current = 1;
		}
	}
   
}
