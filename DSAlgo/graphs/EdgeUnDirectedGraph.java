package graphs;

import java.util.ArrayList;
import java.util.List;
//1022
public class EdgeUnDirectedGraph implements EdgeGraphInterface{
    private List<Edge> edgeList = new ArrayList<Edge>();
    private int counter=0;
    
	@Override
	public void addEdge(Edge edge) {
		edgeList.add(edge);
		if(edge.getFirst().getId()==-1){
			edge.getFirst().setId(counter);
			counter++;
		}
		if(edge.getSecond().getId()==-1){
			edge.getSecond().setId(counter);
			counter++;
		}	
	}

	
   protected void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	@Override
	public int getNoOfEdges() {
		return this.edgeList.size();
	}

	@Override
	public int getNoOfVertices() {
		return this.counter;
	}

	@Override
	public void deleteEdge(Edge e) {
		
	}

	@Override
	public void print() {
		
	}

	@Override
	public List<Edge> getEdgeListOfGraph() {
		return this.edgeList;
	}

	//we need to get exact reference from the list
	@Override
	public Edge getEdgeFromList(Edge edge) {
		Edge match = null;
		for(Edge e: edgeList){
			if(e.equals(edge)){
				match = edge;
				break;
			}
		}
		return match;
	}

	@Override
	public List<Edge> getEdgesIncidentToNode(GraphNode node) {
		List<Edge> incidentList = new ArrayList<Edge>();
		for(Edge e: edgeList){
			if(e.getFirst().getDataNode().getData()==node.getDataNode().getData() ||
			   e.getSecond().getDataNode().getData()==node.getDataNode().getData()){
				incidentList.add(e);
			}
		}
		return incidentList;
	}
	
	//new method included for prims algo 
	public GraphNode getAGraphNode(){
		return edgeList.get(0).getFirst();
	}

}
