package advanceddatastructures;
//array is a natural data structure for representing stack, visualize stack as array with lower index at  bottom and index keep on growing upwards
public class StackUsingArray implements StackInterface{
    private DataNode[] array;
    private int size;
    public String name;//required for towers of hanoi problem better visualization
	
    public StackUsingArray(int size){
    	this.array = new DataNode[size];
    }
    
    public StackUsingArray(){
    	this.array = new DataNode[10];
    }
    
    public int getSize(){
    	return this.size;
    }
    
    @Override
	public DataNode peek() throws EmptyStackException {
    	if(this.size==0){
 		   throw new EmptyStackException();
 	    }
		return array[size-1];
	}

	@Override
	public DataNode pop() throws EmptyStackException{
	   DataNode tmp = null;
	   if(this.size==0){
		   throw new EmptyStackException();
	   }
	   tmp = array[this.size-1];
	   array[this.size-1] = null;
	   this.size--;
	   return tmp;
	}

	@Override
	public void push(DataNode node) {
	   //we could have seperated copying logic from inserting logic by creating another method.
	   if (size==array.length){//array is full we need to create a new array and copy contents before pushing it
		   DataNode[] tmp = new DataNode[this.size*2];
		   for(int i=0;i<this.size;i++){
			   tmp[i] = this.array[i];
		   }
		   this.array = tmp;
	   }
	   array[this.size] = node;
	   this.size++;
	}

	@Override
	public boolean isEmpty() {
		return this.size==0;
	}

	
	public int size() {
	  return this.size;
	}

}
