package advanceddatastructures;

public class StackUsingOnlyQueuesTest {
  public static void main(String[] args) throws EmptyQueueException, EmptyStackException {
	StackUsingOnyQueues stack = new StackUsingOnyQueues();
	stack.push(new DataNode(1));
	stack.push(new DataNode(2));
	System.out.println(stack.peek().getData());
	stack.push(new DataNode(3));
	System.out.println(stack.pop().getData());
	System.out.println(stack.pop().getData());
  }
}
