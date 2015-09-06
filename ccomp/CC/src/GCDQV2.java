import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GCDQV2 {
	public static int findGCD(int a,int b){
		int rem;
		if(a==b) return a;
		if(a>b){
			int tmp = b;
			b = a;
			a = tmp;
		}
		rem = b%a;
		b = a;
		a = rem;
		while(rem!=0){
			rem = b%a;
			b = a;
			a = rem;
		}
		return b;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		String[] inputStr;
		int[] input,leftGCD,rightGCD;
		int N=0,Q=0,l=0,r=0;
		for(int i=0;i<T;i++){
			inputStr = reader.readLine().split(" ");
			N = Integer.parseInt(inputStr[0]);
			Q = Integer.parseInt(inputStr[1]);
			input = new int[N];
			leftGCD = new int[N];
			rightGCD = new int[N];
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<N;j++){
			   input[j] = Integer.parseInt(inputStr[j]);
			}
			for(int p=0;p<N;p++){
				if(p==0){
					leftGCD[p] = input[p];
					rightGCD[N-1-p] = input[N-1-p];
				}
				else{
					leftGCD[p] = findGCD(leftGCD[p-1],input[p]);
					rightGCD[N-1-p] = findGCD(rightGCD[N-p],input[N-1-p]);
				}
			}
			
			int ans=0;
			for(int k=0;k<Q;k++){
				inputStr = reader.readLine().split(" ");
				l = Integer.parseInt(inputStr[0]);
				r = Integer.parseInt(inputStr[1]);
				if(l==1){
					ans = rightGCD[r];
				}
				else if(r==N){
					ans = leftGCD[l-2];
				}
				else
				ans = findGCD(leftGCD[l-2],rightGCD[r]);
				System.out.println(ans);
			}
		}
	}

}
