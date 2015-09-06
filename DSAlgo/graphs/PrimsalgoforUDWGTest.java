package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import advanceddatastructures.EmptyHeapException;

public class PrimsalgoforUDWGTest {
	public static void main(String[] args) throws IOException, EmptyHeapException {
		 EdgeGraphInterface graph = new EdgeUnDirectedGraph();
   	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 String line;
		 String[] inputStr;
		 int[] vert = new int[2];
		 double weight;
		 Edge edge;
		 GraphNode a=null,b=null;
		 System.out.println("enter edges of the graph (vertices weight seperated by space): terminate the line by done to mark end of input");
		 line = reader.readLine();
		 while(!line.equalsIgnoreCase("done")){
			 inputStr = line.split(" ");
			 vert[0] = Integer.parseInt(inputStr[0]);
			 vert[1] = Integer.parseInt(inputStr[1]);
			 weight = Double.parseDouble(inputStr[2]);
			 a = new GraphNode(new Data(vert[0]));
			 b = new GraphNode(new Data(vert[1]));
			 edge = new Edge(a,b,weight);
			 graph.addEdge(edge);
			 line = reader.readLine();
		 }
		 PrimsalgoforUDWG primsMST = new PrimsalgoforUDWG();
		 EdgeUnDirectedGraph mst = primsMST.findMST(graph);
		 for(Edge e: mst.getEdgeListOfGraph()){
			 System.out.println(e);
		 }
	}

}
