package trees;

public interface BinaryTreesGenInterface {
    public void insertRecursive(Data data);
    public void insertNonRecursive(Data data);
    public boolean findElementRecursive(Data data);
    public TreeNode getElementNodeRecursive(Data data);
    public boolean findElementNonRecursive(Data data);
    public void deleteRecursive(Data data);
    public void deleteNonRecursive(Data data);
    public TreeNode findSuccessorIterative(Data data);
    public TreeNode findSuccessorRecursive(Data data);
    public TreeNode getRoot();
}
