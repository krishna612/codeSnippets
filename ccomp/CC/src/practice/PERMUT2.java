package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PERMUT2 {
  public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 int  T = Integer.parseInt(reader.readLine().trim());
	 String[] inputStr;
	 int[] input,inverse;
	 while(T!=0){
		 inputStr = reader.readLine().trim().split(" ");
		 input = new int[inputStr.length];
		 inverse = new int[inputStr.length];
		 for(int i=0;i<inputStr.length;i++){
			 input[i] = Integer.parseInt(inputStr[i]);
			 inverse[input[i]-1] = i+1;
		 }
		 int j;
		 for(j=0;j<inputStr.length;j++){
			 if(input[j]!=inverse[j])
				 break;
		 }
		 if(j==inputStr.length)
			 System.out.println("ambiguous");
		 else
			 System.out.println("not ambiguous");
		 T = Integer.parseInt(reader.readLine().trim());
	 }
  }
}
