package advanceddatastructures;

public class HeapNode implements Comparable{
    private Comparable data;

    public HeapNode(Comparable data){
    	this.data = data;
    }
   
    public Comparable getData() {
		return data;
	}
	
	public void setData(Comparable data) {
		this.data = data;
	}

	@Override
	public int compareTo(Object o) {
        HeapNode obj = (HeapNode)o;
		return data.compareTo(obj.getData());
	}
}
