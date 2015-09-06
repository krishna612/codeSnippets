import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class TwoArrays {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T=0,N=0,K=0;
    Integer[] a,b;
    String[] inputStr;
    T = Integer.parseInt(reader.readLine());
    for(int i=0;i<T;i++){
    	inputStr = reader.readLine().split(" ");
    	N = Integer.parseInt(inputStr[0]);
    	K = Integer.parseInt(inputStr[1]);
    	a = new Integer[N];
    	b = new Integer[N];
    	inputStr = reader.readLine().split(" ");
    	for(int j=0;j<N;j++){
    		a[j] = Integer.parseInt(inputStr[j]);
    	}
    	inputStr = reader.readLine().split(" ");
    	for(int k=0;k<N;k++){
    		b[k] = Integer.parseInt(inputStr[k]);
    	}
    	Arrays.sort(a);
    	Arrays.sort(b,Collections.reverseOrder());
    	int p = 0;
    	while(p<N){
    		if(a[p]+b[p]<K)
    			break;
    		else
    			p++;
    	}
    	if(p==N)
    		System.out.println("YES");
    	else
    		System.out.println("NO");
    }
 }
}
