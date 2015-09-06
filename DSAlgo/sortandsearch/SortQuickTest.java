package sortandsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortQuickTest {
  public static void main(String[] args) throws IOException {
	SortQuick quick = new SortQuick();
	Integer[] a;
	String[] inputStr;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.err.println("quicksort: enter space seperated numbers to be sorted : ");
	inputStr = reader.readLine().split(" ");
	a = new Integer[inputStr.length];
	for(int i=0;i<a.length;i++){
		a[i] = Integer.parseInt(inputStr[i]);
	}
	
	System.out.println("before sorting:");
	SortUtil.print(a);//735
    quick.sort(a);
	System.out.println("after sorting: ");
	SortUtil.print(a);
  }
}
