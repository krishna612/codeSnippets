package util;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//referred from http://www.cs.columbia.edu/~bert/courses/3137/hw3_files/GraphDraw.java
public class DrawDirectedGraph extends JFrame {
    int width;
    int height;

    ArrayList<Node> nodes;
    ArrayList<edge> edges;

    public DrawDirectedGraph() { //Constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	nodes = new ArrayList<Node>();
	edges = new ArrayList<edge>();
	width = 30;
	height = 30;
    }

    public DrawDirectedGraph(String name) { //Construct with label
	this.setTitle(name);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	nodes = new ArrayList<Node>();
	edges = new ArrayList<edge>();
	width = 30;
	height = 30;
    }

    class Node {
	int x, y;
	String name;
	
	public Node(String myName, int myX, int myY) {
	    x = myX;
	    y = myY;
	    name = myName;
	}
    }
    
    class edge {
	int i,j;
	
	public edge(int ii, int jj) {
	    i = ii;
	    j = jj;	    
	}
    }
    
    public void addNode(String name, int x, int y) { 
	//add a node at pixel (x,y)
	nodes.add(new Node(name,x,y));
	this.repaint();
    }
    public void addEdge(int i, int j) {
	//add an edge between nodes i and j
	edges.add(new edge(i,j));
	this.repaint();
    }
    
    public void paint(Graphics g) { // draw the nodes and edges
	FontMetrics f = g.getFontMetrics();
	int nodeHeight = Math.max(height, f.getHeight());

	g.setColor(Color.black);
	for (edge e : edges) {
		int x1 = nodes.get(e.i).x;
		int y1 = nodes.get(e.i).y;
		int x2 = nodes.get(e.j).x;
		int y2 = nodes.get(e.j).y;
	    g.drawLine(x1, y1, x2, y2);
//	    float m = (y2 -y1)/(x2-x1);
//	    float q = m/((m*m)+1);
//	    float xa1f = (float) ((-0.7*y1)+(0.5*y2)+(m*x1)+((x1+x2)/2*m)*(q));
//	    int xa1 = (int) xa1f;
//	    float ya1f = (float) (((1.2*y1)/m)+(0.5*m*(y1+y2))+(0.5*(x2-x1)));
//	    int ya1 = (int) ya1f;
//	    float xa2f = (float) ((-0.3*y1)+(0.5*y2)+(m*x1)+((x1+x2)/2*m)*(q));
//	    int xa2 = (int) xa2f;
//	    float ya2f = (float) (((0.8*y1)/m)+(0.5*m*(y1+y2))+(0.5*(x2-x1)));
//	    int ya2 = (int) ya2f;
//	    float xa3f = (float)(x1*0.7+x2*0.5);
//	    int xa3 = (int) xa3f;
//	    float ya3f = (float)(y1*0.5+y2*0.5);
//	    int ya3 = (int) ya3f;
	    
	    float xa1f = (float)(x1*0.5+x2*0.5);
	    int xa1 = (int) xa1f;
	    float ya1f = (float)(y1*0.5+y2*0.5);
	    int ya1 = (int) ya1f;
	    float xa2f = (float)(x1*0.52+x2*0.52);
	    int xa2 = (int) xa2f;
	    float ya2f = (float)(y1*0.52+y2*0.52);
	    int ya2 = (int) ya2f;
	    float xa3f = (float)(x2);
	    int xa3 = (int) xa3f;
	    float ya3f = (float)(y2);
	    int ya3 = (int) ya3f;
	    int[] xa = {xa1, xa2, xa3};
	    int[] ya = {ya1, ya2, ya3};
	    //System.out.println("debug poly");
	    g.drawPolygon(xa, ya, 3);
	    
	}

	for (Node n : nodes) {
	    int nodeWidth = Math.max(width, f.stringWidth(n.name)+width/2);
	    g.setColor(Color.white);
	    g.fillOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
		       nodeWidth, nodeHeight);
	    g.setColor(Color.black);
	    g.drawOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
		       nodeWidth, nodeHeight);
	    
	    g.drawString(n.name, n.x-f.stringWidth(n.name)/2,
			 n.y+f.getHeight()/2);
	}
    }
}