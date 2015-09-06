import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FillingJars {
  
	public static void main(String[] args) throws IOException {
		int N=0,M=0,a=0,b=0,k=0;
		Long sum = new Long("0");
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    inputStr = reader.readLine().split(" ");
	    N = Integer.parseInt(inputStr[0]);
	    M = Integer.parseInt(inputStr[1]);
	    while(M>0){
	    	inputStr = reader.readLine().split(" ");
		    a = Integer.parseInt(inputStr[0]);
		    b = Integer.parseInt(inputStr[1]);
		    k = Integer.parseInt(inputStr[2]);
		    sum+=(b-a+1)*k;
	    	M--;
	    }
	    System.out.println(sum/N);
	}
}
