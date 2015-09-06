package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class TSORTOthers{
 
	public static void main(String[] args) {
		FastScanner in=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),i;
		int[]a=new int[n];
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		
		for(int b:a)
			out.println(b);
		out.flush();
	}
	static class FastScanner{
		BufferedReader br;
		StringTokenizer st;
		public FastScanner(){br = new BufferedReader(new InputStreamReader(System.in));}
		String nextToken(){
			while(st == null||!st.hasMoreElements()){
				try{st = new StringTokenizer(br.readLine());}catch(Exception e){}
			}
			return st.nextToken();
		}
		int nextInt(){return Integer.parseInt(nextToken());}
		long nextLong(){return Long.parseLong(nextToken());}
		double nextDouble(){return Double.parseDouble(nextToken());}
	}
 
}
