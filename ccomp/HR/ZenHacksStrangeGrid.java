import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ZenHacksStrangeGrid {
   public static void main(String[] args) throws IOException {
	long r,c;
	String[] inputStr;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	inputStr = reader.readLine().split(" ");
	r = Integer.parseInt(inputStr[0]);
	c = Integer.parseInt(inputStr[1]);
	if(r%2==0){
		System.out.println((c-1)*2+1+(r-2)*5);
	}
	else{
		System.out.println((c-1)*2+(r-1)*5);
	}
   }
}
