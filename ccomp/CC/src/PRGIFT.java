//http://www.codechef.com/problems/PRGIFT
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRGIFT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T=0; String[] inputStr; int n=0,k=0; String[] tmpStr = new String[2];
		int track=0;
		T = Integer.parseInt(reader.readLine());
		while(T>0){
		  tmpStr = reader.readLine().split(" ");
		  n = Integer.parseInt(tmpStr[0]);
		  k = Integer.parseInt(tmpStr[1]);
		  inputStr = reader.readLine().split(" ");
		  for(int i=0;i<n;i++){
			  if(Integer.parseInt(inputStr[i])%2 == 0)
				  track++;
			  if(track==k)
				  break;
		  }
		  if(track==k)
			  System.out.println("YES");
		  else
			  System.out.println("NO");
		  track = 0;
		  T--;
		}
	}
}
