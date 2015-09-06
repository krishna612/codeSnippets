import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pangrams {
	public static void main(String[] args) throws IOException {
		char[] input;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		input = reader.readLine().toCharArray();
		boolean[] letters = new boolean[26];
		int count = 0;
		int i=0;
		int convertedIndex = 0;
		while(i<input.length && count<=26){
			convertedIndex = (Character.getNumericValue(input[i]))-10;
			if(convertedIndex>=0 && convertedIndex<26 && letters[convertedIndex]==false){
				letters[convertedIndex]=true;
				count++;
				if(count==26)
					break;
			}
			i++;
		}
		if(count==26){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}
	}

}
