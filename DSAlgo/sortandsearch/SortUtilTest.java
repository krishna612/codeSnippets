package sortandsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortUtilTest {
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String[] inputStr;
	int a,b;
	System.out.println("compare test: ");
	System.out.println("enter 2 numbers space seperated: ");
	inputStr = reader.readLine().split(" ");
	a = Integer.parseInt(inputStr[0]);
	b = Integer.parseInt(inputStr[1]);
	System.out.println(a+" is less than "+b+" : "+SortUtil.isLess(a, b));
  }
}
