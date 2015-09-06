package graphs;

//1018,1041
public class CheckBiparatite {
  GraphInterface graph;
  int[] vertexColors;
  //this is same as vertex coloring problem, 0 means not visited, 1 is black and 0 is white.
  
  public CheckBiparatite(GraphInterface graph){
	  this.graph = graph;
	  vertexColors = new int[this.graph.getNoOfEdges()];
  }
  
  public boolean isBiparatite(){
	  GraphNode first = graph.getNodeAtIndex(0);
	  //if(first==null)System.out.println("debug: first is null");
	  vertexColors[0] = 1;
	  return DFS(first);
  }
  
  private boolean DFS(GraphNode vertex){
	  //if(vertex==null)System.out.println("debug: vertex is null");
	  int parentVertexColor = vertexColors[this.graph.getNodeIndex(vertex)];
	  int childVertexColor;
	  int childIndex;
	  for(GraphNode itr: vertex.getAdjList()){
		  childIndex = this.graph.getNodeIndex(itr);
		  childVertexColor = vertexColors[childIndex];
		  if(childVertexColor!=0 && childVertexColor==parentVertexColor){
			  return false;
		  }
		  if(childVertexColor==0){
			  if(parentVertexColor==1)
				  childVertexColor = 2;
			  else
				  childVertexColor = 1;
			  vertexColors[childIndex] = childVertexColor;
			  return DFS(itr);
		  }
	  }
	  System.out.println("debug: before return in DFS ");
	  return true;
  }
  
}
