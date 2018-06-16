package question2.LargestInEachTreeRow.ebay;

import java.util.*;

/**
 * Created by khush on 5/29/2018.
 */
public class Main {
    public static void main(String args[]){
        TreeNode root =  new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);


        LargestInEachTreeRowBFS obj = new LargestInEachTreeRowBFS();
       List<Integer> res = obj.getLargestElementAtEachLevel(root);

       for(int i=0; i<res.size();i++){
           System.out.println("Largest in row " + i + " is " + res.get(i) );
       }

    }
}
