package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HOLES {
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	public static void initialize(){
		map.put('A',1);map.put('B',2);map.put('C',0);map.put('D',1);map.put('E',0);map.put('F',0);map.put('G',0);
		map.put('H',0);map.put('I',0);map.put('J',0);map.put('K',0);map.put('L',0);map.put('M',0);map.put('N',0);map.put('O',1);
		map.put('P',1);map.put('Q',1);map.put('R',1);map.put('S',0);map.put('T',0);map.put('U',0);map.put('V',0);
		map.put('W',0);map.put('X',0);map.put('Y',0);map.put('Z',0);map.put(' ', 0);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		initialize();
		int T = 0;
		int counter=0;
		char[] input;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine().trim());
		for(int i=0;i<T;i++){
			counter=0;
			input = reader.readLine().toCharArray();
			for(int j=0;j<input.length;j++){
				counter = counter+map.get((Character)input[j]);
			}
			System.out.println(counter);
		}
	}

}
