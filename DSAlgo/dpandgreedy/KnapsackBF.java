package dpandgreedy;

import java.math.BigInteger;
import java.util.ArrayList;

public class KnapsackBF {
	ArrayList<Integer> list;
	int[][] M;
	int n,capacity;
	int[] values;
	int[] weights;
	
    
	public KnapsackBF(int n,int capacity,int[] weights,int[] values){
		this.n = n;
		this.values = values;
		this.weights = weights;
		this.capacity = capacity;
		this.M = new int[n][capacity];
		list = new ArrayList<Integer>();
	}
	
	public int max(int a, int b){
		if (a>b)
			return a;
		else
			return b;
	}
	
	public ArrayList<Integer> maxValList(){
	    Boolean bool = false,moreWeight=false;
	    int maxSum=0,tmpSum=0,tmpWeight=0;
		BigInteger maxPow = new BigInteger(Integer.toString(n));	
	    BigInteger one = new BigInteger("1");
	    maxPow = maxPow.pow(n);
	    for(BigInteger bigI= one ; bigI.compareTo(maxPow)<0;bigI=bigI.add(one)){
	        tmpSum = 0;
	        tmpWeight = 0;
	        moreWeight = false;
	    	for(int i=0;i<n;i++){
	        	bool = bigI.testBit(i);
	        	if(bool==true){
	        		if(tmpWeight+weights[i]<=capacity){
	        			tmpWeight+=weights[i];
	        			tmpSum+=values[i];
	        		}
	        		else{
	        			moreWeight = true;
	        			break;
	        		}
	        	}
	        }
	    	if((moreWeight==false) && (tmpSum>maxSum)){
	    		list.clear();
	    		maxSum = tmpSum;
	    		for(int i=0;i<n;i++){
	    		    bool = bigI.testBit(i);
	    		    if(bool==true){
	    		    	list.add(i);
	    		    }
	    		}
	    	}
	    }
		return list;
	}
	
}
