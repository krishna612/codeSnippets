import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//820
public class CBARG {
  public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(reader.readLine());
	int N,prev,current;
	long sum=0;
	String[] inputStr;
	int[] input;
	for(int i=0;i<T;i++){
		N = Integer.parseInt(reader.readLine());
		inputStr = reader.readLine().split(" ");
		prev = Integer.parseInt(inputStr[0]);
		sum = prev;
		for(int j=1;j<N;j++){
			current = Integer.parseInt(inputStr[j]);
			if(current>prev){
				sum+=(current-prev);
			}
			prev = current;
		}
		System.out.println(sum);
	}
  }
}
