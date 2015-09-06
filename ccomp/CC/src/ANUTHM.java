import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ANUTHM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T,N,M;
		float sumProb=0;
		float[][] table;
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			sumProb=0;
			inputStr = reader.readLine().split(" ");
			N = Integer.parseInt(inputStr[0]);
			M = Integer.parseInt(inputStr[1]);
			table = new float[N][M];
			for(int r=0;r<N;r++){
				for(int c=0;c<M;c++){
					if(r==0&&c==0){
						table[r][c]=1;
					 }
					else if(r==N-1&&c==M-1){
						table[r][c]=1;
					}
					else if(r<N-1){
						table[r][c] =  table[r][c-1];
					}
					else if(c<M-1){
						table[r][c] = table[r-1][c];
					}
					else{
						table[r][c] = table[r-1][c]/2+table[r][c-1]/2;
					}
					sumProb+=table[r][c];
				}
			}
		       System.out.println(sumProb);
		}
	}

}
