import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1152 1215
public class CHPLGNS {
 public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 int T = Integer.parseInt(reader.readLine());	
	 int N,M,max,val;
	 int[] maxXcoordintaes,sorted;
	 String[] inputStr;
	 for(int i=0;i<T;i++){
		 N = Integer.parseInt(reader.readLine());
		 maxXcoordintaes = new int[N];
		 sorted = new int[N];
		 for(int j=0;j<N;j++){
			 M = Integer.parseInt(reader.readLine()); 
			 inputStr = reader.readLine().split(" ");
			 max = Integer.parseInt(inputStr[0]);
			 for(int k=0;k<2*M;k=k+2){
				val =  Integer.parseInt(inputStr[k]);
				if(val>max)
					max = val;
			 }
			 maxXcoordintaes[j] = max;
			 sorted[j] = max;
		 }
		 Arrays.sort(sorted);
		 for(int p=0;p<N;p++){
			 System.out.print(Arrays.binarySearch(sorted, maxXcoordintaes[p])+" ");
		 }
		 System.out.println();
	 }
 }
}
