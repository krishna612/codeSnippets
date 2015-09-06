package trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.TreePrinter;


public class BuildTreeFrom2OrderTraversalsTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BuildTreeFrom2OrderTraversals buildTree = new BuildTreeFrom2OrderTraversals();
		TreeNode[] inorder,preorder;
		System.out.println("enter length of order traversals: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		inorder = new TreeNode[n];
		preorder = new TreeNode[n];
		System.out.println("enter inorder traversal with space seperated: ");
		String[] inputStr = reader.readLine().split(" ");
		for(int i=0;i<n;i++){
			inorder[i] = new TreeNode(new Data(Integer.parseInt(inputStr[i])));
		}
		System.out.println("enter preorder traversal with space seperated: ");
		inputStr = reader.readLine().split(" ");
		for(int i=0;i<n;i++){
			preorder[i] = new TreeNode(new Data(Integer.parseInt(inputStr[i])));
		}
		TreeNode root = buildTree.buildTreeFromOrderTraversal(inorder, preorder);
		TreePrinter.printNode(root);
	}

}
