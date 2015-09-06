package leetcode;

import java.util.ArrayList;
import java.util.List;
//612 650
//running time: 264ms
public class ArSummaryRange {
	
    public List<String> summaryRanges(int[] nums) {
          List<String> list = new ArrayList<String>();  
          if(nums.length==0) return list;
          int start = nums[0];
          int end = start;
          if(nums.length==1) {list.add(Integer.toString(start)); return list;}
          for(int i=1;i<nums.length;i++){
        	  if(nums[i]-end==1){
        		  end = nums[i];
        		  if(i==nums.length-1){
        			  if(start==end){
            			  list.add(Integer.toString(start));
            		  }
            		  else{
            			  list.add(Integer.toString(start)+"->"+Integer.toString(end));
            		  }
        		  }
        	  }
        	  else{
        		  if(start==end){
        			  list.add(Integer.toString(start));
        		  }
        		  else{
        			  list.add(Integer.toString(start)+"->"+Integer.toString(end));
        		  }
        		  start = nums[i];
        		  end = nums[i];
        		  if(i==nums.length-1){
        			  list.add(Integer.toString(start));
        		  }
        	  }
          }
          return list;
    }

}
