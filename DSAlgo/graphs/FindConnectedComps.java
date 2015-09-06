package graphs;

import java.util.ArrayList;

//712 740
public class FindConnectedComps {
   GraphInterface graph;
   private int noOfConnectedComps;
   private int[] components;//to which component a particular graph node belongs
   private GraphNode[] parNode;
   //I don't think isVisible boolean array is necessary, we can use the components array to check whether a node had been traversed or not
   
   //542 600
   public FindConnectedComps(GraphInterface graph){
	   this.graph = graph;
	   this.noOfConnectedComps = 0;
	   this.components = new int[graph.getNoOfVertices()];
   }
   
   public int getNoOfConnectedComps(){
	   for(int i=0;i<this.components.length;i++){
		   if(components[i]==0){
			   //System.out.println("debug: node at index "+i+" is "+this.graph.getNodeAtIndex(i));
			   doBFS(this.graph.getNodeAtIndex(i));
		   }
	   }
	   return this.noOfConnectedComps;
   }
   
   public int getComponentIdOfNode(GraphNode node){
	   int id=-1;
	   int index = this.graph.getNodeIndex(node);
	   id = components[index];
	   return id;
   }
   
   private void doBFS(GraphNode a){
	   this.noOfConnectedComps++;
	   ArrayList<GraphNode> queue = new ArrayList<GraphNode>();
	   int index;
	   queue.add(a);
	   components[this.graph.getNodeIndex(a)]=this.noOfConnectedComps;
	   GraphNode node;
	   while(!queue.isEmpty()){
	     node = queue.remove(0);
		 for(GraphNode itr:node.getAdjList()){
	       index = this.graph.getNodeIndex(itr);
		   if(components[index]==0){
			   queue.add(itr);
			   components[index]=this.noOfConnectedComps;
		   }
	     }
	   }
   }
   
}
