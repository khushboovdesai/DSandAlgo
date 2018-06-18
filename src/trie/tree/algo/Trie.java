package trie.tree.algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by khush on 6/16/2018.
 */
public class Trie {

    public TrieNode root = null;
    public char prev;
    public TrieNode previous =null;

    public TrieNode buildTrie(String word){

        TrieNode tmp = root;

        for(int i=0; i<word.length(); i++){

            Character ch =  word.charAt(i);

            if(root==null){
                root = new TrieNode();
                root.children.put(ch, new TrieNode());
                previous=root;
                tmp = root;
                prev=ch;
            }
            else {

                if (tmp.children.containsKey(ch)) {
                    previous=tmp;
                    tmp = tmp.children.get(ch);
                    prev=ch;
                    continue;
                }
                else{
                        tmp = previous.children.get(prev);
                        if (!(i == word.length() - 1)) {
                            tmp.children.put(ch, new TrieNode());
                            previous = previous.children.get(prev);
                            prev=ch;
                        } else {
                            tmp.children.put(ch, new TrieNode());
                            tmp = tmp.children.get(ch);
                            tmp.endOfWord = true;
                        }
                    }
                }
            }

        System.out.println("Built the Trie!");

        return root;
    }

    public void printTrie(String word)
    {
       printTrie(word, this.root);
    }

    public void printTrie(String word, TrieNode root){
        TrieNode temp = root;
        for(int j=0; j <word.length(); j++){
            if(temp==null){
                break;
            }
            Map<Character, TrieNode> map = temp.children;
            Iterator<Map.Entry<Character, TrieNode>> entries = map.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry<Character, TrieNode> entry = entries.next();
                System.out.println("Key = " + entry.getKey());
            }
                temp = temp.children.get(word.charAt(j));
        }
    }
}

