package trees;
import java.util.Random;

import util.TreePrinter;

public class BSTDataStructureTest {
	public static void main(String[] args) {
		BSTDataStructure tree = new BSTDataStructure();
		Random rand = new Random();
		Data data,find=null;
		int tmp,tmp1;
		System.out.println("inserting data to tree");
		for(int i=0;i<10;i++){
			tmp = rand.nextInt(100);
			data = new Data(tmp);
			if(i==5){tmp1 = tmp;find = new Data(tmp1);}
			tree.insertRecursive(data);
		}
		
		System.out.println("printing tree");
		TreePrinter.printNode(tree.getRoot());
		System.out.println("find operation test: ");
		System.out.println("element in tree "+find.getData()+" is found: "+tree.findElementRecursive(find));
		System.out.println("1000 is found: "+tree.findElementRecursive(new Data(1000)));
		
		System.out.println("delete operation test: ");
		tree.deleteRecursive(find);
		System.out.println("printing tree after delte operation: ");
		TreePrinter.printNode(tree.getRoot());
	}

}
