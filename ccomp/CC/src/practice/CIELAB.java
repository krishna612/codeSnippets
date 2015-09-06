package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELAB {
  public static void main(String[] args) throws IOException {
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 int A,B,dif;
	 String[] inputStr;
	 inputStr = reader.readLine().split(" ");
	 A = Integer.parseInt(inputStr[0]);
	 B = Integer.parseInt(inputStr[1]);
	 dif = A-B;
	 String difStr = Integer.toString(dif);
	 StringBuilder difStrBuilder = new StringBuilder(difStr);
	 if(difStrBuilder.charAt(0)!='9'){
		 //char ch = (char) (Character.getNumericValue(difStrBuilder.charAt(0)));
		 char ch = (char)(difStrBuilder.charAt(0)+1);
		 difStrBuilder.setCharAt(0, ch);
	 }
	 else{
		 difStrBuilder.setCharAt(0, '8');
	 }
	 System.out.println(difStrBuilder);
  }
}
