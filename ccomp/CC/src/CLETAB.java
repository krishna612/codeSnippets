import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CLETAB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T=0,N=0,M=0;
		String[] tmpStr,inputStr;
		int[] input,table,newArray;
		int count = 0;
		boolean[] bool;
		T = Integer.parseInt(reader.readLine());
		while(T>0){
			tmpStr = reader.readLine().split(" ");
			N = Integer.parseInt(tmpStr[0]);
			M = Integer.parseInt(tmpStr[1]);
			inputStr = reader.readLine().split(" ");
			input = new int[inputStr.length];
			table = new int[N];
			bool = new boolean[2*N+1];
			for(int i=0; i<inputStr.length; i++)
				input[i] = Integer.parseInt(inputStr[i]);
			//filling first N tables, avoid dup orders no need to clean :)
			for(int j=0;j<inputStr.length&&j<N;j++){
				if(bool[input[j]] == false){
				  table[j] = input[j];
				  bool[input[j]] = true;
				  count++;
				}
			}
			if(N<M) {
			newArray = Arrays.copyOfRange(input, N, M);
			Arrays.sort(newArray);
			for(int k=N;k<M;k++){
				if(bool[input[k]] == false){
					for(int i=0;i<N;i++){
						if(Arrays.binarySearch(newArray, table[i])<0){
							bool[table[i]] = false;
							table[i] = input[k];
							bool[input[k]] = true;
							count++;
							break;
						}
					}
				}
			}
		}
			System.out.println(count);
			count = 0;
			T--;
		}
	}
}
