import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InsertionSortPart1 {
   public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = 0;
	N = Integer.parseInt(reader.readLine());
	String[] inputStr = reader.readLine().split(" ");
	int[] input = new int[N];
	for(int i=0;i<N;i++){
		input[i] = Integer.parseInt(inputStr[i]);
	}
	int var = input[N-1];
	for(int j=N-2;j>=0;j--){
		
		if(input[j]>var){
			input[j+1] = input[j];
			for(int k=0;k<N;k++){
				System.out.print(input[k]+" ");
			}
			System.out.println();
		}
		else{
			input[j+1]=var;
			for(int k=0;k<N;k++){
				System.out.print(input[k]+" ");
			}
			break;
		}
	}//end of for loop
	if(input[0]==input[1]){
		input[0] = var;
		for(int k=0;k<N;k++){
			System.out.print(input[k]+" ");
		}
	}
  }
}
