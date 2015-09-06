package advanceddatastructures;

public class TrieDSTest {
	private static char ch;
  public static void main(String[] args) {
	  TrieDS trie = new TrieDS();
	  trie.insert("elusive", "escape");
	  trie.insert("charming","attractive");
	  trie.insert("an", "used for emphasizing objects");
	  trie.insert("rivalty", "opponentship");
	  trie.insert("rival", "opponent");
	  trie.insert("ant", "a creature");
	  trie.insert("an", "used for emphasizing objects,modified");
	  System.out.println("meaning of rival: "+trie.getMeaning("rival"));
	  System.out.println("meaning of an: "+trie.getMeaning("an"));
	  System.out.println("meaning of ant: "+trie.getMeaning("ant"));
	  System.out.println("meaning of rivalty: "+trie.getMeaning("rivalty"));
 }
}
