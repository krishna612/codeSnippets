package trees;
//657 712
public class FindLCA {
   BSTDataStructure tree = new BSTDataStructure();
   public TreeNode findLCA(TreeNode root,Data a, Data b){
	   if(root==null)
		   return null;
       TreeNode lca = null;
	   boolean al,bl,ar,br;
	   al = tree.findElementRecursive(root.getLeft(),a);
	   bl = tree.findElementRecursive(root.getLeft(),b);
	   ar = tree.findElementRecursive(root.getRight(),a);
	   br = tree.findElementRecursive(root.getRight(),b);
	   if(al&&bl==true){
		   if((root.getLeft().getDataNode().compareTo(a)==0)||(root.getLeft().getDataNode().compareTo(b)==0)){
			   lca = root;
		   }
		   else
		       lca = findLCA(root.getLeft(),a,b);
	   }
	   else if(ar&&br==true){
		   if((root.getRight().getDataNode().compareTo(a)==0)||(root.getRight().getDataNode().compareTo(b)==0)){
			   lca = root;
		   }
		   else
		       lca = findLCA(root.getRight(),a,b);
	   }
	   else if((al&&br ==true) || (ar&&bl ==true)){
		   lca = root;
	   }
	   return lca;
   }
}
