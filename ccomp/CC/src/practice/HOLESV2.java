package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HOLESV2 {
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int T = 0;
		int counter=0;
		char[] input;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine().trim());
		for(int i=0;i<T;i++){
			counter=0;
			input = reader.readLine().toCharArray();
			for(int j=0;j<input.length;j++){
				if(input[j]=='B')
					counter+=2;
				else{
					if(input[j]=='A'||input[j]=='D'||input[j]=='O'||input[j]=='P'||input[j]=='Q'||input[j]=='R')
						counter++;
				}
			}
			System.out.println(counter);
		}
	}

}
