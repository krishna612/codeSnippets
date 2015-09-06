import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SherlockAndArray {
   public static void main(String[] args) throws NumberFormatException, IOException {
	int T=0,N=0;
	String[] stra;
	int[] a;
	int[] sum;
	boolean bool = false;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		N = Integer.parseInt(reader.readLine());
		a = new int[N];
		sum = new int[N];
		stra = new String[N];
		stra = reader.readLine().split(" ");
		for(int j=0;j<N;j++){
			a[j] = Integer.parseInt(stra[j]);
		}
		sum[0] = a[0];
		for(int k=1;k<N;k++){
			sum[k] = sum[k-1]+a[k]; 
		}
		for(int p=1;p<N-1;p++){
			if(sum[N-1]-a[0]==0 || sum[N-1]-a[N-1]==0){
				bool = true;
				break;
			}
			if(sum[p-1]==sum[N-1]-sum[p]){
				bool = true;
				break;
			}
		}//end of final for loop
		
		if(bool==true)
			System.out.println("YES");
		else
			System.out.println("NO");
		bool = false;
	}
  }
}
