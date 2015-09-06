package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TLG {
  public static void main(String[] args) throws NumberFormatException, IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
   int noOfRounds = Integer.parseInt(reader.readLine().trim());
   int[] scores = new int[2];
   int player1MaxLead=0,player2MaxLead=0;
   String[] inputStr;
   for(int i=0;i<noOfRounds;i++){
	   inputStr = reader.readLine().trim().split(" ");
	   scores[0] = Integer.parseInt(inputStr[0]);
	   scores[1] = Integer.parseInt(inputStr[1]);
	   if(scores[0]>scores[1]){
		   if(player1MaxLead<(scores[0]-scores[1])){
			   player1MaxLead = (scores[0]-scores[1]);
		   }
	   }
	   else{
		   if(player2MaxLead<(scores[1]-scores[0])){
			   player2MaxLead = (scores[1]-scores[0]);
		   }
	   }
   }
   //printing output
   if(player1MaxLead > player2MaxLead){
	   System.out.print("1 ");
	   System.out.print(player1MaxLead);
   }
   else{
	   System.out.print("2 ");
	   System.out.print(player2MaxLead);
   }
  }
}
