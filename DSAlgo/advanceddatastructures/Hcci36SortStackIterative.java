package advanceddatastructures;
//652,702 710,747
//sort stack in decreasing order
public class Hcci36SortStackIterative {
  
	public StackInterface sortStack(StackInterface stack) throws EmptyStackException{
		StackInterface sortedStack = new StackUsingArray();
		while(!stack.isEmpty()){
			DataNode top = stack.pop();
			if(sortedStack.isEmpty()){//starting case
				sortedStack.push(top);
			}
			else{
				  DataNode tmp = sortedStack.peek();
				  if(top.getData()>tmp.getData()){//if already in order
						sortedStack.push(top);
				  }
				  else{//other wise we need to push elements to other stack put top in place then again push back
					  int count = 0;//to keep track of how many pushes happen from one stack to other
					  while(!sortedStack.isEmpty() && sortedStack.peek().getData()>top.getData()){	
						stack.push(sortedStack.pop());
						count++;
					  }
					  sortedStack.push(top);
					  while(count>0){//again push back the count no of item from stack to sorted stack
						  sortedStack.push(stack.pop());
						  count--;
					  }
				  }
				
			}
		}
		return sortedStack;
	}
}
