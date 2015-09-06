package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MAXCOUNT {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int[] input;
		String[] inputStr;
		int size=0,maxIndex=0,maxCount=1,tmpCount=1;
		for(int i=0;i<T;i++){
			size = Integer.parseInt(reader.readLine());
			input = new int[size];
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<size;j++){
				input[j] = Integer.parseInt(inputStr[j]);
			}
			Arrays.sort(input);
			int tmp = input[0];
			maxIndex = input[0];
			for(int k=1;k<size;k++){
				while(tmp==input[k]){
					tmpCount++;
					if(k<=size-2)
					 k++;
					else
					 break;
				}
				if(tmpCount>maxCount){
					maxCount = tmpCount;
					maxIndex = tmp;
				}
				tmp=input[k];
				tmpCount=1;
			}
			System.out.print(maxIndex+" ");
			System.out.println(maxCount);
			maxCount=1;
		}
	}

}
