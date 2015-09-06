import java.util.Arrays;
import java.util.Scanner;


public class MakeItAnagram {
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	char[] chrA,chrB;
	chrA = in.next().toCharArray();
	chrB = in.next().toCharArray();
	Arrays.sort(chrA);
	Arrays.sort(chrB);
   }
}
