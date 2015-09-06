package graphs;

import java.util.ArrayList;

//354,426
public class FindPathInMaze {
   private GraphInterface graph;
   private BFS bfs;
   private int n;
   
   public void buildGraphFromMaze(int n,boolean[][] maze){
	   this.graph = new UnDirectedGraph();
	   this.n = n;
	   for(int i=0;i<n;i++){    
		   for(int j=0;j<n;j++){
			   if(maze[i][j]==true){
				   if((j<n-1) && maze[i][j+1]==true){
					   graph.addEdge(new GraphNode(new Data(i*n+j)), new GraphNode(new Data(i*n+j+1)));
				   }
				   if((i<n-1) && maze[i+1][j]==true){
					   graph.addEdge(new GraphNode(new Data(i*n+j)), new GraphNode(new Data((i+1)*n+j)));
				   }
				   if((i<n-1) && (j<n-1) && maze[i+1][j+1]==true){
					   graph.addEdge(new GraphNode(new Data(i*n+j)), new GraphNode(new Data((i+1)*n+j+1)));
				   }
			   }
		   }
	   }
   }
   
   public ArrayList<GraphNode> findPath(){
	   ArrayList<GraphNode> list=null;
	   this.bfs = new BFS(this.graph);
	   return this.bfs.findPath(new GraphNode(new Data(0)), new GraphNode(new Data(n*n-1)));
   }
}
