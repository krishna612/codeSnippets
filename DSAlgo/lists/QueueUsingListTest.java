package lists;

public class QueueUsingListTest {
  public static void main(String[] args) throws EmptyListException {
	  QueueUsingList queue = new QueueUsingList();
	  //System.out.println(stack.pop().getData());
	  Data tmp;
		for(int i=0;i<5;i++){
			tmp = new Data(i);
			queue.queue(tmp);
		}
	  System.out.println(queue.dequeue().getData());
	  System.out.println(queue.dequeue().getData());
	  System.out.println(queue.dequeue().getData());
  }
}
