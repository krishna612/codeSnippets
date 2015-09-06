import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CHEFEQ {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T,maxFreq,N,prev,tmpFreq;
	String[] inputStr;
	int[] input;
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		maxFreq=1;
		tmpFreq=1;
		N = Integer.parseInt(reader.readLine());
		inputStr = reader.readLine().split(" ");
		input = new int[N];
		for(int j=0;j<N;j++){
			input[j] = Integer.parseInt(inputStr[j]);
		}
		Arrays.sort(input);
		prev = input[0];
		int k=1;
		while(k<N){
			tmpFreq=1;
			while(k<N && prev==input[k]){
				k++;
				tmpFreq++;
			}
			if(tmpFreq>maxFreq){
				maxFreq=tmpFreq;
			}
			if(k==N)break;
			prev = input[k];
			k++;
		}
		System.out.println(N-maxFreq);
	}
	
 }
}
