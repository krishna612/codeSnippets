import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CHEFLR {
	public static int T(int n){
		if(n==0) return 1;
		if(n==1) return 4;
		if(n%2==0){
			return ((int)Math.pow(4, (n+2)/2)-4)*2/3+1;
		}
		else{
			return ((int)Math.pow(4, (n+1)/2)-1)*4/3;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		char[] chr;
		n = Integer.parseInt(reader.readLine());
		System.out.println(T(n));
		while(n>0){
			chr = reader.readLine().toCharArray();
			int index = 1,level=0;
			for(int i=0;i<chr.length;i++){
				if(chr.length==1){
					if(chr[0]=='l')
						System.out.println(2);
					else
						System.out.println(4);
					break;
				}
				if(chr[i]=='l')
					index = (index-1)*2+1;
				else
					index = (index-1)*2+2;
				level++;
			}
			if(chr.length!=1)
			 System.out.println(T(level-2)+index*2);
			n--;
		}
	}

}
