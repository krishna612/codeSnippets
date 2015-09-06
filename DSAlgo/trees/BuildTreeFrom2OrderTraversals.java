package trees;

import graphs.GraphNode;
//622 652
public class BuildTreeFrom2OrderTraversals {
    TreeNode[] inorder,preorder;
	public TreeNode buildTreeFromOrderTraversal(TreeNode[] inorder,TreeNode[] preorder){
		this.inorder = inorder;
		this.preorder = preorder;
		TreeNode root = buildTree(0,inorder.length-1,0,preorder.length-1);
		return root;
	}
	
	private TreeNode buildTree(int inorderLeft,int inorderRight,int preorderLeft,int preorderRight){
		if(inorderLeft==inorderRight && preorderLeft==preorderRight){
			return preorder[preorderLeft];
		}
		
		TreeNode root = preorder[preorderLeft];
		int index = inorderLeft;
		for(int i=inorderLeft;i<=inorderRight;i++){
			if(inorder[i].getDataNode().getData()==root.getDataNode().getData()){
				index = i;
				break;
			}
		}
		//dealing with a bug here, case is simple what if index value is such that following calls will be out of array index boundaries
		//preorder indices were the culprit here, needs to be designed carefully
		if(index>=inorderLeft+1)
		 root.setLeft(buildTree(inorderLeft,index-1,preorderLeft+1,preorderLeft+1+(index-1-inorderLeft)));
		else
		 root.setLeft(null);
		if(index<=inorderRight-1)
		 root.setRight(buildTree(index+1,inorderRight,preorderRight-(inorderRight-index-1),preorderRight));
		else
		 root.setRight(null);
		return root;
	}

}
