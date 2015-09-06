package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MUFFINS3 {
  public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(reader.readLine());
	  int noOfCakes=0;
	  int maxPackSize=0,maxRemainder=0,rem=-1;
	  for(int i=0;i<T;i++){
		  maxPackSize=0;
		  maxRemainder=0;
		  rem=-1;
		  noOfCakes = Integer.parseInt(reader.readLine());
		  for(int j=1;j<=noOfCakes;j++){
			  rem = noOfCakes%j;
			  if(rem>=maxRemainder){
				  maxPackSize=j;
				  maxRemainder=rem;
			  }
		  }
		  System.out.println(maxPackSize);
	  }
  }
}
