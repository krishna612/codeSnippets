import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CHEFLRV1 {
	public static BigInteger T(int n){
		BigInteger powEven,powOdd,one,two,three,four;
		if(n==0) return new BigInteger(Integer.toString(1));
		if(n==1) return new BigInteger(Integer.toString(4));
		one = new BigInteger("1");
		two = new BigInteger("2");
		three = new BigInteger("3");
		four = new BigInteger("4");
		if(n%2==0){
			powEven = four.pow((n+2)/2).subtract(four).multiply(two).divide(three).add(one);
			return powEven;
		}
		else{
			powOdd = four.pow((n+1)/2).subtract(one).multiply(four).divide(three);
			return powOdd;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		char[] chr;
		n = Integer.parseInt(reader.readLine());
		while(n>0){
			chr = reader.readLine().toCharArray();
			int index = 1,level=0;
			for(int i=0;i<chr.length;i++){
				if(chr.length==1){
					if(chr[0]=='l')
						System.out.println(2);
					else
						System.out.println(4);
					break;
				}
				if(chr[i]=='l')
					index = (index-1)*2+1;
				else
					index = (index-1)*2+2;
				level++;
			}
			if(chr.length!=1){
			  BigInteger big = T(level-2).add(new BigInteger(Integer.toString(index*2)));
			  int m = (int)Math.pow(10, 9)+7;
			  System.out.println(big.mod(new BigInteger(Integer.toString(m))));
			 }
			n--;
		}
	}

}
