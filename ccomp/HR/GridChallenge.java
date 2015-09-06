import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class GridChallenge {
  public static void main(String[] args) throws NumberFormatException, IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   int T = 0;
   int size = 0;
   char[] previousRow=null, currentRow=null;
   T = Integer.parseInt(reader.readLine());
   boolean flag = false;
   for(int i=0;i<T;i++){
	   size = Integer.parseInt(reader.readLine());
	   int j=0;
	   flag = false;
	   for(;j<size;j++){
		   currentRow = reader.readLine().toCharArray();
		   Arrays.sort(currentRow);
		   if(j==0)
		    previousRow = currentRow;
		   else{
		    for(int k=0;k<size;k++){
			   if(Character.getNumericValue(currentRow[k])<Character.getNumericValue(previousRow[k])){
				   flag = true;
				   break;
			   }
		     }//inner k loop
		    if(flag)
			   break;
		    else
		    	previousRow = currentRow;
		   }
	   }//outer j loop
	   if(j==size)
		   System.out.println("YES");
	   else{
		    System.out.println("NO");
		    while(j<size-1){
		    	reader.readLine();
		        j++;}
	      }
   }
 }
}
