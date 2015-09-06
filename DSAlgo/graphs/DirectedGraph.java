package graphs;
import util.DrawDirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph implements GraphInterface{
  private int noOfVertices;
  private List<GraphNode> nodeList = new ArrayList<GraphNode>();
  private int noOfEdges=0;
  
    @Override
	public void addEdge(GraphNode u, GraphNode v) {
	  	if(!isNodePresent(u)){
	  		nodeList.add(u);
	  		u.setIndex(noOfVertices);
	  		noOfVertices++;
	  	}
	  	if(!isNodePresent(v)){
	  		nodeList.add(v);
	  		v.setIndex(noOfVertices);
	  		noOfVertices++;
	  	}
	  	getNodeFromList(u).addNodeToAdjList(getNodeFromList(v));
	  	noOfEdges++;
	}
	
    @Override
	public int getNoOfEdges() {
		return this.noOfEdges;
	}
	
    @Override
	public int getNoOfVertices() {
	    return this.noOfVertices;
	}
	
    @Override
	public void deleteEdge(GraphNode u, GraphNode v) {
		
	}
	
    @Override
	public void print() {
    	DrawDirectedGraph frame = new DrawDirectedGraph("Visual Graph");
		frame.setSize(800,800);
		frame.setVisible(true);
        
		//adding nodes to JFrame
		for(int i=0;i<nodeList.size();i++){
			String s = Integer.toString(nodeList.get(i).getDataNode().getData());
		    int x = (int)(Math.random()*780);
		    int y = (int)(Math.random()*780);
		    frame.addNode(s,x,y);
		}
		
		//adding edges to JFrame
		for(int j=0;j<nodeList.size();j++){
			List<GraphNode> adjList = nodeList.get(j).getAdjList();
			for(int k=0; k<adjList.size();k++){
				frame.addEdge(nodeList.get(j).getDataNode().getData(), adjList.get(k).getDataNode().getData());
			}
		}
	}

	
	private boolean isNodePresent(GraphNode a) {
		boolean bool = false;
		for(GraphNode tmp: nodeList){
			if(tmp.getDataNode().compareTo(a.getDataNode())==0){
				bool = true;
				break;
			}
		}
		return bool;
	}
	
	public GraphNode getNodeFromList(GraphNode node){
		GraphNode tmp = null;
		for(GraphNode t: nodeList){
			if(t.getDataNode().compareTo(node.getDataNode())==0){
				tmp = t;
				break;
			}
		}
		return tmp;
	}

	@Override
	public List<GraphNode> getNodeListOfGraph() {
		return nodeList;
	}

	@Override
	public GraphNode getNodeAtIndex(int index) {
		GraphNode node=null;
		if(index>=0 && index<this.noOfVertices){
			node = this.nodeList.get(index);
		}
		return node;
	}

	@Override
	public int getNodeIndex(GraphNode node) {
		int index=0;
		GraphNode itr;
		while(index<nodeList.size()){
			itr = nodeList.get(index);
			if(itr.getDataNode().compareTo(node.getDataNode())==0){
				break;
			}
			index++;
		}
		return index;
	}
	
	
}
