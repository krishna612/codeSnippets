import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InsertionSortPart2 {
	static int[] input;
	public static void print(){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = 0;
	N = Integer.parseInt(reader.readLine());
	String[] inputStr = reader.readLine().split(" ");
	 input = new int[N];
	for(int i=0;i<N;i++){
		input[i] = Integer.parseInt(inputStr[i]);
	}
	int tmp=0;
	for(int i=1;i<N;i++){
    	for(int j=i;j>0;j--){
    		if(input[j]<input[j-1]){
    			tmp = input[j];
    			input[j] = input[j-1];
    			input[j-1] = tmp;
    		}
    		else{
    			break;
    		}
    	}
    	print();
    }
  }
}
