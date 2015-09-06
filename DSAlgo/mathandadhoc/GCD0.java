package mathandadhoc;

public class GCD0 implements GCDInterface{

	@Override
	public int findGCD(int a, int b) {
		int Numerator,Denominator,remainder;
		if(a>b){
		  Numerator = a;
		  Denominator = b;
		}
		else{
		  Numerator = b;
		  Denominator = a;
		}
		//here the invariant always holds that Numerator>=Denominator
		remainder = Numerator%Denominator;
		while(remainder!=0){
		  Numerator = Denominator;
		  Denominator = remainder;
		  remainder = Numerator%Denominator;
		}
		return Denominator;
	}
  
}
