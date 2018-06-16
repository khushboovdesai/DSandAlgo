package Tree.Algos;

/**
 * Created by khush on 5/29/2018.
 */
public class FindMaxNodeData {
    static int largest = Integer.MIN_VALUE;
    public void getMaxNodeData(TreeNode root){
        preOrder(root);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        largest = Math.max(largest, root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

}

