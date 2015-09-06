import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class NikkuGF {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int n,min,minFreq,max,maxFreq;
		BigInteger noOfWays;
		String[] inputStr;
		int[] input;
		for(int i=0;i<T;i++){
			n = Integer.parseInt(reader.readLine());
			min = 1000000009;
			max = 0;
			maxFreq = 0; minFreq = 0;
			noOfWays = new BigInteger("0");
			input = new int[n];
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<n;j++){
				input[j] = Integer.parseInt(inputStr[j]);
			}
			for(int k=0;k<n;k++){
				if(input[k]>max){
					max = input[k];
					maxFreq = 0;
				}
				if(input[k]<min){
					min = input[k];
					minFreq = 0;
				}
				if(input[k]==max){
					maxFreq++;
				}
				if(input[k]==min){
					minFreq++;
				}
			}
			System.out.print(max-min+" ");
			noOfWays = (new BigInteger(Integer.toString(minFreq))).multiply(new BigInteger(Integer.toString(maxFreq)));//*maxFreq;
			System.out.println(noOfWays);
		}
	}

}
