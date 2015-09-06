package trees;

public class Data implements Comparable{
	  private int data;
	  
	  public Data(int data){
		  this.data = data;
	  }
	  public int getData() {
		return data;
	  }

	  public void setData(int data) {
		this.data = data;
	  }
	@Override
	public int compareTo(Object o) {
		int ret=0;
		Data d  = (Data)o;
		if(this.data>d.getData())
			ret = 1;
		else if(this.data<d.getData())
			ret = -1;
		return ret;
	}
	  
	 
	public String toString(){
		return Integer.toString(data);
	}
	}
