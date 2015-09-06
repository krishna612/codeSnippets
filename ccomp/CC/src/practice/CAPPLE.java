package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CAPPLE {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int N,counter;
		String[] inputStr;
		int[] input;
		for(int i=0;i<T;i++){
			counter = 0;
			N = Integer.parseInt(reader.readLine());
			input  = new int[N];
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<N;j++){
				input[j] = Integer.parseInt(inputStr[j]);
			}
			Arrays.sort(input);
			counter = 1;
			int tmp = input[0];
			int k=1;
			while(k<N){
				if(input[k]!=tmp){
					counter++;
					tmp = input[k];
				}
				k++;
			}
			System.out.println(counter);
		}
	}

}
