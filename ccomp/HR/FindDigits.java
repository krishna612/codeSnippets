import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=0,N=0,count=0;
		boolean[] mark; 
		char[] chr;
		T = in.nextInt();
		while(T>0){
			N = in.nextInt();
			mark = new boolean[10];
			mark[0]=false;
			mark[1]=true;
			for(int i=2;i<10;i++){
				if(N%i==0)
					mark[i]=true;
			}
			chr = Integer.toString(N).toCharArray();
			int tmp = 0;
			for(int j=0;j<chr.length;j++){
				tmp = Character.getNumericValue(chr[j]);
				if(tmp!=0&&mark[tmp])
					count++;
			}
			System.out.println(count);
			count=0;
			T--;
		}
	}
	
}
