package advanceddatastructures;

public class TowersOfHanoiTest {
  public static void main(String[] args) throws EmptyStackException {
	  StackUsingArray a = new StackUsingArray();
	  a.name = "A";
	  StackUsingArray b = new StackUsingArray();
	  b.name = "B";
	  StackUsingArray c = new StackUsingArray();
	  c.name = "C";
	  for(int i=5;i>=1;i--){
		  a.push(new DataNode(i));
	  }
	  TowersOfHanoi hanoi = new TowersOfHanoi();
	  hanoi.arrange(a.getSize(), a, b, c);
  }
}
