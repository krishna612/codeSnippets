package advanceddatastructures;

public class IntervalTreeNode {
    private int x,y,maxSubRootSum;
    private IntervalTreeNode left,right,parent;
    
    public IntervalTreeNode getLeft() {
		return left;
	}
	public void setLeft(IntervalTreeNode left) {
		this.left = left;
	}
	public IntervalTreeNode getRight() {
		return right;
	}
	public void setRight(IntervalTreeNode right) {
		this.right = right;
	}
	public IntervalTreeNode getParent() {
		return parent;
	}
	public void setParent(IntervalTreeNode parent) {
		this.parent = parent;
	}
	public IntervalTreeNode(int x,int y){
    	this.x = x;
    	this.y = y;
    }
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMaxSubRootSum() {
		return maxSubRootSum;
	}

	public void setMaxSubRootSum(int maxSubRootSum) {
		this.maxSubRootSum = maxSubRootSum;
	}

}
