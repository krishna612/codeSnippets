package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CHEFSTON {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		String[] inputStr,inputA,inputB;
		int N,K,tmp;
		int[] A,B;
		BigInteger ans = new BigInteger("0");
		BigInteger tmpBI;
		for(int j=0;j<T;j++){
		ans = new BigInteger("0");
		inputStr = reader.readLine().split(" ");
		N = Integer.parseInt(inputStr[0]);
		K = Integer.parseInt(inputStr[1]);
		A = new int[N];
		B = new int[N];
		inputA = reader.readLine().split(" ");
		inputB = reader.readLine().split(" ");
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(inputA[i]);
			B[i] = Integer.parseInt(inputB[i]);
		}
		for(int i=0;i<N;i++){
			tmpBI = new BigInteger(Integer.toString((int)(K/A[i])*B[i]));
			if(tmpBI.compareTo(ans)>0){
				ans = tmpBI;
			}
		}
		  System.out.println(ans);
	  }
	}
}
