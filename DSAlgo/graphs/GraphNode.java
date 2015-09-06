package graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	private Data data;
	private ArrayList<GraphNode> adjList; 
	private int index;
	private int id=-1;//this field is necessary and is a good design practice, should be using this starting from edge graphs
	
	public GraphNode(Data data){
		this.data = data;
		adjList = new ArrayList<GraphNode>();
	}
	
	public Data getDataNode() {
		return data;
	}
	
	public void setDataNode(Data data) {
		this.data = data;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void setIndex(int index){
		this.index = index;
	}
	
	public void addNodeToAdjList(GraphNode node){
		this.adjList.add(this.adjList.size(),node);
		//System.out.println("debug: adding"+node.getDataNode().getData()+" to node "+this.getDataNode().getData());
	}
	
	public List<GraphNode> getAdjList(){
		return adjList;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}

}
