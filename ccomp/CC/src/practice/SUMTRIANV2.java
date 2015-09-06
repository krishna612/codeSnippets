package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMTRIANV2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		int size=0,max=-1,ans=0;
		int[][] array;
		String[] inputStr;
		for(int i=0;i<T;i++){
			size = Integer.parseInt(reader.readLine().trim());
			array = new int[size][size];
			ans = 0;
			int j;
			for(j=0;j<size;j++){
				if(j==0){
					array[0][0] = Integer.parseInt(reader.readLine().trim());
				}
				else if(j==size-1){
					inputStr = reader.readLine().split(" ");
					int k=0;
					for(k=0;k<inputStr.length;k++){
						if(k==0){
							array[j][k] = Integer.parseInt(inputStr[k])+array[j-1][k];
						}
						else if(k==inputStr.length-1){
							array[j][k] = Integer.parseInt(inputStr[k])+array[j-1][k-1];
						}
						else{
							max = (array[j-1][k]>array[j-1][k-1])?array[j-1][k]:array[j-1][k-1];
							array[j][k] = Integer.parseInt(inputStr[k])+max;
						}
						if(j<size&&k<size&&array[j][k]>ans)
					 		ans = array[j][k];
					}
				 	
				}
				else{
					inputStr = reader.readLine().split(" ");
					for(int k=0;k<inputStr.length;k++){
						if(k==0){
							array[j][k] = Integer.parseInt(inputStr[k])+array[j-1][k];
						}
						else if(k==inputStr.length-1){
							array[j][k] = Integer.parseInt(inputStr[k])+array[j-1][k-1];
						}
						else{
							max = (array[j-1][k]>array[j-1][k-1])?array[j-1][k]:array[j-1][k-1];
							array[j][k] = Integer.parseInt(inputStr[k])+max;
						}
					}
				 
				}
			}
			   System.out.println(ans);
		}
	         
	}

}
