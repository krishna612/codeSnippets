import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RANKLIST {
  public static void main(String[] args) throws NumberFormatException, IOException {
	int n,T,res;
	long s;
	Double d;
	String[] inputStr;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	T = Integer.parseInt(reader.readLine());
	for(int i=0;i<T;i++){
		inputStr = reader.readLine().split(" ");
		n = Integer.parseInt(inputStr[0]);
		s = Long.parseLong(inputStr[1]);
		d  = 0.5*(Math.sqrt(1+8*(s-n))+1);
		res = n - d.intValue();
		System.out.println(res);
	}
  }
}
