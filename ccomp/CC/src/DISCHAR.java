import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DISCHAR {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = 0;
		char[] input;
		boolean[] bool;
		int count;
		int convertedIndex;
		T = Integer.parseInt(reader.readLine());
		for(int i=0; i<T; i++){
			count = 0;
			bool = new boolean[26];
			input = reader.readLine().toCharArray();
			for(int j=0;j<input.length;j++){
				convertedIndex = (Character.getNumericValue(input[j]))-10;
			    if(bool[convertedIndex] == false){
			    	bool[convertedIndex] = true;
			    	count++;
			    }
			}
			System.out.println(count);
		}
	}

}
