package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PLZLYKME {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BigInteger l,s,c,res;	
	  int T,d;
	  String[] str;
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  T = Integer.parseInt(reader.readLine());
	  for(int i=0;i<T;i++){
		  str = reader.readLine().split(" ");
		  l = new BigInteger(str[0]);
		  d = Integer.parseInt(str[1]);
		  s = new BigInteger(str[2]);
		  c = new BigInteger(str[3]);
		  c.add(new BigInteger("1"));
		  res = c.pow(d);
		  res = res.multiply(s);
		  if(s.compareTo(l)==-1){
			  System.out.println("DEAD AND ROTTING");
		  }
		  else{
			  System.out.println("ALIVE AND KICKING");
		  }
	  }
	}

}
