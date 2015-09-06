import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//idea is to use convert given into a directed graph and after that applying BFS on it
public class SnakesAndLadders {
	
	private class DirectedGraph{
		int noOfVertices;
		int noOfEdges;
		int[] vertices;
		List<List<Integer>> lists;
		public DirectedGraph(int noOfVertices){
			this.noOfVertices = noOfVertices;
			vertices = new int[noOfVertices];
			lists = new ArrayList<List<Integer>>(); 
            for(int i=0;i<noOfVertices;i++){
				List<Integer> tmp = new LinkedList<Integer>();
				lists.add(tmp);
			}
		}

		public void addEdge(int x, int y){
			(lists.get(x)).add(y);
			noOfEdges++;
		}
		
		public List<Integer> adjList(int u){
			return lists.get(u);
		}
		
		public int getNoOfVertices(){
			return noOfVertices;
		}
		
		public int getNoOfEdges(){
			return noOfEdges;
		}
		
	}
	
	private class BFS {
		boolean[] isMarked;
		DirectedGraph graph;
		int[] edgeTo;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		public BFS(DirectedGraph graph){
			this.graph = graph;
			isMarked = new boolean[graph.getNoOfVertices()];
			edgeTo = new int[graph.getNoOfVertices()];
			for(int i=0;i<this.graph.getNoOfVertices();i++){
				edgeTo[i]=-1;
			}
		}
		
		public void BFS(int source){
			isMarked[source] = true;
			edgeTo[source] = source;
			queue.add(source);
			while(!queue.isEmpty()){
				int current = queue.remove();
				for(Integer u: this.graph.adjList(current)){
					if(!isMarked[u]){
						edgeTo[u] = current;
						queue.add(u);
						isMarked[u] = true;
					}
				}
			}
		}
		
			
		public List<Integer> Paths(int source, int v){
			BFS(source);
			List<Integer> path = new LinkedList<Integer>();
			path.add(0,v);
			int tmp = edgeTo[v];
			while((tmp!=source)&&(tmp!=-1)){
				path.add(0,tmp);
				tmp = edgeTo[tmp];
			}
			if(tmp==source)
				path.add(0,tmp);
			return path;
		}
		
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SnakesAndLadders mainObj = new SnakesAndLadders();
		int T=0,s=0,l=0,tmp=0;
		String[] tmpStr,innerTmpStr;
		DirectedGraph graph;
		BFS bfs;
		ArrayList<Integer> list = new ArrayList<Integer>(30);
		T = Integer.parseInt(reader.readLine());
		while(T>0){
			graph = mainObj.new DirectedGraph(101);
			tmpStr = reader.readLine().split(",");
			l = Integer.parseInt(tmpStr[0]);
			s = Integer.parseInt(tmpStr[1]);
			tmpStr = reader.readLine().split(" ");
			for(int i=0; i<l; i++){
				innerTmpStr = tmpStr[i].split(",");
				tmp = Integer.parseInt(innerTmpStr[0]);
				graph.addEdge(tmp, Integer.parseInt(innerTmpStr[1]));
				list.add(tmp);
			}
			tmpStr = reader.readLine().split(" ");
			for(int i=0; i<s; i++){
				innerTmpStr = tmpStr[i].split(",");
				tmp = Integer.parseInt(innerTmpStr[0]);
				graph.addEdge(tmp, Integer.parseInt(innerTmpStr[1]));
				list.add(tmp);
			}
			//add edges to the graph which are not in the list
			for(int i=1;i<100;i++){
				if(!list.contains(i)){
					for(int j=1;j<=6;j++){
						if((i+j)<=100){
							graph.addEdge(i, i+j);
						}
					}
				}
			}
			bfs = mainObj.new BFS(graph);
			List<Integer> finalList = bfs.Paths(1,100);
			int minRolls = finalList.size();
			System.out.println(minRolls-2);
			T--;
		}
		
	}

}
