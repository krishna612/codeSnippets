package leetcode;

import leetcode.ListReverse.ListNode;
//620 650
//running time: 428ms
public class ListIntersect {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode commonNode = null;
        if(headA==null || headB==null) return commonNode;
        int lengthA=0,lengthB=0,dif=0;
        ListNode tmp = headA;
        while(tmp!=null){
        	tmp = tmp.next;
        	lengthA++;
        }
        tmp = headB;
        while(tmp!=null){
        	tmp = tmp.next;
        	lengthB++;
        }
        if(lengthA>lengthB){
          	dif = lengthA-lengthB;
          	while(dif>0){
          		headA = headA.next;
          		dif--;
          	}
        }
        else if(lengthB>lengthA){
        	dif = lengthB-lengthA;
          	while(dif>0){
          		headB = headB.next;
          		dif--;
          	}
        }
        
        while(headA!=null && headB!=null){
        	if(headA == headB){
        		commonNode = headA;
        		break;
        	}
        	headA = headA.next;
        	headB = headB.next;
        }
        return commonNode;
    }

}
