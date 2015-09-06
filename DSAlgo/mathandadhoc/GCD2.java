package mathandadhoc;

public class GCD2 implements GCDInterface {

	@Override
	public int findGCD(int a, int b) {
		return (b==0)?a:(a>b)?findGCD(b,a%b):findGCD(a,b%a);
	}
  
}
