import java.io.BufferedReader;
import java.math.BigInteger;
import java.io.IOException;
import java.io.InputStreamReader;


public class FillingJarsV1 {
  
	public static void main(String[] args) throws IOException {
		int N=0,M=0,a=0,b=0,k=0;
		BigInteger tmp = new BigInteger("0");
		BigInteger sum = new BigInteger("0");
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    inputStr = reader.readLine().split(" ");
	    N = Integer.parseInt(inputStr[0]);
	    M = Integer.parseInt(inputStr[1]);
	    while(M>0){
	    	inputStr = reader.readLine().split(" ");
		    a = Integer.parseInt(inputStr[0]);
		    b = Integer.parseInt(inputStr[1]);
		    k = Integer.parseInt(inputStr[2]);
		    tmp=new BigInteger(Integer.toString(b-a+1)).multiply(new BigInteger(Integer.toString(k)));
		    sum = sum.add(tmp);
	    	M--;
	    }
	    sum = sum.divide(new BigInteger(Integer.toString(N)));
	    System.out.println(sum);
	}
}
