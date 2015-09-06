import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CLPERM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int N,K,key;
		String[] inputStr;
		int[] missing;
		boolean flag=false;
		for(int i=0;i<T;i++){
			inputStr = reader.readLine().split(" ");
			N = Integer.parseInt(inputStr[0]);
			K = Integer.parseInt(inputStr[1]);
			inputStr = reader.readLine().split(" ");
			missing = new int[inputStr.length];
			for(int j=0;j<inputStr.length;j++){
				missing[j] = Integer.parseInt(inputStr[j]);
			}
			Arrays.sort(missing);
			for(int k=0;k<missing.length;k++){
				key = missing[k];
				int p;
				for(p=k-1;p>key/2 && p>=0;k--){
				   if(Arrays.binarySearch(missing, p) <0 &&	Arrays.binarySearch(missing, key-p) <0){
					   break;
				   }
				}
				if(p==key/2){
					if(key%2==0){
						System.out.println("Mom");
					}
					else{
						System.out.println("Chef");
					}
				}
			}
		}
	}

}
