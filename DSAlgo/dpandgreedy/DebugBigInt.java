package dpandgreedy;

import java.math.BigInteger;

public class DebugBigInt {
	public static void main(String[] args) {
	  BigInteger n = new BigInteger("4");	
	  System.out.println(n.getLowestSetBit());
	  System.out.println(n.testBit(0));
	}

}
