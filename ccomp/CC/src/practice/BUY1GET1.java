package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BUY1GET1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] table = new int[52];
		int T,tmp,counter;
		char[] chrArr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			counter = 0;
			for(int j=0;j<52;j++){
				table[j] = 0;
			}
			chrArr = reader.readLine().toCharArray();
			for(int k=0;k<chrArr.length;k++){
				tmp = (int) chrArr[k];
				if(tmp<=90){
					table[tmp-65]++;
				}
				else{
					table[tmp-97+26]++;
				}
			}
		  for(int t=0;t<52;t++){
			  counter = table[t]/2+table[t]%2+counter;
		  }
		  System.out.println(counter);
		}

	}

}
