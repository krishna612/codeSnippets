package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ERROR {
    public static char complement(char ch){
    	if(ch == '0')
    		return '1';
    	else
    		return '0';
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	int T,count;
	char[] chr;
	char prev;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		chr = reader.readLine().toCharArray();
		prev = chr[0];
		count = 1;
		for(int j=1;j<chr.length;j++){
			if(chr[j]==complement(prev)){
				count++;
				prev = chr[j];
			}
			else{
				count=1;
			}
			if(count==3){
				break;
			}
		}
		if(count==3){
			System.out.println("Good");
		}
		else{
			System.out.println("Bad");
		}
	}
  }
}
