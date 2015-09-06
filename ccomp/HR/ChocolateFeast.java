import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    private static long Solve(int N, int C, int M){
        int sum = N/C,rem=0;
        int tmp = sum;
        while(tmp>=M){
        	rem = tmp%M;
        	sum+=tmp/M;
        	tmp=(tmp/M)+rem;
        }
        return sum;
    }

}
