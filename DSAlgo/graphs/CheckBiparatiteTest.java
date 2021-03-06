package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//1058,1116
public class CheckBiparatiteTest {
  public static void main(String[] args) throws IOException {
	     GraphInterface graph = new UnDirectedGraph();
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
		 System.out.println("debug: outside the while loop");
		 //graph.print();
		 CheckBiparatite isBP =  new CheckBiparatite(graph);
		 System.out.println("given graph is biparatite: "+isBP.isBiparatite());
  }	
}
