package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HOLESV3 {
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int T = 0;
		int counter=0;
	    String input;
	    char tmpChar=' ';
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine().trim());
		for(int i=0;i<T;i++){
			counter=0;
			input = reader.readLine();
			for(int j=0;j<input.length();j++){
				if(input.charAt(j)=='B')
					counter+=2;
				else{
					tmpChar = input.charAt(j);
					if(tmpChar=='A'||tmpChar=='D'||tmpChar=='O'||tmpChar=='P'||tmpChar=='Q'||tmpChar=='R')
						counter++;
				}
			}
			System.out.println(counter);
		}
	}

}
