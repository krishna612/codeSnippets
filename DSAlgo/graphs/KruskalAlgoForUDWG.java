package graphs;

import java.util.Collections;
import java.util.List;

//1125 1145
public class KruskalAlgoForUDWG {
	
	public EdgeUnDirectedGraph findMST(EdgeGraphInterface graph){
		EdgeUnDirectedGraph MST = new EdgeUnDirectedGraph();
		List<Edge> edgeList = graph.getEdgeListOfGraph();
		Collections.sort(edgeList);
		for(Edge edge:edgeList){
			
		}
		return MST;
	}

}
