package dpandgreedy;

import java.util.ArrayList;

public class KnapsackBFTest {
 public static void main(String[] args) {
	 int n = 4;
	 int[] weights = {2,1,3,2};
	 int[] values = {12,10,20,15};
	 int capacity = 5;
	 KnapsackBF knap = new KnapsackBF(n,capacity,weights,values); 
	 ArrayList<Integer> list = knap.maxValList();
	 for(int i: list)
		 System.out.println(i);
 }
}
