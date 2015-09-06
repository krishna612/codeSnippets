package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MUFFINS3V2 {
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
		  System.out.println((noOfCakes/2)+1);
	  }
  }
}
