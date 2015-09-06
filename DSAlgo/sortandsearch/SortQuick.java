package sortandsearch;

public class SortQuick implements SortInterface{
    
	@Override
	public void sort(Comparable[] inputArray) {
		internalSort(inputArray,0,inputArray.length-1);
	}
	
	private void internalSort(Comparable[] inputArray,int lower,int higher){
		if(lower>=higher) return;
		int partition = getPartition(inputArray,lower,higher);
		if(partition!=lower)//tricky case, results in stack overflow if not placed,just to get a glimpse think what happens if partition=0
		 internalSort(inputArray,lower,partition-1);
		if(partition!=higher)
		 internalSort(inputArray,partition+1,higher);
	}
	
	private int getPartition(Comparable[] inputArray,int lower,int higher){
		Comparable pivot = inputArray[lower];
		int lptr = lower+1;
		int rptr = higher;
		//the invariant we are striving for this as follows.
		//no element to the left of pivot must be greater than pivot
		//no element to the right of pivot must be less than pivot
		while((lptr<=higher) && (rptr>=lower) && (lptr<=rptr)){
			while(lptr<=higher &&inputArray[lptr].compareTo(pivot)<=0){
				lptr++;
			}
			//looks like equality case that is when pivot is equal to other elements its tricky
			while(rptr>=lower && inputArray[rptr].compareTo(pivot)>0){
				rptr--;
			}
			if(lptr<=rptr){
				//swap lptr and rptr
				Comparable tmp = inputArray[lptr];
				inputArray[lptr] = inputArray[rptr];
				inputArray[rptr] = tmp;
			}
		}
		//trick here is now to find to the index to where pivot must be swapped and same index must be returned.
		//consider the case when rptr = lptr we get the intution that rptr must be swapped with pivot
		//since its values must have been incremented if the value is at that intersection point will be greater than pivot
		//else case also rptr stays as it as where as lptr will be incremented
		inputArray[lower] = inputArray[rptr];
		inputArray[rptr] = pivot;
		return rptr;
	}

}
