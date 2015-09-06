import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PlayGame {
    public static long findMax(long a,long b,long c){
        long max = 0;
    	if(a>b){
        	if(a>c)
        		max = a;
        	else
        		max = c;
        }
        else{
        	if(b>c)
        		max = b;
        	else
        		max = c;
        }
    	return max;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int T=0,N=0;
	int[] a;
	long[] sum,M;
	String[] inputStr;
	T = Integer.parseInt(reader.readLine());
	while(T>0){
		N = Integer.parseInt(reader.readLine());
		inputStr = reader.readLine().split(" ");
		a = new int[N];
		sum = new long[N];
		M = new long[N];
		for(int i=N-1;i>=0;i--){
			a[N-1-i] = Integer.parseInt(inputStr[i]);
		}
		sum[0] = a[0];
		for(int j=1;j<a.length;j++)
			sum[j] = (long) (sum[j-1]+a[j]);
		M[0] = a[0];
		M[1] = a[0]+a[1];
		M[2] = a[0]+a[1]+a[2];
		for(int k=3;k<a.length;k++){
         M[k] = findMax(sum[k]-M[k-1],sum[k]-M[k-2],sum[k]-M[k-3]); 
		}
		System.out.println(M[a.length-1]);
		T--; 
	}
}
}
