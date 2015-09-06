import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChiefHopper {
	static int[] input;
	public static boolean checkforEnergy(int start){
		//starts the simulation for start energy value
		int i = 0;
		for(;i<input.length;i++){
			if(input[i]<start){
				start+=start-input[i];
			}
			else
				start-=input[i]-start;
			if(start<0)
				break;
		}
		if(i==input.length)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   int N = 0;
		   //int[] input;
		   String[] inputStr;
		   BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		   N = Integer.parseInt(reader.readLine());
		   inputStr = reader.readLine().split(" ");
		   input = new int[N];
		   int max = -1;
		   int min = 1000000000;
		   for(int i=0; i<N; i++){
			   input[i] = Integer.parseInt(inputStr[i]);
			   if(input[i]<min){
				   min = input[i];
			   }
			   if(input[i]>max){
				   max = input[i];
			   }
		   }
		   //do a binary search to find the minimum possible value
		   int lower = min;
		   int higher = max;
		   int mid = (lower+higher)/2; 
		   while(lower<=max && higher>=min){
			   mid = (lower+higher)/2;
			   if(lower==higher)
				   break;
			   if(checkforEnergy(mid)){
				   higher = mid-1;
			   }
			   else{
				   lower = mid+1;
			   }
		   }
		   System.out.println(mid);
		   
	}

}
