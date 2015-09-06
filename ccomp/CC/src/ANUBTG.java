import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ANUBTG {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T,N,sum;
		String[] inputStr;
		int[] input;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			N = Integer.parseInt(reader.readLine());
			sum = 0;
			input = new int[N];
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<N;j++){
				input[j] = Integer.parseInt(inputStr[j]);
			}
			Arrays.sort(input);
			
			int p=N-1;
			while(p>=0){
				sum = input[p]+sum;
				if(p-1>=0){
					sum = input[p-1]+sum;
				}
				p = p-4;
			}
			System.out.println(sum);
		}
	}

}
