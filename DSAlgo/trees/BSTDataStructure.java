package trees;

public class BSTDataStructure implements BinaryTreesGenInterface {
    private TreeNode root;
	@Override
	public void insertRecursive(Data data) {
		insertRecursive(root,data);
	}
    
	private void insertRecursive(TreeNode node,Data data){
		//if the tree is empty,make the first element as root
		if(node==null){
			this.root = new TreeNode(data);
	        return;
		}
		//if both right and left are null then its time to insert
		if(node.getLeft()==null && node.getRight()==null){
			if(node.getDataNode().compareTo(data)==1){
				node.setLeft(new TreeNode(data));
			}
			if(node.getDataNode().compareTo(data)==-1){
				node.setRight(new TreeNode(data));
			}
			return;
		}
		//all increasing sequence for else condition
		if(node.getLeft()==null){
			if(node.getDataNode().compareTo(data)==1){
				node.setLeft(new TreeNode(data));
			}
			else{
			    insertRecursive(node.getRight(),data);
			}
		}
		//all decreasing sequence for else condition
		if(node.getRight()==null){
			if(node.getDataNode().compareTo(data)==-1){
				node.setRight(new TreeNode(data));
			}
			else{
			    insertRecursive(node.getLeft(),data);
			}
		}
		//now at this point both left and right nodes must not be null
		if(node.getDataNode().compareTo(data)==1)
			insertRecursive(node.getLeft(),data);
		if(node.getDataNode().compareTo(data)==-1)
			insertRecursive(node.getRight(),data);
	}
	@Override
	public void insertNonRecursive(Data data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean findElementRecursive(Data data) {
		return findElementRecursive(this.root,data);
	}
	
	public boolean findElementRecursive(TreeNode node,Data data) {
		if(node==null)
			return  false;
		if(node.getDataNode().compareTo(data)==0)
			return true;
		if(node.getDataNode().compareTo(data)==1)
			return findElementRecursive(node.getLeft(),data);
		else
			return findElementRecursive(node.getRight(),data);
	}

	@Override
	public boolean findElementNonRecursive(Data data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteRecursive(Data data) {
		TreeNode successor = findSuccessorIterative(data);
		TreeNode toBeDeleted = getElementNodeRecursive(data);
		//swap both the data items
		Data tmp = successor.getDataNode();
		successor.setDataNode(toBeDeleted.getDataNode());
		toBeDeleted.setDataNode(tmp);
		successor = null;
	}

	@Override
	public void deleteNonRecursive(Data data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TreeNode getRoot() {
		return this.root;
	}

	public void setRoot(TreeNode node){
		this.root = node;
	}

	@Override
	public TreeNode findSuccessorIterative(Data data) {
		TreeNode node = getElementNodeRecursive(data);
		if(node.getRight()==null) return null;
		node = node.getRight();
		while(node.getLeft()!=null){
			node = node.getLeft();
		}
		return node;
	}

	@Override
	public TreeNode findSuccessorRecursive(Data data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TreeNode getElementNodeRecursive(Data data) {
		return getElementNodeRecursive(this.root,data);
	}

	
	public TreeNode getElementNodeRecursive(TreeNode node,Data data) {
		if(node==null)
			return  null;
		if(node.getDataNode().compareTo(data)==0)
			return node;
		if(node.getDataNode().compareTo(data)==1)
			return getElementNodeRecursive(node.getLeft(),data);
		else
			return getElementNodeRecursive(node.getRight(),data);	
	}
}
