import java.math.BigInteger;
import java.util.Scanner;

public class Halloween {
	public static void main(String[] args) {
		int T = 0;
		BigInteger tmp,half,res;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T>0){
			tmp = in.nextBigInteger();
			half = tmp.divide(new BigInteger("2"));
			System.out.println(half.multiply(tmp.subtract(half)));
			T--;
		}
		
	}

}
