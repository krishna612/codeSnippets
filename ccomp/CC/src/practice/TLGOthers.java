package practice;

import java.util.Scanner;

public class TLGOthers{
 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),i,res=0,max=0,a=0,b=0;
		for(i=0;i<n;i++){
			a+=in.nextInt();
			b+=in.nextInt();
			if(max<Math.abs(a-b)){
				max=Math.abs(a-b);
				res=a>b?1:2;
			}
		}
		in.close();
		System.out.println(res+" "+max);
	}
 
}