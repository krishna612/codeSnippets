package strings;

public class SSSeacrhBruteForce0 implements SSSearchInterface{

	@Override
	public int findFirstMatch(String text, String pattern) {
		int i;
		for(i=0;i<text.length()-pattern.length()+1;i++){
			int j;
			for(j=0;j<pattern.length();j++){
				if(pattern.charAt(j)!=text.charAt(i+j)){
					break;
				}
			}
			if(j==pattern.length()){
				return i;
			}
		}
		return -1;
	}
	
}
