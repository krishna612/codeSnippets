import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class GOT1 {
   public static void main(String[] args) throws IOException {
	   char[] chr;
	   int tmp=1;
	   boolean flag = false;
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   chr = reader.readLine().toCharArray();
	   Arrays.sort(chr);
	   int i = 0;
	   while(i<chr.length){
		   while((i!=chr.length-1)&&chr[i]==chr[i+1]){
			   tmp++;
			   i++;
		   }
		   if(tmp%2==1){
			   if(chr.length%2==0)//even length case
				   break;
			   else{
				   if(flag==false)
					   flag = true;
				   else
					   break;
			   }//odd length case
		   }
		   i++;
		   tmp=1;
	   }//while loop
	   if(i==chr.length)
		   System.out.println("YES");
	   else
		   System.out.println("NO");
   }
}
