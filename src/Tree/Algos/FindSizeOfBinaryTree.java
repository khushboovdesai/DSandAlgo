package Tree.Algos;
import sun.reflect.generics.tree.Tree;

import java.util.*;
/**
 * Created by khush on 6/1/2018.
 */

/*SIZE of a binary tree is Number of elements in a tree*/
public class FindSizeOfBinaryTree {
    /*Iterative solution*/

    /*public int sizeOfBinTree(TreeNode root){
        int count = 0;

        if (root == null){
            return 0;
        }

        else{
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode tmp = q.poll();
                count++;
                if(tmp!=null){
                    if(tmp.left!=null){
                        q.offer(tmp.left);
                    }
                    if(tmp.right!=null){
                        q.offer(tmp.right);
                    }
                }
            }
        }
        return count;
    }*/

    /*Recursive solution*/
    public int sizeOfBinTreeRecursion(TreeNode root){
        int count=0;
        int leftCount = root.left == null? 0 : sizeOfBinTreeRecursion(root.left);
        int rightCount = root.right == null ? 0 : sizeOfBinTreeRecursion(root.right);
        int finalCount = leftCount+rightCount+1;
        return finalCount;
    }
}
