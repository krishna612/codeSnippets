package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELRCPT {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] pow2 = {1,2,4,8,16,32,64,128,256,512,1024,2048}; 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		int p=0;
		int rem=-1;
		int counter=0;
		for(int i=0;i<T;i++){
			p = Integer.parseInt(reader.readLine().trim());
			counter = 0;
			rem = p;
			int j=11;
			while(j!=-1&&rem!=0){
				counter+=(rem/pow2[j]);
				rem = rem%pow2[j];
				j--;
			}
			System.out.println(counter);
		}
	}

}
