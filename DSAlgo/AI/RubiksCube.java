package AI;
//1130,1150 211,225
//solving this problem in step wise bases

public class RubiksCube {
	char[] topFace;
	char[] bottomFace;
	char[] frontFace;
	char[] backFace;
	char[] rightFace;
	char[] leftFace;
	
	public RubiksCube(char[] topFace, char[] bottomFace, char [] frontFace, char[] backFace, char[] rightFace, char[] leftFace){
		this.topFace = topFace;
		this.bottomFace = bottomFace;
		this.frontFace = frontFace;
		this.backFace = backFace;
		this.rightFace = rightFace;
		this.leftFace = leftFace;
	}
	
	public void prinCubeCurrentState(){
		System.out.println("TOP FACE: ");
		printFace(this.topFace);
		System.out.println("FRONT FACE: ");
		printFace(this.frontFace);
		System.out.println("LEFT FACE: ");
		printFace(this.leftFace);
		System.out.println("RIGHT FACE: ");
		printFace(this.rightFace);
		System.out.println("BACK FACE: ");
		printFace(this.backFace);
		System.out.println("BOTTOM FACE: ");
		printFace(this.bottomFace);
	}
	
	public void printFace(char[] face){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(face[i*j-1]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void topFaceClock(){
		topFace[0]=topFace[2];
		topFace[1]=topFace[5];
		topFace[2]=topFace[8];
		topFace[3]=topFace[1];
		topFace[4]=topFace[4];
		topFace[5]=topFace[7];
		topFace[6]=topFace[0];
		topFace[7]=topFace[3];
		topFace[8]=topFace[6];
		leftFace[0]=frontFace[0];
		leftFace[1]=frontFace[1];
		leftFace[2]=frontFace[2];
		frontFace[0]=rightFace[0];
		frontFace[1]=rightFace[1];
		frontFace[2]=rightFace[2];
		rightFace[0]=backFace[0];
		rightFace[1]=backFace[1];
		rightFace[2]=backFace[2];
		backFace[0]=leftFace[0];
		backFace[1]=leftFace[1];
		backFace[2]=leftFace[2];
	}
	
	public void topFaceAnti(){
		topFace[0]=topFace[6];
		topFace[1]=topFace[3];
		topFace[2]=topFace[0];
		topFace[3]=topFace[7];
		topFace[4]=topFace[4];
		topFace[5]=topFace[1];
		topFace[6]=topFace[8];
		topFace[7]=topFace[5];
		topFace[8]=topFace[2];
		leftFace[0]=backFace[0];
		leftFace[1]=backFace[1];
		leftFace[2]=backFace[2];
		frontFace[0]=leftFace[0];
		frontFace[1]=leftFace[1];
		frontFace[2]=leftFace[2];
		rightFace[0]=frontFace[0];
		rightFace[1]=frontFace[1];
		rightFace[2]=frontFace[2];
		backFace[0]=rightFace[0];
		backFace[1]=rightFace[1];
		backFace[2]=rightFace[2];
	}

}
