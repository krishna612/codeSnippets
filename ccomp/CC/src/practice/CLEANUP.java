package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLEANUP {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  int T,n,m,count=0;
	  String[] finishedStr,inputStr;
	  
	  boolean[] bool;
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  T = Integer.parseInt(reader.readLine());
	  for(int i=0;i<T;i++){
		  inputStr = reader.readLine().split(" ");
		  n = Integer.parseInt(inputStr[0]);
		  m = Integer.parseInt(inputStr[1]);
		  bool = new boolean[n];
		  finishedStr = reader.readLine().split(" ");
		  for(int j=0;j<m;j++){
			  bool[Integer.parseInt(finishedStr[j])-1] = true;
		  }
		  count=1;
		  for(int k=0;k<n;k++){
			  if(bool[k]==false){
				  count++;
				  if(count%2==0){
					  System.out.print(k+1+" ");
				  }
			  }
		  }
		  System.out.println();
		  count=1;
		  for(int k=0;k<n;k++){
			  if(bool[k]==false){
				  count++;
				  if(count%2==1){
					  System.out.print(k+1+" ");
				  }
			  }
		  }
		  System.out.println();
	  }
	}

}
