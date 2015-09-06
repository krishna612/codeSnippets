package advanceddatastructures;

public interface HeapInterface<T> {
	public void insert(HeapNode node);
    public HeapNode getMin() throws EmptyHeapException;
    public HeapNode deleteMin() throws EmptyHeapException;
}
