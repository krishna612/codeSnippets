package advanceddatastructures;

public class StackUsingArrayTest {
  public static void main(String[] args) throws EmptyStackException {
	  StackUsingArray stack = new StackUsingArray();
	  //negative test
	  //stack.pop();
	  //stack.peek();
	  for(int i=0;i<12;i++){
		  DataNode tmp = new DataNode(i);
		  stack.push(tmp);
	  }
	  stack.push(new DataNode(12));
	  stack.push(new DataNode(13));
	  stack.push(new DataNode(14));
	  System.out.println(stack.peek().getData());
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
  }
}
