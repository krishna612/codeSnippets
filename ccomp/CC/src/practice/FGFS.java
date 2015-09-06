package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Interval implements Comparable{
	int start;
	int end;
	
	public Interval(int a,int b){
		this.start = a;
		this.end = b;
	}
	
	@Override
	public int compareTo(Object o) {
		Interval other = (Interval)o;
		if(this.end>other.end){
			return 1;
		}
		else if(this.end<other.end){
			return -1;
		}
		else
		    return 0;
	}
}
public class FGFS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T,N,K,s,f,p,count;
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			count = 0;
			inputStr = reader.readLine().split(" ");
			N = Integer.parseInt(inputStr[0]);
			K = Integer.parseInt(inputStr[1]);
			ArrayList<ArrayList<Interval>> list = new ArrayList<ArrayList<Interval>>(K);
			for(int j=0;j<K;j++){
				list.add(j,new ArrayList<Interval>());
			}
			for(int m=0;m<N;m++){
				inputStr = reader.readLine().split(" ");
				s = Integer.parseInt(inputStr[0]);
				f = Integer.parseInt(inputStr[1]);
				p = Integer.parseInt(inputStr[2]);
				list.get(p-1).add(new Interval(s,f));
			}
			for(int q=0;q<K;q++){
				if(list.get(q).size()>0){
				  Collections.sort(list.get(q));
				  count++;
				  for(int r=0;r<list.get(q).size()-1;r++){
					  if(list.get(q).get(r).end<=list.get(q).get(r+1).start){
						  count++;
					  }
				  }
				}
				
			}
			System.out.println(count);
		}
	}
}
