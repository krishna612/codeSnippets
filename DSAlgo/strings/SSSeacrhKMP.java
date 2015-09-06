package strings;

public class SSSeacrhKMP implements SSSearchInterface{
    int[][] table;
	@Override
	public int findFirstMatch(String text, String pattern) {
		int i,index=0,state=0;
		buildTable(pattern);
		for(i=0;i<text.length();i++){
			state = table[text.charAt(i)][state];
			//System.out.println("debug: state is "+state);
			if(state==pattern.length())
				break;
		}
		if(i==text.length())
			index=-1;
		else
			index=i-pattern.length()+1;
		return index;
    }
	
	private void buildTable(String pattern){
		table = new int[256][pattern.length()];
		
		//filling all characters in the pattern itself
		for(int k=0;k<pattern.length();k++){
			table[pattern.charAt(k)][k]=k+1;
		}
		int x=0;
		for(int j=1;j<pattern.length();j++){
			for(int i=0;i<255;i++){//coloumn 0 must be neglected as it had already been filled properly.
				if(table[i][j]==0)
				  table[i][j] = table[i][x];
			}
			x = table[pattern.charAt(j)][x];
		}
	}
	
	
	
}
