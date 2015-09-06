package sortandsearch;

public class SortInsert implements SortInterface{
    //240 254
	@Override
	public void sort(Comparable[] inputArray) {
		Comparable tmp = null;
		for(int i=1;i<inputArray.length;i++){//invariant here is items from 1 to i are sorted
			for(int j=i;j>0;j--){//pushing j into already sorted items of 1 to i
				//if previous element is in place compared to current item then stop because its preordered
				if(inputArray[j].compareTo(inputArray[j-1])<0){
				     tmp = inputArray[j];
				     inputArray[j] = inputArray[j-1];
				     inputArray[j-1] = tmp;
				}
			}
		}
	}

}
