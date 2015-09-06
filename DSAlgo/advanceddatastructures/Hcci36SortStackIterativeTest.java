package advanceddatastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//552,618
public class Hcci36SortStackIterativeTest {
	public static void main(String[] args) throws IOException, EmptyStackException {
		Hcci36SortStackIterative sortTheStack = new Hcci36SortStackIterative();
		StackInterface stack = new StackUsingArray();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter space seperated data items, in this case integers");
		String[] inputStr = reader.readLine().split(" ");
		for(int i=0;i<inputStr.length;i++){
			stack.push(new DataNode(Integer.parseInt(inputStr[i])));
		}
		StackInterface sortedStack = sortTheStack.sortStack(stack);
		while(!sortedStack.isEmpty()){
			System.out.print(sortedStack.pop().getData()+" ");
		}
	}

}
