import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class PriyankaAndToys {
 public static void main(String[] args) throws NumberFormatException, IOException {
   int N = 0;
   int[] input;
   String[] inputStr;
   BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
   N = Integer.parseInt(reader.readLine());
   inputStr = reader.readLine().split(" ");
   input = new int[N];
   for(int i=0; i<N; i++){
	   input[i] = Integer.parseInt(inputStr[i]);
   }
   Arrays.sort(input);
   int minCoins = 1;
   int startValue = input[0];
   int j=1;
   while(j<N){
	   if((input[j]-startValue)<=4)
		   j++;
	   else{
		   minCoins++;
		   startValue = input[j];
		   j++;
	   }
   }//end of while loop
   System.out.println(minCoins);
 }
}
