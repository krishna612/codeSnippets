package advanceddatastructures;
//934 954
public interface StackInterface {
 public DataNode peek() throws EmptyStackException;
 public DataNode pop() throws EmptyStackException;
 public void push(DataNode node);
 public boolean isEmpty();
 //public int size();
}
