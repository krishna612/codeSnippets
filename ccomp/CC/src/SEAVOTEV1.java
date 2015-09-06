import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SEAVOTEV1 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    int N=0,sum=0;
    String[] inputStr;
    int[] input;
    boolean flag;
    for(int i=0;i<T;i++){
    	N = Integer.parseInt(reader.readLine());
    	input = new int[N];
    	sum=0;
    	flag=false;
    	inputStr = reader.readLine().split(" ");
    	for(int j=0;j<N;j++){
          input[j] = Integer.parseInt(inputStr[j]);
    	  if(input[j]>100){
    		  flag = true;
    		  System.out.println("NO");
    		  break;
    	  }
          sum+=input[j];
    	  
    	}
    	if(sum>=100&&sum<100+N){
    		if(flag==false)
    		System.out.println("YES");
    	}
    	else{
    		if(flag==false)
    		System.out.println("NO");
    	}
    }
  }
}
