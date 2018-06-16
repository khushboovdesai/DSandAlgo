package build.trees.example;

/**
 * Created by khush on 2/23/2018.
 */
public class BinarySearchTree {
    Node root=null;
    Node temp=root;

    void insertChildren(Node node){
        if(this.root==null)
            this.root= node;
        else
            insertChildren(root,node);

    }
    void insertChildren(Node updated_root, Node node){
        if(updated_root==null){
            updated_root=node;
        }
        else{
            if(node.data<updated_root.data){
                insertChildren(updated_root.left,node);
            }
            else if(node.data>updated_root.data){
                insertChildren(updated_root.right,node);
            }
        }
    }
}
