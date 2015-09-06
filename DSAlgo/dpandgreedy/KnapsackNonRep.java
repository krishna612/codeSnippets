package dpandgreedy;

import java.util.ArrayList;

import lists.Data;
import lists.ListDataStructure;

//516 537
public class KnapsackNonRep {
	ListDataStructure[][] list;
	int[][] M;
	int n,capacity;
	int[] values;
	int[] weights;
	
    
	public KnapsackNonRep(int n,int capacity,int[] weights,int[] values){
		this.n = n;
		this.values = values;
		this.weights = weights;
		this.capacity = capacity;
		this.M = new int[n][capacity];
		list = new ListDataStructure[n][capacity];
	}
	
	public int max(int a, int b){
		if (a>b)
			return a;
		else
			return b;
	}
	
	public ListDataStructure maxValList(){
		//we can treat index i,j in the array as i+1 and j+1 in the problem definition which means i=0,j=0 in the array represents first i item with capacity 1.
		//we fill M by row wise
		//here i represents item number and j represents knapsack of capacity j
		for(int j=0;j<capacity;j++){//only first item is present
			//we are considering first row, there is two possibilities for values of this row whether values[0] or 0
			if(weights[0]<=j){
				M[0][j] = values[0];
			}
			//else condition is not required assuming array default value is 0.
		}
		for(int i=0;i<n;i++){//knapsack of weight 1
			
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<capacity;j++){
				list[i][j] = new ListDataStructure();
				if(weights[i]<=j){
					if(M[i-1][j-weights[i]]+values[i] >= M[i-1][j]){
						list[i][j].addAtEnd(new Data(i));
						M[i][j] = M[i-1][j-weights[i]]+values[i];
					}
					else{
						M[i][j] = M[i-1][j];
					}
				}
				else{
					M[i][j] = M[i-1][j];
				}
			}
		}
		return list[n-1][capacity-1];
	}
}
