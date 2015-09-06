package leetcode;
//705 740
public class ArRotateArray {
   
	public void rotate(int[] nums, int k) {
      k = k%nums.length;
      int tmp;
      for(int i=0;i<=k;i++){
    	  tmp = nums[(i+k)%nums.length];
    	  nums[(i+k)%nums.length] = nums[i];
    	  nums[(i+2*k)%nums.length] = tmp;
      }
    }
}
