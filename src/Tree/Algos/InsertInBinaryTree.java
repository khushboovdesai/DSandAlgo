
package Tree.Algos;
import sun.reflect.generics.tree.Tree;

import java.util.*;
/**
 * Created by khush on 6/1/2018.
 */
public class InsertInBinaryTree {
    /*Iterative solution*/
    /*public TreeNode insertInBinaryTreeLevelOrder (TreeNode root, int data){
        // int levelTraversed = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            TreeNode tmp = q.poll();

            if(tmp!=null){
                if(tmp.left!=null){
                    q.offer(tmp.left);
                }
                else{
                    tmp.left = new TreeNode(data);
                    levelTraversed++;
                    return root;
                }
                if(tmp.right!=null){
                    q.offer(tmp.right);
                }
                else{
                    tmp.right = new TreeNode(data);
                    levelTraversed++;
                    return root;
                }
            }
            else{
                levelTraversed++;
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        return root;
    }*/
    static int levelTraversed = 0;

    /*Recursive approach*/
    public void insertInBinTreeLevelOrderRecursive(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }
        else{
            insertHelper(root, data);
        }
    }

    private void insertHelper(TreeNode root, int data){
        if(root.left==null){
            root.left = new TreeNode(data);
            levelTraversed++;
        }
        else{
            insertHelper(root.right, data);
        }

        if(root.right==null){
            root.right = new TreeNode(data);
        }
        else{
            insertHelper(root.left, data);
        }
    }

}
