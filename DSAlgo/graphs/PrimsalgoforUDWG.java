package graphs;

import advanceddatastructures.EmptyHeapException;
import advanceddatastructures.MinHeap;
import advanceddatastructures.HeapNode;

//1107
public class PrimsalgoforUDWG {
	
  public EdgeUnDirectedGraph findMST(EdgeGraphInterface graph) throws EmptyHeapException{
	  MinHeap heap = new MinHeap();
	  EdgeUnDirectedGraph MST = new EdgeUnDirectedGraph();
	  boolean[] coveredVertices = new boolean[graph.getNoOfVertices()];
	  int count = 0;
	  //getting first vertex
	  GraphNode node = graph.getAGraphNode();
	  Edge itrEdge;
	  while(count<=graph.getNoOfVertices()){
	  for(Edge e: graph.getEdgesIncidentToNode(node)){
		  GraphNode itr = e.getOtherNode(node);
		  if(coveredVertices[itr.getId()]==false)
		    heap.insert(new HeapNode(e));
	   }
	   itrEdge = (Edge)heap.deleteMin().getData();
	   MST.addEdge(itrEdge);
	   coveredVertices[node.getId()]=true;
	   count++;
	   if(coveredVertices[itrEdge.getFirst().getId()]==true){
		   node = itrEdge.getSecond();
	   }
	   else
		   node = itrEdge.getFirst();
	  }
	  return MST;
  }
}
