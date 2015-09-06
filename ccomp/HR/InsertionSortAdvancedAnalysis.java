import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InsertionSortAdvancedAnalysis {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] inputStr;
		int[] input;
		int T=0,N=0,count=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine().trim());
		for(int t=0;t<T;t++){
			count = 0;
			N = Integer.parseInt(reader.readLine().trim());
			inputStr = reader.readLine().split(" ");
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
		    			count++;
		    		}
		    		else{
		    			break;
		    		}
		    	}
		    }
			System.out.println(count);
		}
	}

}
