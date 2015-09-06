import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//610 640 525 615
public class JourneyToMoon {
  
	class Graph{
	  int noOfVertices;
	  int[] compId;
	  int currentComp = 0;
	  Map<Integer,ArrayList<Integer>> adjMap;
	  
	  public Graph(int n){
		  this.noOfVertices = n;
		  adjMap = new HashMap<Integer,ArrayList<Integer>>(n);
		  for(int i=0;i<n;i++){
			  adjMap.put(i, new ArrayList<Integer>());
		  }
		  compId = new int[n];
	  }
	  
	  public void addEdge(int u, int v){
		  adjMap.get(u).add(v);
		  adjMap.get(v).add(u);
	  }
	  
	  public void DFS(int s){
		  compId[s] = currentComp;
		  for(Integer itr: adjMap.get(s)){
			  if(compId[itr]==0){
				  DFS(itr);
			  }
		  }
	  }
	  
	  public int countPartitionsPairSum(){
		  int pairSum = 0;
		  for(int i=0;i<this.noOfVertices;i++){
			  if(compId[i]==0){
				  currentComp++;
				  DFS(i);
			  }
		  }
		  Arrays.sort(compId);
		  int tmp = 1, i=1, count=1;
		  while(i<this.noOfVertices){
			if(compId[i]==tmp){
			   count++;	
			}
			else{
				tmp = compId[i];
				pairSum = pairSum+(count*(count-1))/2;
				count=1;
			}
			i++;
		  }
		  pairSum = pairSum+(count*(count-1))/2;
		  return pairSum;
	  }
    }
	
  public static void main(String[] args) throws IOException {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   int N,I,A,B;
	   String[] inputStr;
	   inputStr = reader.readLine().split(" ");
	   N = Integer.parseInt(inputStr[0]);
	   I = Integer.parseInt(inputStr[1]);
	   JourneyToMoon moon = new JourneyToMoon();
	   JourneyToMoon.Graph graph = moon.new Graph(N);
	   for(int i=0;i<I;i++){
		   inputStr = reader.readLine().split(" ");
		   A = Integer.parseInt(inputStr[0]);
		   B = Integer.parseInt(inputStr[1]);
		   graph.addEdge(A, B);
	   }
	   int answer = (N*(N-1)/2) - graph.countPartitionsPairSum();
	   System.out.println(answer);
  }
}
