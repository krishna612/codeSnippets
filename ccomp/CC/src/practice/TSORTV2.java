package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TSORTV2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().trim());
		int[] array = new int[1000001];
		int tmp=0,tmpp=0;
		int min=10000000;
		int max = -1;
		for(int i=0;i<T;i++){
			tmp = Integer.parseInt(reader.readLine().trim());
			if(tmp<min){
				min = tmp;
			}
			if(tmp>max){
				max = tmp;
			}
			array[tmp]++;
		}
		for(int j=min;j<=max;j++){
			tmpp = array[j];
			while(tmpp>0){
				System.out.println(j);
				tmpp--;
			}
		}
		
	}
}
