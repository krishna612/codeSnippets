import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class ONEKING {
	class Tuple implements Comparable{
		int a,b;
        
		public Tuple(int a, int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(Object o) {
			Tuple t = (Tuple)o;
			int ret=0;
			if(t.a > this.a)
				ret=-1;
			else
				if(t.a < this.a)
				 ret=1;
			 return ret;
		}

	}
	
	public static void sort(ONEKING.Tuple[] arr){
		Arrays.sort(arr);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ONEKING one = new ONEKING();
		int T = Integer.parseInt(reader.readLine());
		int N = 0;
		ONEKING.Tuple[] tupleArray;
		ONEKING.Tuple tmp;
		int a=0,b=0,counter=1;
		String[] inputStr;
		for(int i=0;i<T;i++){
			counter = 1;
			N = Integer.parseInt(reader.readLine());
			tupleArray = new ONEKING.Tuple[N];
			for(int j=0;j<N;j++){
				inputStr = reader.readLine().split(" ");
				a = Integer.parseInt(inputStr[0]);
				b = Integer.parseInt(inputStr[1]);
				tupleArray[j] = one.new Tuple(a,b);
			}
			Arrays.sort(tupleArray);
			tmp = tupleArray[0];
			for(int k=1;k<N;k++){
				if(tupleArray[k].a > tmp.b){
					counter++;
					tmp = tupleArray[k];
				}
			}
		  System.out.println(counter);
		}
	}

}
