package advanceddatastructures;

public class QueueUsingOnlyStacksTest {
  public static void main(String[] args) throws EmptyQueueException {
	QueueUsingOnlyStacks queue = new QueueUsingOnlyStacks();
	queue.enqueue(new DataNode(1));
	System.out.println(queue.dequeue().getData());
	queue.enqueue(new DataNode(2));
	System.out.println(queue.dequeue().getData());
	queue.enqueue(new DataNode(3));
	queue.enqueue(new DataNode(4));
	queue.enqueue(new DataNode(5));
	System.out.println(queue.dequeue().getData());
  }
}
