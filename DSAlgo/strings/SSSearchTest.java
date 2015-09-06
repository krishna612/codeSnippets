package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SSSearchTest {
  public static void main(String[] args) throws IOException {
	  String text,pattern,method;
	  SSSearchInterface searchMethod=null;
	  System.out.println("enter Text: ");
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  text = reader.readLine();
	  System.out.println("enter pattern to be searched: ");
	  pattern = reader.readLine();
	  System.out.println("enter method to be used, options: bruteforce0, kmp, .....");
	  method = reader.readLine();
	  if(method.equalsIgnoreCase("bruteforce0")){
		  searchMethod = new SSSeacrhBruteForce0();
	  }
	  else if(method.equalsIgnoreCase("kmp")){
		  searchMethod = new SSSeacrhKMP();
	  }
	  else{
		  System.out.println("enter proper method name");
	  }
	  System.out.println("match found at index: "+searchMethod.findFirstMatch(text, pattern));
  }
}
