package mathandadhoc;

public class GCD1 implements GCDInterface {

	@Override
	public int findGCD(int a, int b) {
		//making a and b to follow certain order
		  if(a<b){
				 int tmp=b;
				 b = a;
				 a = tmp;
			 }
		  //the invariant at this point is that a>=b
		  if(b==0)
		     return a; //base case when one of the numbers is zero return the other number as this is the GCD in this case
		  //no need of else since return is present in the above step
		  return findGCD(b,a%b);//here we are passing in the order as expected by invariant sothat swapping code won't be triggered.
		  //one quick check is that one argument and divisor of another argument must be same in the recursive call
	}

}
