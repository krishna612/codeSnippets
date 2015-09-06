import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;



//548 650 1100 1135 625 700 552 614
public class DijkstrashortreachUD {
	
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
		
		public int getOther(int s){
			int other = -1;
			if(s==x)
				other = y;
			else if(s==y)
				other = x;
			return other;
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
		
		public String toString(){
			return this.getX()+"("+this.getW()+")"+this.getY();
		}
	}//end of edge class
	
	class Graph{
		int noOfVertices;
		Map<Integer,ArrayList<Edge>> edgeMap;
		int[] distToSource;
		PriorityQueue heap;
		int largestValue = 2000000000;
		
	   class HeapComparator implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer)o1;
				i1 = distToSource[i1];
				Integer i2 = (Integer)o2;
				i2 = distToSource[i2];
				if(i1>i2)
					return 1;
				if(i1<i2)
					return -1;
				return 0;
			}
			
		}
	   
		
		public Graph(int n){
			this.noOfVertices = n;
			distToSource = new int[n];
			edgeMap = new HashMap<Integer,ArrayList<Edge>>(n);
			for(int i=0;i<n;i++){
				edgeMap.put(i, new ArrayList<Edge>());
			}
			heap = new PriorityQueue(n,new HeapComparator());
			for(int i=0;i<n;i++){
				distToSource[i] = largestValue;
			}
		}
		
		public void addEdge(Edge e){
			edgeMap.get(e.getX()).add(e);
			edgeMap.get(e.getY()).add(e);
		}
		
		public void insertToHeap(int v){
		     heap.add(v);	   
		}
		
		public int getHeapSize(){
			return heap.size();
		}
		
		public int removeMin(){
			return (int)heap.remove();
		}
		
		public void reorderHeap(int r){
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(this.getHeapSize()>0){
				int vertex = this.removeMin();
				if(vertex==r){
					this.insertToHeap(r);
					break;
				}
			}
			for(Integer i: list){
				this.insertToHeap(i);
			}
		}
		
		public void doDijsktraAlgo(int s){
			distToSource[s]=0;
			boolean[] isVertexCovered = new boolean[this.noOfVertices];
			boolean[] isPresentInHeap = new boolean[this.noOfVertices];
			int count=0;
			int min;
			//push all edge nodes adjascent to s to heap
			for(Edge e: edgeMap.get(s)){
				distToSource[e.getOther(s)] = e.getW();
				insertToHeap(e.getOther(s));
				isPresentInHeap[e.getOther(s)] = true;
			}
			while(getHeapSize()!=0 && count<=this.noOfVertices){
				min = this.removeMin();
				int other;
				isPresentInHeap[min] = false;
				count++;
				isVertexCovered[min] = true;
				for(Edge edge: edgeMap.get(min)){
					other = edge.getOther(min);
					if(distToSource[other]>distToSource[min]+edge.getW()){
						distToSource[other] = distToSource[min]+edge.getW();
						if(isPresentInHeap[other]==false){
					    	this.insertToHeap(other);
					    	isPresentInHeap[min] = true;
					    }
					    else{
					    	this.reorderHeap(other);
					    	isPresentInHeap[min] = true;
					    }
					
					}
					
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		DijkstrashortreachUD dijk = new DijkstrashortreachUD();
		int T,N,M,S,X,Y,W;
		String[] inputStr;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
		  inputStr = reader.readLine().split(" ");
		  N = Integer.parseInt(inputStr[0]);
		  M = Integer.parseInt(inputStr[1]);
		  DijkstrashortreachUD.Graph graph = dijk.new Graph(N);
		  for(int j=0;j<M;j++){
			  inputStr = reader.readLine().split(" ");
			  X = Integer.parseInt(inputStr[0]);
			  Y = Integer.parseInt(inputStr[1]);
			  W = Integer.parseInt(inputStr[2]);
			  graph.addEdge(dijk.new Edge(X-1,Y-1,W));
		  }
		  S = Integer.parseInt(reader.readLine());
		  graph.doDijsktraAlgo(S-1);
		  for(int k=0;k<N;k++){
			  if(k!=S-1)
			   System.out.print(graph.distToSource[k]+" ");
		  }
		  System.out.println();
		}
	}

}
