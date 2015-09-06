import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CNOTE {
  public static void main(String[] args) throws NumberFormatException, IOException {
	int T,x,y,k,n,p,c;
	String[] inputStr;
	String[] loopStr;
	Boolean done;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		done = false;
		inputStr = reader.readLine().split(" ");
		x = Integer.parseInt(inputStr[0]);
		y = Integer.parseInt(inputStr[1]);
		k = Integer.parseInt(inputStr[2]);
		n = Integer.parseInt(inputStr[3]);
		for(int j=0;j<n;j++){
			loopStr = reader.readLine().split(" ");
			if(done == false){
				p = Integer.parseInt(loopStr[0]);
				c = Integer.parseInt(loopStr[1]);
				if(c<=k){
					if((x-y)<=p){
						System.out.println("LuckyChef");
					    done = true;
					}
				}
			   if(j==n-1 && done==false){
				   System.out.println("UnluckyChef"); 
			   }
		    }
		}
	}
  }
}
