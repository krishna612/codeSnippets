package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CANDLE {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T,minVal=10,minIndex=10;
		String[] inputStr;
		int[] inputFreq;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0; i<T; i++){
			minVal=10;minIndex=10;
			inputStr = reader.readLine().split(" ");
			inputFreq = new int[10];
			for(int j=0;j<10;j++){
				inputFreq[j] = Integer.parseInt(inputStr[j]);
				if(inputFreq[j]==minVal){
					if(minIndex==0)
						minIndex=j;
				}
				if(inputFreq[j]<minVal){
					minVal = inputFreq[j];
					minIndex = j;
				}
			}
			if(minIndex==0){
				System.out.print("1");
			}
			for(int k=0;k<=minVal;k++){
				System.out.print(minIndex);
			}
			System.out.println();
		}
	}

}
