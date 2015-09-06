import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
  public static void main(String[] args) throws NumberFormatException, IOException {
    int T=0,length=0,lessCount=0,greatCount=0,index=0;
    int[] firstHalf = new int[26];
    int[] secondHalf = new int[26];
    char[] input;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(reader.readLine());
    while(T>0){
    	input = reader.readLine().toCharArray();
    	length = input.length;
    	if(length%2==1)
    		System.out.println(-1);
    	else{
    		for(int i=0;i<=length/2-1;i++){
    			index = (Character.getNumericValue(input[i]))-10;
    			firstHalf[index]+=1;
    		}
    		for(int j=length/2;j<=length-1;j++){
    			index = (Character.getNumericValue(input[j]))-10;
    			secondHalf[index]+=1;
    		}
    		for(int k=0;k<26;k++){
    			if(firstHalf[k]<secondHalf[k]){
    				lessCount+=secondHalf[k]-firstHalf[k];
    			}
    			else{
    				greatCount+=firstHalf[k]-secondHalf[k];
    			}
    		}
    		if(lessCount==greatCount){
    			System.out.println(lessCount);
    		}
    		else
    			System.out.println(-1);
    	}
    	lessCount=0;
    	greatCount=0;
    	for(int i=0;i<26;i++){
    		firstHalf[i] = 0;
    		secondHalf[i] = 0;
    	}
    	T--;
    }
  }
}
