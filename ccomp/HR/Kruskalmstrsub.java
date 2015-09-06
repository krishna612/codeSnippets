
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//315 415 620 650
public class Kruskalmstrsub {
	
	class Edge implements Comparable{
		int x,y,w;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getW() {
			return w;
		}
		public void setW(int w) {
			this.w = w;
		}
		
		public Edge(int x, int y, int w){
			this.x = x;
			this.y = y;
			this.w = w;
		}
		
		@Override
		public int compareTo(Object obj) {
			int value = -2;
			Edge edge = (Edge)obj;
			if(this.w==edge.getW()){
				if(this.x+this.y == edge.x+edge.y)
				  value = 0;
				else if(this.x+this.y > edge.x+edge.y)
				  value = 1;
				else 
				  value = -1;
			}
			else if(this.w>edge.getW())
				value = 1;
			else 
				value = -1;
			return value;
		}
	}//end of edge class
	
	class EdgeGraph{

		List<Edge> edgeList = new ArrayList<Edge>();
		int noOfVertices;
		
		public int getNoOfVertices() {
			return noOfVertices;
		}

		public void setNoOfVertices(int noOfVertices) {
			this.noOfVertices = noOfVertices;
		}

		public List<Edge> getEdgeList() {
			return edgeList;
		}

		public void setEdgeList(List<Edge> edgeList) {
			this.edgeList = edgeList;
		}
		
		public void addEdge(Edge e){
			edgeList.add(e);
		}

	}//end of edgegraph class
	
	class UnionFindDS{
		int noOfVeritces;
		boolean[] vertBool;
		int[] id;
		int current=1;
		
		public UnionFindDS(int n){
			this.noOfVeritces = n;
			vertBool = new boolean[n];
			id = new int[n];
		}
		
		//returns true if both x and y belong to same tree
		public boolean find(int x, int y){
			boolean ret = false;
			if(vertBool[x]==true && vertBool[y]==true  && (id[x]==id[y])){
				 ret = true;
			}
			return ret;
		}
		
		public void union(int x, int y){
			if(find(x,y)==false){
				if(vertBool[x]==false && vertBool[y]==true){
					vertBool[x] = true;
					id[x] = id[y];
				}
				if(vertBool[x]==true && vertBool[y]==false){
					vertBool[y] = true;
					id[y] = id[x];
				}
				if(vertBool[x]==false && vertBool[y]==false){
					vertBool[x] = true;
					vertBool[y] = true;
					id[x] = current;
					id[y] = current;
					current++;
				}
				if(vertBool[x]==true && vertBool[y]==true){
					//converting all y ids to x
					for(int i=0;i<id.length;i++){
					   if(id[i]==id[y]){
						   id[i]=id[x];
					   }
					}
				}
			}
		}//end of union method
		
		public boolean isEdgeInMST(Edge e){
			//with unionfind DS we need find if there exists a loop in the graph
			int x = e.getX();
			int y = e.getY();
			if(find(x,y)==true)
				return false;
			union(x,y);
			return true;
		}
	}//end of unionfindDS class
	
	class KruskalAlgo{
		Kruskalmstrsub.EdgeGraph graph,MST;
		Kruskalmstrsub.UnionFindDS unionfind;
		
		public KruskalAlgo(Kruskalmstrsub.EdgeGraph graph){
			this.graph = graph;
			Kruskalmstrsub tmp = new Kruskalmstrsub();
			MST = tmp.new EdgeGraph();
			unionfind = tmp.new UnionFindDS(this.graph.getNoOfVertices());
		}
		public Kruskalmstrsub.EdgeGraph generateMST(){
			List<Edge> edgeList;
			edgeList = this.graph.edgeList;
			Collections.sort(edgeList);
			for(Edge e:edgeList){
				if(unionfind.isEdgeInMST(e)){
					MST.addEdge(e);
				}
				if(MST.getEdgeList().size()==graph.getNoOfVertices()-2)
					break;
			}
			return MST;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N,M,x,y,w;
		Kruskalmstrsub kruskal = new Kruskalmstrsub();
		Kruskalmstrsub.EdgeGraph graph = kruskal.new EdgeGraph();
		Kruskalmstrsub.Edge edge;
		String[] inputStr = reader.readLine().split(" ");
		N = Integer.parseInt(inputStr[0]);
		M = Integer.parseInt(inputStr[1]);
		graph.setNoOfVertices(N+1);
		for(int i=0;i<M;i++){
			inputStr = reader.readLine().split(" ");
			x = Integer.parseInt(inputStr[0]);
			y = Integer.parseInt(inputStr[1]);
			w = Integer.parseInt(inputStr[2]);
			edge = kruskal.new Edge(x,y,w);
			graph.addEdge(edge);
		}
		int finalVertex = Integer.parseInt(reader.readLine());
		Kruskalmstrsub.KruskalAlgo algo = kruskal.new KruskalAlgo(graph);
		Kruskalmstrsub.EdgeGraph MST = algo.generateMST();
		List<Edge> mstList = MST.getEdgeList();
		long sum=0;
		System.out.println("debug: printing eges of MST");
		for(Edge itr: mstList){
			System.out.print(itr.getX()+"("+itr.getW()+")"+itr.getY());
			System.out.println();
			sum+=itr.getW();
		}
		System.out.println(sum);
	}

}
