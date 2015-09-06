package advanceddatastructures;

import java.util.List;

public class TernarySearchTree {
	TSTNode root = null;
	
	public void insert(String key, String value){
		if(root==null){
		  TSTNode prev = null;
		  for(int i=0;i<key.length()-1;i++){
			  TSTNode itr = new TSTNode();
			  itr.setKey(key.charAt(i));
			  if(i==0){
				  root = itr;
				  prev = root;
			   }
			  else{
				  prev.setEqual(itr);
				  prev = itr;
			  }
		  }
		  TSTNode val = new TSTNode();
		  val.setKey(key.charAt(key.length()-1));
		  val.setValue(value);
		  prev.setEqual(val);
		}
		else{
			TSTNode itr = root;
			for(int i=0;i<key.length();){
				if(itr.getKey()==key.charAt(i)){
					itr = itr.getEqual();
					i++;
				}
				else if(itr.getKey()>key.charAt(i)){
					if(itr.getLeft()==null){
						TSTNode node = new TSTNode();
						node.setKey(key.charAt(i));
						itr.setLeft(node);
					}
				}
			}
		}
	}
	
	public boolean isWordPresent(String key){
		return false;
	}
	
	public String getWord(String key){
		
		TSTNode itr = root;
		for(int i=0;i<key.length()-1;){
			if(itr.getKey()==key.charAt(i)){
				itr = itr.getEqual();
				i++;
			}
			else if(itr.getKey()>key.charAt(i)){
				itr = itr.getLeft();
			}
			else{
				itr = itr.getRight();
			}
		}
		return itr.getValue();
	}
	
	public List<String> getMatchingWords(String prefix){
		List<String> list = null;
		return list;
	}

}
