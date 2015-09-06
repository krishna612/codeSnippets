
public class NikkuStrings {
	public static int gcd(int a, int b){
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
	public static void main(String[] args) {
		System.out.println(gcd(30,16));
	}

}
