package trees;
import java.util.ArrayList;
import java.util.Random;

import util.TreePrinter;
//504,518
public class Epi99LinkedListFromLeavesOfBTTest {
	public static void main(String[] args) {
		Epi99LinkedListFromLeavesOfBT testGetLeaves = new Epi99LinkedListFromLeavesOfBT();
		BSTDataStructure tree = new BSTDataStructure();
		Random rand = new Random();
		for(int i=0;i<10;i++){
			int tmp = rand.nextInt(100);
			tree.insertRecursive(new Data(tmp));
		}
		TreePrinter.printNode(tree.getRoot());
		ArrayList<TreeNode> list = testGetLeaves.getLeavesList(tree.getRoot());
		System.out.println("printing leave nodes of the tree: ");
		for(TreeNode itr: list){
			System.out.print(itr.getDataNode().getData()+" ");
		}
	}
}
