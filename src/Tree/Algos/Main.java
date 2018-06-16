package Tree.Algos;

/**
 * Created by khush on 5/29/2018.
 */
public class Main {

     static int a =0;

    public static void main(String args[]){

        TreeNode root =  new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println("This is a:"+ a);

        /*FindMaxNodeData obj0 = new FindMaxNodeData();
        obj0.getMaxNodeData(root);
        System.out.println("Maximum node data in binary tree is: " + FindMaxNodeData.largest);*/

        /*InsertInBinaryTree obj1 = new InsertInBinaryTree();
        obj1.insertInBinaryTreeLevelOrder(root, 33);
        System.out.println("Inserted node data in binary tree is at level: " + insertInBinaryTree.levelTraversed);
        System.out.println(root.data + " -> " + root.left.data + " -> " + root.right.data + " -> " + root.left.left.data +
                " -> " +  root.left.right.data + " -> " + root.right.left.data  );*/

    /*    InsertInBinaryTree obj2 = new InsertInBinaryTree();
        obj2.insertInBinTreeLevelOrderRecursive(root, 50);
        System.out.println("Inserted node data in binary tree is at level: " + InsertInBinaryTree.levelTraversed);
        System.out.println(root.data + " -> " + root.left.data + " -> " + root.right.data + " -> " + root.left.left.data +
                " -> " +  root.left.right.data + " -> " + root.right.left.data  );*/


        /*FindSizeOfBinaryTree obj3 = new FindSizeOfBinaryTree();
        int treeSize = obj3.sizeOfBinTree(root);
        System.out.println("Tree size is number of elements in tree: " + treeSize);*/

        /*FindSizeOfBinaryTree obj4 = new FindSizeOfBinaryTree();
        int treeSizeRec = obj4.sizeOfBinTreeRecursion(root);
        System.out.println("Tree size is number of elements in tree, using recursion: " + treeSizeRec);*/
/*
        DeleteTree obj5 = new DeleteTree();
        obj5.deleteTreeRecursion(root);*/

        PrintLvlOrderInReverse obj6 = new PrintLvlOrderInReverse();
        obj6.printLvlOrderInReverse(root);

    }
}
