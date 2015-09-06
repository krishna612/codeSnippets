package advanceddatastructures;

//1024
public class TrieNode {
   private char key;
   private String value;
   private TrieNode[] links = new TrieNode[26];
   
   
    public char getKey() {
		return key;
	}
	public void setKey(char key) {
		if((int)this.key==0)
		  this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public TrieNode getLinkAtIndex(int index) {
		return links[index];
	}
	public void setLinkAtIndex(int index, TrieNode node) {
		if(this.links[index]==null)
		    this.links[index] = node;
	}
}
