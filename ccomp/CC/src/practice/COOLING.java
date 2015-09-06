package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COOLING {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		String[] inputStr;
		int[] pies;
		int[] racks;
		int counter=0;
		int size=0;
		for(int i=0;i<T;i++){
			counter=0;
			size = Integer.parseInt(reader.readLine());
			inputStr = reader.readLine().split(" ");
			pies = new int[inputStr.length];
			for(int j=0;j<inputStr.length;j++){
				pies[j] = Integer.parseInt(inputStr[j]);
			}
			inputStr = reader.readLine().split(" ");
			racks = new int[inputStr.length];
			for(int j=0;j<inputStr.length;j++){
				racks[j] = Integer.parseInt(inputStr[j]);
			}
			Arrays.sort(pies);
			Arrays.sort(racks);
			int ptr = 0;
			for(int k=0;(k<pies.length)&&(ptr<racks.length);ptr++){
				if(racks[ptr]>=pies[k]){
					counter++;
					k++;
				}
                
			}
			System.out.println(counter);
		}
	}

}
