import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//I had different ideas, first sorting first string and storing it in array list removing duplicates and keeping
//track of size of this list while processing each string in subsequent iterations but sorting seems unnecessary
//since there is better ideas, we will make use of the fact that input contains only 26 alphabets and create array for look up
//at the end, the elements which contain n as their array values are gem stone elements
public class GemStones {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
    int T = 0;
    int tmp=0,count=0;
    int[] track = new int[26];
    boolean[] bool = new boolean[26];
    char[] chr;
    T = Integer.parseInt(reader.readLine());
    int n = 0;
    while(T>0){
    	chr = reader.readLine().toCharArray();
    	for(int i=0; i<chr.length; i++){
    		tmp = (int)chr[i]-97;
    		if(bool[tmp]==true);
    		else{
    		 track[tmp]++;
             bool[tmp] = true;
    		}
    	}
    	for(int j=0;j<26;j++)
    		bool[j]=false;
    	n++;
    	T--;
    }//while loop
    for(int k=0;k<26;k++){
    	if(track[k]==n)
    		count++;
    }
    System.out.println(count);
 }
}
