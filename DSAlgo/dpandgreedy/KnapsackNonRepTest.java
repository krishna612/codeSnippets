package dpandgreedy;

import java.util.ArrayList;

import lists.ListDataStructure;

public class KnapsackNonRepTest {
 public static void main(String[] args) {
	 int n = 4;
	 int[] weights = {2,1,3,2};
	 int[] values = {12,10,20,15};
	 int capacity = 5;
	 KnapsackNonRep knap = new KnapsackNonRep(n,capacity,weights,values); 
	 ListDataStructure list = knap.maxValList();
	 list.printList();
 }
}
