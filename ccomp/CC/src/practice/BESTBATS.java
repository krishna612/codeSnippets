package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BESTBATS {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	  int[] fact = new int[12];
	  int[] input;
	  int T,K,count,p,prev;
	  String[] inputStr;
	  fact[0] = 1;
	  for(int i=1;i<12;i++){
		  fact[i]=i*fact[i-1];
	  }
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  T = Integer.parseInt(reader.readLine());
	  for(int i=0;i<T;i++){
		  count = 1;
		  inputStr = reader.readLine().split(" ");
		  K = Integer.parseInt(reader.readLine());
		  input = new int[inputStr.length];
		  for(int j=0;j<inputStr.length;j++){
			  input[j] = Integer.parseInt(inputStr[j]);
		  }
		  Arrays.sort(input);
		  p = inputStr.length-2;
		  prev = input[inputStr.length-1];
		  while(p>=0){
			  while(p>=0&&input[p]==prev){
				  count++;
				  p--;
			  }
			  
				  if(count<=K){
					  K-=count;
				  }
				  else{
					  System.out.println((fact[count])/(fact[K]*fact[count-K]));
					  break;
				  }
			  prev = input[p];
			  p--;
			  count=1;
		  }
	  }
	}

}
