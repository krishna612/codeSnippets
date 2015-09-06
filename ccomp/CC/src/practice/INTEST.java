package practice;

import java.util.Scanner;

public class INTEST {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int k = scanner.nextInt();
	int counter=0;
	int tmp;
	for(int i=0;i<n;i++){
	  	tmp = scanner.nextInt();
	  	if(tmp%k==0)
	  		counter++;
	}
	System.out.println(counter);
  }
}
