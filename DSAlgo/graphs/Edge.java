package graphs;

public class Edge implements Comparable {
   private GraphNode first;
   private GraphNode second;
   private double weight;
	
    public Edge(GraphNode first, GraphNode second, double weight){
    	this.first = first;
    	this.second = second;
    	this.weight = weight;
    }
    
	@Override
	public int compareTo(Object obj) {
		int value = -2;
		Edge edge = (Edge)obj;
		if(this.weight==edge.getWeight())
			value = 0;
		else if(this.weight>edge.getWeight())
			value = 1;
		else 
			value = -1;
		return value;
	}
	
	public boolean equals(Object obj){
		boolean bool = false;
		Edge edge = (Edge)obj;
		if(edge.first.getDataNode().getData()==this.first.getDataNode().getData() && 
		   edge.second.getDataNode().getData()==this.second.getDataNode().getData() &&
		   edge.weight == this.weight){
			bool = true;
		}
		return bool;
	}

	public GraphNode getFirst() {
		return first;
	}

	public void setFirst(GraphNode first) {
		this.first = first;
	}

	public GraphNode getSecond() {
		return second;
	}

	public void setSecond(GraphNode second) {
		this.second = second;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString(){
		String str=null;
		str = this.first.getDataNode().getData()+"->"+this.weight+"(weight)->"+this.second.getDataNode().getData();
		return str;
	}
	
	public GraphNode getOtherNode(GraphNode node){
		GraphNode retNode=null;
		if(this.first.getId()==node.getId())
	        retNode = this.second;
		else if(this.second.getId()==node.getId())
			retNode = this.first;
		else
			retNode = null;
		return retNode;
	}

}
