package question1.SumOfRightLeaves.ebay;

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

        int sum = SumOfRightLeaves(root);
        System.out.println("sum of right leaves is: " + sum);
    }

    static int sum;

public static int SumOfRightLeaves(TreeNode root) {

    TreeNode tmp = root;
    if (tmp == null) {
        return 0;
    }
    else {
        if(tmp.right!=null) {
            if (tmp.right.left == null && tmp.right.right == null) {
                sum += tmp.right.data;
            }
        }
    }

    SumOfRightLeaves(tmp.left);
    SumOfRightLeaves(tmp.right);

    return sum;
    }

}

