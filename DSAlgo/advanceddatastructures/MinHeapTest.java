package advanceddatastructures;

public class MinHeapTest {
	public static void main(String[] args) throws EmptyHeapException {
		MinHeap heap = new MinHeap(10);
		System.out.println("first test: should return in increasing order");
		heap.insert(new HeapNode(5));
		heap.insert(new HeapNode(4));
		heap.insert(new HeapNode(3));
		heap.insert(new HeapNode(2));
		heap.insert(new HeapNode(1));
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println("second test: same values should not break");
		heap.insert(new HeapNode(1));
		heap.insert(new HeapNode(1));
		heap.insert(new HeapNode(1));
		heap.insert(new HeapNode(1));
		heap.insert(new HeapNode(1));
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println("second test: inserted in different order but o/p should be same");
		heap.insert(new HeapNode(1));
		heap.insert(new HeapNode(2));
		heap.insert(new HeapNode(5));
		heap.insert(new HeapNode(3));
		heap.insert(new HeapNode(4));
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
		System.out.println(heap.deleteMin().getData());
	}

}
