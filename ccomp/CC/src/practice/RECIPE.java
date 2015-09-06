package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RECIPE {
 public static int findGCD(int a,int b){
	 if(a<b){
		 int tmp=b;
		 b = a;
		 a = tmp;
	 }
	 if(b==0)
		 return a;
	 return findGCD(b,a%b);
 }
 public static void main(String[] args) throws NumberFormatException, IOException {
	int T,N,gcd;
	String[] inputStr;
	int[] input;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		inputStr = reader.readLine().split(" ");
		N = Integer.parseInt(inputStr[0]);
		input = new int[N];
		for(int j=1;j<=N;j++){
			input[j-1] = Integer.parseInt(inputStr[j]);
		}
		gcd = findGCD(input[0],input[1]);
		for(int k=2;k<N;k++){
			gcd = findGCD(gcd,input[k]);
		}
		for(int p=0;p<N;p++){
			System.out.print(input[p]/gcd+" ");
		}
		System.out.println();
	}
	 
 }
}
