import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MarkAndToys {
   public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n=0,k=0;
	String[] inputStr;
	int[] input;
	inputStr = reader.readLine().split(" ");
	n = Integer.parseInt(inputStr[0]);
	k = Integer.parseInt(inputStr[1]);
	inputStr = reader.readLine().split(" ");
	input = new int[n];
	for(int i=0;i<n;i++){
		input[i] = Integer.parseInt(inputStr[i]);
	}
	Arrays.sort(input);
	int sum=0,j=0;
	while(sum+input[j]<=k){
		sum+=input[j];
		j++;
	}
	System.out.println(j);
}	

}
