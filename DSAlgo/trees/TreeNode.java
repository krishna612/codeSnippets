package trees;

public class TreeNode {
  private Data data;
  private TreeNode right;
  private TreeNode left;
  
    public TreeNode(Data data){
    	this.data = data;
    	this.right = null;
    	this.left = null;
    }
	public Data getDataNode() {
		return data;
	}
	public void setDataNode(Data data) {
		this.data = data;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
}
