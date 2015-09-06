import java.util.Arrays;
import java.util.Scanner;

public class AngryBirds {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k=0,n=0;
		int[] candies;
		n = in.nextInt();
		k = in.nextInt();
		candies = new int[n];
		for(int i=0;i<n;i++){
			candies[i] = in.nextInt();
		}
		Arrays.sort(candies);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n-k;i++){
			if(min>candies[i+k-1]-candies[i])
				min=candies[i+k-1]-candies[i];
		}
		System.out.println(min);
	}

}
