import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SEAVOTE {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    int N=0,sum=0;
    String[] inputStr;
    for(int i=0;i<T;i++){
    	N = Integer.parseInt(reader.readLine());
    	sum=0;
    	inputStr = reader.readLine().split(" ");
    	for(int j=0;j<N;j++)
    	  sum+=Integer.parseInt(inputStr[j]);
    	if(sum>=100&&sum<100+N){
    		System.out.println("YES");
    	}
    	else{
    		System.out.println("NO");
    	}
    }
  }
}
