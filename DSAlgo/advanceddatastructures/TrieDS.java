package advanceddatastructures;
//646 657
//we will insert data as and when needed, otherwise its a waste of space.
public class TrieDS {
   TrieNode root;
   
   public TrieDS(){
	   this.root = new TrieNode();
	   //System.out.println(this.root);
	   this.root.setKey('.');
   }
   
   public void insert(String word,String meaning){
	       //System.out.println(this.root);
		   TrieNode tmp = this.root;
		   int index;
		   for(int i=0;i<word.length();i++){
			   index = (int)word.charAt(i)-97;
			   //System.out.println("debug: i: "+i+"tmp: "+tmp);
			   tmp.setLinkAtIndex(index, new TrieNode());
			   tmp.getLinkAtIndex(index).setKey(word.charAt(i));
			   if(i==word.length()-1){
				   tmp.getLinkAtIndex(index).setValue(meaning);
				   //System.out.println("debug: key,"+tmp.getLinkAtIndex(index).getKey()+" value: "+tmp.getLinkAtIndex(index).getValue());
				   break;
			   }
			   tmp = tmp.getLinkAtIndex(index);
		   }
	   
   }
   
   public String getMeaning(String word){
	   String meaning = null;
	   TrieNode tmp = this.root;
	   int index=0;
	   for(int i=0;i<word.length();i++){
		   index = (int)word.charAt(i)-97;
		   //System.out.println("debug: "+tmp.getKey());
		   tmp = tmp.getLinkAtIndex(index);
	   }
	   //System.out.println("debug: "+tmp.getKey());
	   meaning = tmp.getValue();
	   return meaning;
   }
}
