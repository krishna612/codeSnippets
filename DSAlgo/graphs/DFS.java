package graphs;

import java.util.ArrayList;
//807 847

public class DFS {
  GraphInterface graph;
  GraphNode[] parNode;
  boolean[] isVisited;
  ArrayList<GraphNode> pathList;
  
  public DFS(GraphInterface graph){
	  this.graph = graph;
  }
  
  public ArrayList<GraphNode> findPath(GraphNode at, GraphNode bt){
	  GraphNode a = graph.getNodeFromList(at);//this is a very tricky condition I missed costing lots of time, since I changed underlying design of graph its essential.
	  GraphNode b = graph.getNodeFromList(bt);
	  parNode = new GraphNode[this.graph.getNoOfVertices()];
	  isVisited = new boolean[this.graph.getNoOfVertices()];
	  pathList = new ArrayList<GraphNode>();
	  DFSearch(a);
	  GraphNode tmp = b;
	  while((tmp!=null)&&(tmp.getDataNode().compareTo(a.getDataNode())!=0)){
		  pathList.add(0,tmp);
		  tmp = parNode[tmp.getIndex()];
	  }
	  if(pathList.size()>1)
	    pathList.add(0,tmp);
	  else
		pathList.remove(0);
	  return pathList;
  }
  
  private void DFSearch(GraphNode node){
	  isVisited[node.getIndex()] = true;
	  for(GraphNode tmp: node.getAdjList()){
		  //System.out.println("debug: tmp node: "+tmp.getDataNode().getData()+" node: "+node.getDataNode().getData());
		  if(isVisited[tmp.getIndex()]==false){
			  parNode[tmp.getIndex()] = node;
			  DFSearch(tmp);
		  }
	  }
  }
	
}
