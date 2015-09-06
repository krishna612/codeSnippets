package mathandadhoc;

import java.util.ArrayList;

public class GeneratePermutations0Test {
	public static void main(String[] args) {
		GeneratePermutations0 permt = new GeneratePermutations0();
		ArrayList<StringBuilder> list = permt.generatePermutations(new StringBuilder("1234"));
		for(StringBuilder str:list)
			System.out.println(str);
//		StringBuilder test = new StringBuilder("testdebug");
//		StringBuilder tmp = new StringBuilder(test.substring(3, 6));
//		System.out.println(tmp);
//		test.insert(8, 'x');
//		test.deleteCharAt(8);
//		System.out.println(test);
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("first");list.add("second");
//		list.add(list.size(),"third");
//		System.out.println(list);
		
	}

}
