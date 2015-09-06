package graphs;

import java.util.List;

public interface EdgeGraphInterface {
  public void addEdge(Edge edge);
  public int getNoOfEdges();
  public int getNoOfVertices();
  public void deleteEdge(Edge e);
  public void print();
  public List<Edge> getEdgeListOfGraph();
  public Edge getEdgeFromList(Edge edge);
  public List<Edge> getEdgesIncidentToNode(GraphNode node);
  public GraphNode getAGraphNode();
}
