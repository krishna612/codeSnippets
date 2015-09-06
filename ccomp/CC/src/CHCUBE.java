import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//1152 1220
public class CHCUBE {
   public static void main(String[] args) throws NumberFormatException, IOException {
	 int T;
	 boolean flag = false;
	 String[] inputStr;
	 HashMap<String,Integer> map = new HashMap<String,Integer>(6);
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 T = Integer.parseInt(reader.readLine());
	 for(int i=0;i<T;i++){
		 flag = false;
		 inputStr = reader.readLine().split(" ");
		 map.put("black", 0);map.put("blue", 0);map.put("red", 0);
		 map.put("green", 0);map.put("yellow", 0);map.put("orange", 0);
		 for(String s: inputStr){
			 map.put(s, map.get(s)+1);
			 if(map.get(s)==3){
				 flag = true;
				 break;
			 }
		 }
		 if(flag==true)
		  System.out.println("Yes");
		 else
		  System.out.println("No");
	 }
   }
}
