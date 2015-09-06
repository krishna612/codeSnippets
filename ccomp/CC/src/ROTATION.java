import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROTATION {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int M=0,N=0;int[] inputInt; String[] str; char chr = ' '; String[] two = new String[2];
		int r=0,d=0;
		two = reader.readLine().split(" ");
		N = Integer.parseInt(two[0]);
		M = Integer.parseInt(two[1]);
		str = reader.readLine().split(" ");
		inputInt = new int[str.length];
		for(int i=0;i<str.length;i++){
			inputInt[i] = Integer.parseInt(str[i]);
		}
		while(M>0){
			two = reader.readLine().split(" ");
			chr = two[0].toCharArray()[0];
			d = Integer.parseInt(two[1]);
			if(chr=='C'){
				r = r+d;
				r = r%N;
			}
			else if(chr=='A'){
				r = d*-1+N+r;
				r = r%N;
			}
			else{
				int k = (d-1+r)%N;
				System.out.println(inputInt[k]);
			}
			M--;
		}
	}

}
