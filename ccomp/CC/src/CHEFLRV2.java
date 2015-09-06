import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CHEFLRV2 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		char[] chr;
		n = Integer.parseInt(reader.readLine());
		while(n>0){
			chr = reader.readLine().toCharArray();
			int index = 1,level=0; BigInteger resultBig = new BigInteger("1");
			for(int i=0;i<chr.length;i++){
				if(chr.length==1){
					if(chr[0]=='l')
						System.out.println(2);
					else
						System.out.println(4);
					break;
				}
				level++;
				if(level%2==0){
					if(chr[i]=='l'){
						resultBig = resultBig.multiply(new BigInteger("2"));
					}
					else{
						resultBig = resultBig.multiply(new BigInteger("2")).add(new BigInteger("2"));
					}
				}
				else{
					if(chr[i]=='l'){
						resultBig = resultBig.multiply(new BigInteger("2")).subtract(new BigInteger("1"));
					}
					else{
						resultBig = resultBig.multiply(new BigInteger("2")).add(new BigInteger("1"));
					}
				}
				
			}
			if(chr.length!=1){
			  int m = (int)Math.pow(10, 9)+7;
			  System.out.println(resultBig.mod(new BigInteger(Integer.toString(m))));
			 }
			n--;
		}
	}

}
