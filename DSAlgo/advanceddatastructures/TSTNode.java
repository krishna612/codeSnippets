package advanceddatastructures;

public class TSTNode {
	private char key;
	private String value;
	private TSTNode left,right,equal;
	
	public char getKey() {
		return key;
	}
	public void setKey(char key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public TSTNode getLeft() {
		return left;
	}
	public void setLeft(TSTNode left) {
		this.left = left;
	}
	public TSTNode getRight() {
		return right;
	}
	public void setRight(TSTNode right) {
		this.right = right;
	}
	public TSTNode getEqual() {
		return equal;
	}
	public void setEqual(TSTNode equal) {
		this.equal = equal;
	}

}
