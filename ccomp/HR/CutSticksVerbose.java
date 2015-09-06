import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//idea is to sort the array and then just printing out remaining sticks
public class CutSticksVerbose {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		String[] inputStr;
		int[] input;
		n = Integer.parseInt(reader.readLine());
		input = new int[n];
		inputStr = reader.readLine().split(" ");
		for(int i=0;i<n;i++){
			input[i] = Integer.parseInt(inputStr[i]);
		}
		Arrays.sort(input);
		int j =0;
		int tmp = input[0];
		while(j<n){
			System.out.println(n-j);
			tmp = input[j];
			while(j<n && tmp==input[j])
				j++;
		}
	}

}
