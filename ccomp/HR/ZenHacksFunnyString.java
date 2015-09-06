import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ZenHacksFunnyString {
  public static int mod(int i){
	  if(i>0)
		  return i;
	  else
		  return i*-1;
  }
  public static void main(String[] args) throws NumberFormatException, IOException {
	int T;
	char[] chr;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		chr = reader.readLine().toCharArray();
		int j;
		for(j=0;j<=(chr.length/2);j++){
			if(mod((int)chr[j]-(int)chr[j+1])!=mod((int)chr[chr.length-j-1]-(int)chr[chr.length-j-2]))
				break;
		}
		if(j>=(chr.length/2)){
			System.out.println("Funny");
		}
		else{
			System.out.println("Not Funny");
		}
	}
  }
}
