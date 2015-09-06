package mathandadhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDTest {
  public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter two numbers seperated by line to give as inputs to GCD");
	int a,b,tmp;
	a = Integer.parseInt(reader.readLine());
	b = Integer.parseInt(reader.readLine());
	System.out.println("enter the method to use");
	tmp = Integer.parseInt(reader.readLine());
	GCDInterface gcd = null;
	if(tmp==0){
		gcd = new GCD0();
	}
	else if(tmp==1){
		gcd = new GCD1();
	}
	else if(tmp==2){
		gcd = new GCD2();
	}
	System.out.println(gcd.findGCD(a, b));
  }
}
