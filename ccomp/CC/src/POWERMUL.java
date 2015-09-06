import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


public class POWERMUL {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		int T;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		int N=0,M=0,Q=0;
		String[] str;
		for(int i=0;i<T;i++){
			str = reader.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			Q = Integer.parseInt(str[2]);
			if(i==0){
				list.add(new BigInteger("1"));
				for(int p=2;p<=N;p++){
				  list.add(list.get(list.size()-1).multiply(new BigInteger(Integer.toString(p))).pow(p));
				}
			}
			if(N>list.size()){
				for(int j=list.size()+1;j<=N;j++){
					list.add(list.get(list.size()-1).multiply(new BigInteger(Integer.toString(j))).pow(j));
				}
			}
			BigInteger print;
			int r;
			for(int k=0;k<Q;k++){
				r = Integer.parseInt(reader.readLine());
				print = list.get(N-1).divide(list.get(r-1).multiply(list.get(N-r-1)));
				print = print.mod(new BigInteger(Integer.toString(M)));
				System.out.println(print);
			}
		}
	}

}
