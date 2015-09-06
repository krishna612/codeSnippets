package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CONFLIP {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T,N,G,I,Q;
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			G = Integer.parseInt(reader.readLine());
			for(int j=0;j<G;j++){
				inputStr = reader.readLine().split(" ");
				I = Integer.parseInt(inputStr[0]);
				N = Integer.parseInt(inputStr[1]);
				Q = Integer.parseInt(inputStr[2]);
				if((I^Q)==0){
					System.out.println(N/2);
				}
				else{
					System.out.println(N/2+1);
				}
			}
		}
	}

}
