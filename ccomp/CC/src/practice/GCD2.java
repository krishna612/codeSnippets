package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class GCD2 {
 public static BigInteger findGCD(BigInteger a, BigInteger b){
	 if(a.signum()==0){
		 return b;
	 }
	 else
	  return findGCD(b.mod(a),a);
 }
 public static void main(String[] args) throws NumberFormatException, IOException {
   	int T;
   	BigInteger A,B;
   	String[] inputStr;
   	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   	T = Integer.parseInt(reader.readLine());
   	for(int i=0;i<T;i++){
   		inputStr = reader.readLine().split(" ");
   		A = new BigInteger(inputStr[0]);
   		B = new BigInteger(inputStr[1]);
   	    System.out.println(findGCD(A,B));
   	}
 }

}
