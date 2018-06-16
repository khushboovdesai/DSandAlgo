package CTCI.Graph.RouteBetween.Nodes;

/**
 * Created by khush on 6/14/2018.
 */
public class Node {
    public int val;
    public Node next;
    public boolean visited;

    public Node(){

    }
    public Node(int val){
        this.val=val;
        next=null;
        visited=false;
    }
}
