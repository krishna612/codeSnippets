import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaumAndBday {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr;
		int T = Integer.parseInt(reader.readLine());
		long B,W,x,y,z;
		for(int i=0;i<T;i++){
		inputStr = reader.readLine().split(" ");
		B = Integer.parseInt(inputStr[0]);
		W = Integer.parseInt(inputStr[1]);
		inputStr = reader.readLine().split(" ");
		x = Integer.parseInt(inputStr[0]);
		y = Integer.parseInt(inputStr[1]);
		z = Integer.parseInt(inputStr[2]);
		if(x==y){
			System.out.println(B*x+W*y);
		}
		else if(x>y){
			if(y+z<x){
				System.out.println(B*(y+z)+W*y);
			}
			else{
				System.out.println(B*x+W*y);
			}
		}
		else{
			if(x+z<y){
				System.out.println(B*x+W*(x+z));
			}
			else{
				System.out.println(B*x+W*y);
			}
		}
		
		}
	}

}
