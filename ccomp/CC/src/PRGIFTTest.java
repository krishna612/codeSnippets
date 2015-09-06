import java.util.Random;

public class PRGIFTTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int T =10,n=50;
		System.out.println(T);
		while(T>0){
			System.out.println(n+" "+ rand.nextInt(30));
			for(int i=0;i<n;i++)
				System.out.print(rand.nextInt(100)+" ");
			System.out.println();
			T--;
		}
		
	}

}
