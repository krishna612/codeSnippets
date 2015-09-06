import java.util.Scanner;


public class UtopianTree {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int T = 0;
	   int n = 0;
	   int p = 0;
	   if(in.hasNextInt())
		   T = in.nextInt();
	   while(T>0){
		   n = in.nextInt();
		   if(n==0)
			   System.out.println(1);
		   else{
		     if(n%2==0)
			   p = (int) (Math.pow(2, (n+3)/2)) - 1;
		     else
			   p = (int) (Math.pow(2, (n+3)/2)) - 2;
		     System.out.println(p);
		   }
		   T--;
	   }
	
   }
}
