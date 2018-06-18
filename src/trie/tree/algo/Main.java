package trie.tree.algo;

/**
 * Created by khush on 6/16/2018.
 */
public class Main {
    public static void main(String args[]){

        Trie trie = new Trie();
        String word = new String("abcd");
        System.out.println( trie.buildTrie(word) );
        trie.printTrie(word);

        String word2 = new String("abgl");
        System.out.println( trie.buildTrie(word2) );
        trie.printTrie(word2);

        System.out.println("In Main now, Built Trie successfully!");
    }
}
