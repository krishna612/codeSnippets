package mathandadhoc;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations0 implements GeneratePermutationsInterface{

	@Override
	public ArrayList<StringBuilder> generatePermutations(StringBuilder s) {
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		char[] charSing;
		StringBuilder tmp = new StringBuilder(s.substring(0, 1));
		list.add(tmp);
		for(int i=1;i<s.length();i++){
			tmp = list.get(0);
			while(tmp.length()==i){
				tmp = list.remove(0);
				charSing = s.substring(i, i+1).toCharArray();//get the char to be appended to all n-1 previous permutations
				for(int j=0;j<=i;j++){
					list.add(list.size(),new StringBuilder(tmp.insert(j, charSing[0])));
					tmp.deleteCharAt(j);
					//add these new created strings at the end of the list
				}
				tmp = list.get(0);
			}
		}
		return list;
	}

}
