import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SHBeast {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = 0, n = 0;
		int numberOfThrees=0,numberOfFives=0;
		T = Integer.parseInt(reader.readLine());
		while(T>0){
			n = Integer.parseInt(reader.readLine());
			if(n<5){
				if(n==3){
					numberOfFives=3;
				}
				else
					numberOfFives=-1;
			}
			while((n>=5)&&(n%3!=0)){
				n-=5;
				numberOfThrees+=5;
			}
			numberOfFives=n;
			if(numberOfFives<0 || numberOfThrees%5!=0 || numberOfFives%3!=0)
				System.out.println(-1);
			else{
				while(numberOfFives-->0)//this loop needs to be optimized
					System.out.print(5);
				while(numberOfThrees-->0)//this loop needs to be optimized
					System.out.print(3);
				System.out.println();
			}
			numberOfThrees=0;
			numberOfFives=0;
			T--;
		}
	}

}
