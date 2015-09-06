package advanceddatastructures;

public class TernarySearchTreeTest {
	public static void main(String[] args) {
		TernarySearchTree tree = new TernarySearchTree();
		tree.insert("cat", "a type of animal");
		String val = tree.getWord("cat");
		System.out.println("printing value: "+val);
	}

}
