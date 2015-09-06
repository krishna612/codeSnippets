package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//916,936.
public class FindPathInMazeTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<GraphNode> list;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] maze;
		FindPathInMaze pathInMaze = new FindPathInMaze();	
		String[] inputStr;
		System.out.println("enter no of rows and coloumns in the maze, both must be same for now");
		int n = Integer.parseInt(reader.readLine());
		System.out.println("enter row by row where each element has to be 0 or 1");
		maze = new boolean[n][n];
		for(int i=0;i<n;i++){
			inputStr = reader.readLine().split(" ");
			for(int j=0;j<n;j++){
				if(Integer.parseInt(inputStr[j])==0){
					maze[i][j]=false;
				}
				else{
					maze[i][j]=true;
				}
			}
		}
		pathInMaze.buildGraphFromMaze(n, maze);
		list = pathInMaze.findPath();
		System.out.println("list size: "+list.size());
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).getDataNode()+"->");
		}
	}

}
