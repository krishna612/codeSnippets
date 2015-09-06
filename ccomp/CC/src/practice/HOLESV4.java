package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOLESV4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = 0;
		int counter=0;
	    String input;
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			counter=0;
			input = reader.readLine();
			for(char tmpChar:input.toCharArray()){
				if(tmpChar=='B')
					counter+=2;
				else{
					 if(tmpChar=='A'||tmpChar=='D'||tmpChar=='O'||tmpChar=='P'||tmpChar=='Q'||tmpChar=='R')
						counter++;
				}
			}
			System.out.println(counter);
		}
	}

}
