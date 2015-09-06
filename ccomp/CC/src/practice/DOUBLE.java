package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DOUBLE {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		for(int i=0;i<T;i++){
			int tmp = Integer.parseInt(reader.readLine().trim());
			if(tmp%2==0)
			 System.out.println(tmp);
			else
			 System.out.println(tmp-1);
		}
	}

}
