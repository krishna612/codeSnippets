package advanceddatastructures;
//implementing a stack which gives max elements in constant time using additional space
//8.1 STACK WITH MAX OPERATION: p70
//630 645
public class StackGivesMax implements StackInterface {
    StackUsingArray stack,maxStack;
    
    public StackGivesMax(){
    	stack = new StackUsingArray();
    	maxStack = new StackUsingArray();
    }
    
    public DataNode getMax() throws EmptyStackException {
    	return maxStack.peek();
    }

	@Override
	public DataNode peek() throws EmptyStackException {
		return stack.peek();
	}
	
	@Override
	public DataNode pop() throws EmptyStackException {
		maxStack.pop();
		return stack.pop();
	}
	
	@Override
	public void push(DataNode node) {
		DataNode peek = null;
		stack.push(node);
		if(maxStack.isEmpty()){
			maxStack.push(node);
		}
		else{
			try {
				peek = maxStack.peek();
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
			if(peek.getData()>=node.getData()){
				maxStack.push(peek);
			}
			else{
				maxStack.push(node);
			}
		}
	}
	
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
