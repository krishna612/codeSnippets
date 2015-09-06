package advanceddatastructures;

public class TowersOfHanoi {
  public void arrange(int size,StackUsingArray from,StackUsingArray to, StackUsingArray use) throws EmptyStackException{
	  
	  DataNode last=null;
	  if(size==1){
		last = from.pop();  
		System.out.println("moving element "+last.getData()+" from stack "+from.name+" to stack "+to.name);
		to.push(last);
		return;
	  }
	  arrange(size-1,from,use,to);//at this point c contains n-1 elements and we need to transfer max element from a to b
	  last = from.pop();
	  System.out.println("moving element "+last.getData()+" from stack "+from.name+" to stack "+to.name);
	  to.push(last);
	  //now we need to try to push all elements from c to b
	  arrange(size-1,use,to,from);
  }
}
