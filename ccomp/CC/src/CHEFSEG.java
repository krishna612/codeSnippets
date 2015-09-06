import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CHEFSEG {
	public class Segment{
		double x;
		double y;
		double length;
		public Segment(double x, double y){
			this.x = x;
			this.y = y;
			this.length = this.y - this.x;
		}
	}
	
	public class Maxheap{
		Segment[] segArray;
		int currentIndex;
		public Maxheap(int k){
			segArray = new Segment[k];
		}
		public void insert(Segment segm){
			if(currentIndex==0){
				segArray[0] = segm;
				currentIndex++;
			}
			else{
				segArray[currentIndex] = segm;
			}
		}
		
		public Segment delete(){
			return segArray[0];
		}
		
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T=0;
		int k,d;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;i++){
			
		}
	}

}
