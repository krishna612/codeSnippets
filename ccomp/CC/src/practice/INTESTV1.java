package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class INTESTV1 {
  public static void main(String[] args) throws IOException {
	String[] inputStr;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	inputStr = reader.readLine().split(" ");
	int n = Integer.parseInt(inputStr[0]);
	int k = Integer.parseInt(inputStr[1]);
	int counter=0;
	int tmp;
	for(int i=0;i<n;i++){
	  	tmp = Integer.parseInt(reader.readLine());
	  	if(tmp%k==0)
	  		counter++;
	}
	System.out.println(counter);
  }
}
