package trie.tree.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by khush on 6/16/2018.
 */
public class TrieNode {

    public Map<Character, TrieNode> children;
    public Boolean endOfWord;

    public TrieNode(){
        children = new HashMap<>();
        endOfWord = false;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public Boolean getEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(Boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
