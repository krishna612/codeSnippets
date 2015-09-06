package epi;
//623 645
//arranges three different ball colors in order which is equivalent to sorting with O(n) time complexity and O(1) space complexity
public class Epi601DutchNationalFlag {
	
	public int[] arrangeColors(int[] colors, int middle){
		int middlePointer=0,leftPointer=0,rightPointer = colors.length-1;
		while(middlePointer<rightPointer){
			int tmp;
			if(colors[middlePointer]<middle){
				//swap elements, increment both left and middle pointers
				tmp = colors[middlePointer];
				colors[middlePointer] = colors[leftPointer];
				colors[leftPointer] = tmp;
				middlePointer++;
				leftPointer++;
			}
			else if(colors[middlePointer]>middle){
				//swap elements, decrement right pointer
				tmp = colors[middlePointer];
				colors[middlePointer] = colors[rightPointer];
				colors[rightPointer] = tmp;
				rightPointer--;
			}
			else{
				//increment white pointer
				middlePointer++;
			}
		}
		return colors;
	}
	
	public static void main(String[] args) {
		
	}

}
