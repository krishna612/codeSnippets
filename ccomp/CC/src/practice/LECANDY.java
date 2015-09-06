package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LECANDY {
  public static void main(String[] args) throws NumberFormatException, IOException {
	 int N,C,T,sum;
	 String[] inputStr;
	 int[] input;
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 T = Integer.parseInt(reader.readLine());
	 for(int i=0;i<T;i++){
		 sum = 0;
		 inputStr = reader.readLine().split(" ");
		 N = Integer.parseInt(inputStr[0]);
		 C = Integer.parseInt(inputStr[1]);
		 input = new int[N];
		 inputStr = reader.readLine().split(" ");
		 for(int j=0;j<N;j++){
			 input[j] = Integer.parseInt(inputStr[j]);
			 sum+=input[j];
		 }
		 if(sum<=C){
			 System.out.println("Yes");
		 }
		 else{
			 System.out.println("No");
		 }
	 }
  }
}
