package CTCI.createLL.fromBT.atEachDepth;

/**
 * Created by khush on 6/14/2018.
 */
public class TreeNode {
    public int val;
    public TreeNode left, right, next;

    public TreeNode(int val){
        this.val=val;
        left=right=null;
        next=null;
    }
}
