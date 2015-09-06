package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HS08TEST {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float balance;
		int withDraw;
		String[] inputStr;
		inputStr = reader.readLine().trim().split(" ");
		withDraw = Integer.parseInt(inputStr[0]);
		balance = Float.parseFloat(inputStr[1]);
		if((balance-withDraw<0.5) || (withDraw%5 !=0)){
			System.out.printf("%.2f",balance);
		}
		else{
			System.out.printf("%.2f",(float)(balance-withDraw-0.5));
		}
	}

}
