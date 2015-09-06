package lists;

public class StackUsingListTest {
  public static void main(String[] args) throws EmptyListException {
	  StackUsingList stack = new StackUsingList();
	  //System.out.println(stack.pop().getData());
	  Data tmp;
		for(int i=0;i<5;i++){
			tmp = new Data(i);
			stack.push(tmp);
		}
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
	  System.out.println(stack.pop().getData());
  }
}
