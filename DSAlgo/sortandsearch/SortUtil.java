package sortandsearch;

public class SortUtil {
   
  public static boolean isLess(Comparable a, Comparable b){
	   boolean bool = false;
	   if(a.compareTo(b)<0)
		  bool = true;
	   return bool;
   }
  
  public static void print(Comparable[] a){
	  for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
	  }
	  System.out.println();
  }
   
}
