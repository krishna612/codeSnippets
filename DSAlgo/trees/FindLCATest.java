package trees;

import java.util.Random;

import util.TreePrinter;
//438 449
public class FindLCATest {
  public static void main(String[] args) {
	    BSTDataStructure tree = new BSTDataStructure();
		Random rand = new Random();
		Data data,a=null,b=null;
		int tmp;
		System.out.println("inserting data to tree");
		for(int i=0;i<10;i++){
			tmp = rand.nextInt(100);
			data = new Data(tmp);
			if(i==3){a=data;}
		    if(i==7){b=data;}
			tree.insertRecursive(data);
		}
		System.out.println("printing tree");
		TreePrinter.printNode(tree.getRoot());
		FindLCA lcaFinder = new FindLCA();
		TreeNode lca = lcaFinder.findLCA(tree.getRoot(), a, b);
		System.out.println("lca of nodes"+a.getData()+" and "+b.getData()+" is: "+lca.getDataNode().getData());
  }
}
