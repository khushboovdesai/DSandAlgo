package CTCI.createLL.fromBT.atEachDepth;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Created by khush on 6/14/2018.
 */
public class Main {

    public static void main(String args[]){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        a.left.left = d;
        a.left.right = e;
        a.right.left=f;
        a.right.right=g;

        BTtoLLAtEachDepth obj = new BTtoLLAtEachDepth();
        ArrayList<LinkedList<TreeNode>> arrayList = obj.createLevelLinkedlist(a);

        for(LinkedList l : arrayList){

           // System.out.println(arrayList.size());
            TreeNode node = (TreeNode) l.peek();
            while(node.next!=null){
                System.out.print(node.val+"->");
                node = node.next;
            }
            System.out.print(node.val);
            System.out.print(" ");

        }

    }
}
