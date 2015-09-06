package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMTRIAN {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		int size=0,max=-1;
		int[] current,prev;
		String[] inputStr;
		for(int i=0;i<T;i++){
			size = Integer.parseInt(reader.readLine().trim());
			
			for(int j=1;j<=size;j++){
				current = new int[j];
				if(j==1){
					current[0] = Integer.parseInt(reader.readLine().trim());
					prev = new int[j];
					prev = current;
				}
				else if(j==size){
					
				}
				else{
					inputStr = reader.readLine().split(" ");
					for(int k=0;k<inputStr.length;k++){
						if(k==0){
							//current[k] = Integer.parseInt(inputStr[k])+prev[k];
						}
					}
				 prev = current;
				}
			}
		}
	}

}
