package advanceddatastructures;
//625 703
//we build heap using array as backing DS
public class MinHeap implements HeapInterface{
    private HeapNode array[];
	private int currentSize;
    private int capacity;
	
	public MinHeap(){
		this.capacity = 10;
		this.array = new HeapNode[this.capacity];
		this.currentSize = 0;
	}
	
	public MinHeap(int capacity){
		this.capacity = capacity;
		this.array = new HeapNode[this.capacity];
		this.currentSize = 0;
	}
	
	@Override
	public void insert(HeapNode node) {
		if(this.currentSize>=this.capacity){//double the size
			HeapNode[] newArray = new HeapNode[this.capacity*2];
			for(int i=0;i<this.currentSize;i++){
				newArray[i] = this.array[i];
			}
			this.array = newArray;
			this.capacity = this.capacity*2;
		}
		insertToArray(node);
	}
	
    
	private void insertToArray(HeapNode node) {
		int childIndex=this.currentSize;
		int parentIndex=0;
    	if(this.currentSize==0){
			array[0]=node;
			this.currentSize++;
		}
		else {
			HeapNode swapNode;
			array[this.currentSize]=node;
			this.currentSize++;
			while(childIndex>0){
				parentIndex=(childIndex-1)/2;
				if(this.array[parentIndex].compareTo(this.array[childIndex])<=0){
					break;
				}
				else{
					swapNode = this.array[childIndex];
					this.array[childIndex] = this.array[parentIndex];
					this.array[parentIndex] = swapNode;
					childIndex = parentIndex;
				}
			}//after this invariant the change must have to propagated to the top
		}
	}

	@Override
	public HeapNode getMin() throws EmptyHeapException{
		if(this.currentSize==0){
			throw new EmptyHeapException();
		}
		else
			return this.array[0];
	}

	@Override
	public HeapNode deleteMin() throws EmptyHeapException{
		HeapNode min = this.array[0];
		this.array[0] = this.array[this.currentSize-1];
		this.array[this.currentSize-1] = null;
		this.currentSize--;
		Heapify(0);
		return min;
	}
	
	private void Heapify(int parentIndex){
	   int leftIndex = 2*parentIndex+1;
	   int rightIndex = 2*parentIndex+2;
	   boolean isLeftSmaller=false;
	   if(leftIndex>=this.currentSize)
		   return;
	   if(rightIndex>=this.currentSize){
		    isLeftSmaller = true;//only left child is present
	   }
	   else{
		   if(this.array[leftIndex].compareTo(this.array[rightIndex])<0)
			   isLeftSmaller = true;
	   }
	   //its efficient to use iterative approach than recursive
	   if(isLeftSmaller==true){
		   //swap elements at parent and left index only if the former is greater
		   if(this.array[parentIndex].compareTo(this.array[leftIndex])>0){
			   HeapNode tmp = this.array[parentIndex];
			   this.array[parentIndex] = this.array[leftIndex];
			   this.array[leftIndex] = tmp;
			   Heapify(leftIndex);
		   }
		   else return;
	   }
	   else{
		   if(this.array[parentIndex].compareTo(this.array[leftIndex])>0){
			   HeapNode tmp = this.array[parentIndex];
			   this.array[parentIndex] = this.array[rightIndex];
			   this.array[rightIndex] = tmp;
			   Heapify(rightIndex);
		   }
		   else return;
	   }
	}

}
