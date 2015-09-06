import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PRPALN {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		String str;
		int length;
		int count;
		for(int i=0;i<T;i++){
			count = 0;//our decision variable, it should be 1 to print YES 
			str = reader.readLine();
			length = str.length();

				for(int j=0; j<length; j++){
					if(j==0){
						if(str.charAt(j)!=str.charAt(length-1-j) && str.charAt(j)!=str.charAt(length-2-j))
							count++;
					}
					else if(j==length-1){
						if(str.charAt(j)!=str.charAt(length-1-j) && str.charAt(j)!=str.charAt(length-j))
							count++;
					}
					else{
					  if(str.charAt(j)!=str.charAt(length-j) && str.charAt(j)!=str.charAt(length-1-j)&& str.charAt(j)!=str.charAt(length-2-j))
						count++;
					}
					if(count>1)
						break;
				}//end of for loop
				if(count<=1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			
		}
	}


