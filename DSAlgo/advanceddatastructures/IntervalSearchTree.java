package advanceddatastructures;
//634 649
public class IntervalSearchTree {
	IntervalTreeNode root = null;
  public void iterativeInsert(IntervalTreeNode node){
	  if(this.root==null)
		  this.root = node;
	  IntervalTreeNode tmp = this.root;
	  while(tmp.getLeft()!=null || tmp.getRight()!=null){
		  if(tmp.getX()>node.getX()){
			  tmp = tmp.getLeft();
		  }
		  else if(tmp.getX()<node.getX()){
			  tmp = tmp.getRight();
		  }
	  }
	}
}
