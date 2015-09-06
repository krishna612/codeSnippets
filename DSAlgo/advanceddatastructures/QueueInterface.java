package advanceddatastructures;
public interface QueueInterface {
 public DataNode top() throws EmptyQueueException;
 public DataNode dequeue() throws EmptyQueueException;
 public void enqueue(DataNode node);
}
