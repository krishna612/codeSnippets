import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CHEFCH {
  public static void main(String[] args) throws NumberFormatException, IOException {
	 int T=0;
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 T = Integer.parseInt(reader.readLine());
	 char[] input;
	 char one,two;
	 int count1,count2;
	 for(int i=0;i<T;i++){
		input = reader.readLine().toCharArray();
		count1 = 0;
		count2 = 0;
		one = input[0];
		if(one=='+'){
			two = '-';
		}
		else{
			two = '+';
		}
		for(int j=0;j<input.length;j++){
			if(j%2==0){
				if(input[j]==two){
					count1++;
				}
				else count2++;
			}
			else{
				if(input[j]==one){
					count1++;
				}
				else count2++;
			}
		}
		System.out.println(count1<count2?count1:count2);
	 }
  }
}
