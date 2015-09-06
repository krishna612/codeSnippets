package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DFSTest {
   public static void main(String[] args) throws IOException {
	     GraphInterface graph = new DirectedGraph();
	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 String line;
		 String[] inputStr;
		 int[] vert = new int[2];
		 System.out.println("enter edges of the graph (vertices seperated by space): terminate the line by done to mark end of input");
		 line = reader.readLine();
		 while(!line.equalsIgnoreCase("done")){
			 inputStr = line.split(" ");
			 vert[0] = Integer.parseInt(inputStr[0]);
			 vert[1] = Integer.parseInt(inputStr[1]);
			 graph.addEdge(new GraphNode(new Data(vert[0])), new GraphNode(new Data(vert[1])));
			 line = reader.readLine();
		 }
		 graph.print();
		 System.out.println("DFS: enter space seperated nodes a b for which we need to find path a to b");
		 line = reader.readLine();
		 inputStr = line.split(" ");
		 vert[0] = Integer.parseInt(inputStr[0]);
		 vert[1] = Integer.parseInt(inputStr[1]);
		 DFS dfs = new DFS(graph);
		 ArrayList<GraphNode> list = dfs.findPath(new GraphNode(new Data(vert[0])), new GraphNode(new Data(vert[1])));
		 System.out.println("get size: "+list.size());
		 for(GraphNode tmp:list){
			 System.out.print(tmp.getDataNode()+"->");
		 }
  }
}
