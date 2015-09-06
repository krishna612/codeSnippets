import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		int[][] input;
		int n=0;
		String inputStr;
		n = Integer.parseInt(reader.readLine());
		input = new int[n][n];
		for(int i=0;i<n;i++){
		  inputStr = reader.readLine().trim();
		  for(int j=0;j<n;j++){
			  input[i][j]= Character.getNumericValue(inputStr.charAt(j));
		  }
		}
		for(int a=1;a<n-1;a++){
			
		}
 	}

}
