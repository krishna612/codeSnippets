package advanceddatastructures;

public class StackGivesMaxTest {
  public static void main(String[] args) throws EmptyStackException {
	  StackGivesMax findMax = new StackGivesMax();
	  findMax.push(new DataNode(6));
	  System.out.println(findMax.getMax().getData());
	  findMax.push(new DataNode(9));
	  System.out.println(findMax.getMax().getData());
	  findMax.push(new DataNode(-1));
	  System.out.println(findMax.getMax().getData());
	  findMax.push(new DataNode(10));
	  System.out.println(findMax.getMax().getData());
	  findMax.pop();
	  System.out.println(findMax.getMax().getData());
  }
}
