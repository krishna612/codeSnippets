package graphs;

import java.util.List;

public interface GraphInterface {
  public void addEdge(GraphNode u, GraphNode v);
  public int getNoOfEdges();
  public int getNoOfVertices();
  public void deleteEdge(GraphNode u, GraphNode v);
  public void print();
  public List<GraphNode> getNodeListOfGraph();
  public GraphNode getNodeFromList(GraphNode node);
  public GraphNode getNodeAtIndex(int index);
  public int getNodeIndex(GraphNode node);
}
