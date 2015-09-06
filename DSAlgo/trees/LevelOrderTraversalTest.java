package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import util.TreePrinter;

public class LevelOrderTraversalTest {
    public static void main(String[] args) {
    	LevelOrderTraversal test = new LevelOrderTraversal();
    	//creating a binary tree
    	BSTDataStructure tree = new BSTDataStructure();
		Random rand = new Random();
		Data data,find=null;
		int tmp;
		System.out.println("inserting data to tree");
		for(int i=0;i<10;i++){
			tmp = rand.nextInt(100);
			data = new Data(tmp);
			tree.insertRecursive(data);
		}
		System.out.println("printing tree");
		TreePrinter.printNode(tree.getRoot());
		test.printLevelOrder(tree.getRoot());
	}
}
