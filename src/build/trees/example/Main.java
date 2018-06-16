package build.trees.example;

/**
 * Created by khush on 2/23/2018.
 */
public class Main {
    public static void main(String args[]){
        Node node0 = new Node(8);
        BinarySearchTree bst=new BinarySearchTree();

        Node node1 = new Node(6);
        Node node2 = new Node(12);
        Node node3 = new Node(4);
        Node node4 = new Node(7);
        Node node5= new Node(11);

        bst.insertChildren(node0);
        bst.insertChildren(node1);
        bst.insertChildren(node2);
        bst.insertChildren(node3);
        bst.insertChildren(node4);
        bst.insertChildren(node5);

    }
}
