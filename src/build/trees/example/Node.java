package build.trees.example;

/**
 * Created by khush on 2/23/2018.
 */
public class Node {
    int data;
    Node left,right;

    public Node(){
        this.data=0;
        left=right=null;
    }

    public Node(int data){
        this.data=data;
        left=right=null;
    }

}
