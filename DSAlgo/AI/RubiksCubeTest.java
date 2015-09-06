package AI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RubiksCubeTest {
	public static void main(String[] args) throws IOException {
		System.out.println("enter rubiks cube initial configuration: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter top face as a 9 char string with bigletters like W for white etc..");
		char[] topFace = reader.readLine().toCharArray();
		System.out.println("enter front face: ");
		char[] frontFace = reader.readLine().toCharArray();
		System.out.println("enter left face: ");
		char[] leftFace = reader.readLine().toCharArray();
		System.out.println("enter right face: ");
		char[] rightFace = reader.readLine().toCharArray();
		System.out.println("enter back face: ");
		char[] backFace = reader.readLine().toCharArray();
		System.out.println("enter bottom face: ");
		char[] bottomFace = reader.readLine().toCharArray();
		RubiksCube cube = new RubiksCube(topFace,bottomFace,frontFace,backFace,rightFace,leftFace);
		cube.prinCubeCurrentState();
	}

}
