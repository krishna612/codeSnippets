import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class QuickSort1Partition {
	static int[] input;
	public static void print(){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = 0;
		String[] inputStr;
		N = Integer.parseInt(reader.readLine().trim());
		inputStr = reader.readLine().split(" ");
		input = new int[N];
		for(int i=0;i<N;i++){
			input[i] = Integer.parseInt(inputStr[i]);
		}
		int pivot = 0,leftPointer = 1, rightPointer = N-1;
		int tmp = 0;
		while(leftPointer<rightPointer){
			while(leftPointer<N&&input[pivot]>input[leftPointer])
				leftPointer++;
			while(rightPointer>0&&input[pivot]<input[rightPointer])
				rightPointer--;
			if(leftPointer<rightPointer){
				tmp = input[leftPointer];
				input[leftPointer] = input[rightPointer];
				input[rightPointer] = tmp;
			}
			else{
				tmp = input[pivot];
				input[pivot] = input[rightPointer];
				input[rightPointer] = tmp;
			}
		}
		print();
		
	}

}
