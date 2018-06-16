package Tree.Algos;

/**
 * Created by khush on 6/1/2018.
 */

/**delete using postorder => left, right, root**/
public class DeleteTree {

    public void deleteTreeRecursion(TreeNode root){
        if(root == null){
            return;
        }
        /* first delete both subtrees */
        deleteTreeRecursion(root.left);
        deleteTreeRecursion(root.right);

         /* then delete the node */
        System.out.println("The deleted node is " + root.data);
        root = null;

    }
}
