package epi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Epi601DutchNationalFlagTest {
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter only three kinds of numbers in a space seperated line, not doing validtion, so its up to you to give proper input");
	String[] inputStr = reader.readLine().split(" ");
	int[] colors = new int[inputStr.length];
	for(int i=0;i<inputStr.length;i++){
		colors[i] = Integer.parseInt(inputStr[i]);
	}
	System.out.println("enter middle element of these numbers");
	int middle = Integer.parseInt(reader.readLine());
	Epi601DutchNationalFlag flag = new Epi601DutchNationalFlag();
	colors = flag.arrangeColors(colors, middle);
	System.out.println("now printing output array");
	for(int i=0;i<colors.length;i++){
		System.out.print(colors[i]+" ");
	}
  }
}
