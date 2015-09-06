import java.util.Scanner;

public class MAAndStones {
 
	public static void main(String[] args) {
		int  T=0,n=0,a=0,b=0,i=0,tmp=0;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while(T>0){
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			if(b>a){
			  tmp = a;
			  a = b;
			  b = tmp;
			}
			if(a==b){
				System.out.println((n-1)*a);
			}
			else{
			  for(i=0;i<n;i++){
				System.out.print(i*a+(n-1-i)*b);
				System.out.print(" ");
			  }
			  System.out.println();
			}
			T--;
		}
	}
	
}
