import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SHBeastV1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = 0, n = 0;
		int numberOfThrees=0,numberOfFives=0,lengthFive=0,lengthThree=0;
		StringBuilder strFive,strThree;
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
				if(numberOfFives>0){
				 strFive = new StringBuilder("5");
				 lengthFive = strFive.length();
				 while(lengthFive<numberOfFives){
					strFive.append(strFive);
					lengthFive = strFive.length();
				 }
				 if(lengthFive>numberOfFives){
					strFive.delete(numberOfFives, lengthFive);
				 }
				 System.out.print(strFive);
				}
				if(numberOfThrees>0){
				 strThree = new StringBuilder("3");
				 lengthThree = strThree.length();
				 while(lengthThree<numberOfThrees){
					strThree.append(strThree);
					lengthThree = strThree.length();
				 }
				 if(lengthThree>numberOfThrees){
					strThree.delete(numberOfThrees, lengthThree);
				 }
				 System.out.print(strThree);
				}
				
				System.out.println();
			}
			numberOfThrees=0;
			numberOfFives=0;
			T--;
		}
	}

}
