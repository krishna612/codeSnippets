package mathandadhoc;
//given a permutation return the next lexiographic permutation
//
//Ex:next(32154)=32415   next(12345)=12354 next(32145)=32154 next(54321)=54321 next(12354)=12435
//ex: next(12)=next(21)

//612

public class FindNextPermutation {
    public StringBuilder findNext(StringBuilder s){
    	StringBuilder nextPerm=null;
    	int i = s.length()-1;
    	int max = (int)s.charAt(i);
    	boolean flag = false;
    	i--;
    	while(i>=0){
    		int current = (int)s.charAt(i);
    		if(current<max){
    			flag=true;
    			break;
    		}
    		else{
    			max = current;
    			i++;
    		}
    	}//after this invariant we must be knowing the index where we need to stop and replace that char with least bigger element
    	//after that next chars should be in ascending order.
    	if(flag==false){
    		nextPerm = s;
    	}
    	else{//find next bigger element than at index i
            		
    	}
    	return nextPerm;
    }
}
