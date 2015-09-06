package sortandsearch;

import java.util.Arrays;

public class SortMerge extends SortUtil implements SortInterface{
    Comparable[] aux;
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		internalSort(a,0,a.length-1);
	}
	
	private void internalSort(Comparable[] a,int lower,int higher){
		if(lower>=higher) return;
		int mid = (lower+higher)/2;
		internalSort(a,lower,mid);//after this call lower to mid part of the aux array is sorted
		internalSort(a,mid+1,higher);//after this call mid+1 to higher part of the aux array is sorted
		merge(a,lower,higher);
	}
	//1048
	private void merge(Comparable[] a,int lower,int higher){
		int index = lower;
		int mid = (lower+higher)/2;
	    int lptr=lower,rptr=mid+1;
	    while((lptr<=mid) && (rptr<=higher)){
	    	if(SortUtil.isLess(a[lptr], a[rptr])){//lptr is strictly less than rptr
	    		aux[index] = a[lptr];
	    		index++;
	    		lptr++;
	    	}
	    	else{
	    		aux[index] = a[rptr];
	    		index++;
	    		rptr++;
	    	}
	    }
	    while(lptr<=mid){
	    	aux[index] = a[lptr];
    		index++;
    		lptr++;	
	    }
	    while(rptr<=higher){
	    	aux[index] = a[rptr];
    		index++;
    		rptr++;
	    }
	    for(int k=lower;k<=higher;k++){
			a[k] = aux[k];
		}
	}

}
