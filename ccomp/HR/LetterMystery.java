import java.util.Scanner;

public class LetterMystery {
	public static int abs(int a){
		return (a>0)?a:(a*-1);
	}
	public static void main(String[] args) {
		int T=0,length=0,count=0;
		Scanner in = new Scanner(System.in);
		String str;
		char[] chr;
		T = in.nextInt();
		while(T>0){
			chr = in.next().toCharArray();
			length = chr.length;
			for(int i=0;i<length/2;i++){
				count+=abs((int)chr[i] - (int)chr[length-1-i]);
			}
			System.out.println(count);
			count = 0;
			T--;
		}
	}

}
