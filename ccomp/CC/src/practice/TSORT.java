package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TSORT {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int j=0;j<6;j++){
			list.add(new ArrayList<Integer>());
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		String tmp;
		for(int i=0;i<T;i++){
			tmp =reader.readLine().trim();
			list.get(tmp.length()-1).add(Integer.parseInt(tmp));
		}
		for(int k=0;k<6;k++){
			Collections.sort(list.get(k));
			for(int p: list.get(k)){
				System.out.println(p);
			}
		}
	}

}
