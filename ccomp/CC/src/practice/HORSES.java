package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HORSES {
  public static void main(String[] args) throws NumberFormatException, IOException {
   int T,N,minDif,prev;
   String[] inputStr;
   int[] input;
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   T = Integer.parseInt(reader.readLine());
   for(int i=0;i<T;i++){
	   minDif=1000000000;
	   N = Integer.parseInt(reader.readLine());
	   input = new int[N];
	   inputStr = reader.readLine().split(" ");
	   for(int j=0;j<N;j++){
		   input[j] = Integer.parseInt(inputStr[j]);
	   }
	   Arrays.sort(input);
	   int k=1;
	   prev=input[0];
	   while(k<N){
		   if(input[k]==prev){
			   minDif=0;
			   break;
		   }
		   else{
			   if(input[k]-prev<minDif){
				   minDif = input[k]-prev;
			     }
		   }
		   prev = input[k];
		   k++;
	   }
	   System.out.println(minDif);
   }
 }
}
