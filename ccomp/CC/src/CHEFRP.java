import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//702 713
public class CHEFRP {
  public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(reader.readLine());
	for(int j=0;j<T;j++){
	int N = Integer.parseInt(reader.readLine());
	String[] inputStr = reader.readLine().split(" ");
	int[] input = new int[N];
	int sum=0,min=100000;
	for(int i=0;i<N;i++){
		input[i] = Integer.parseInt(inputStr[i]);
		if(input[i]<min){
			min = input[i];
		}
		sum+=input[i];
	}
	if(min==1){
		System.out.println(-1);
	}
	else{
		System.out.println(sum-min+2);
	}
	}
	}
}
