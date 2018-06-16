package CTCI.SortedArray.ToBST;

/**
 * Created by khush on 6/14/2018.
 */
public class Main
{
    public static void main(String args[]){
        int arr[]={0,1,2,3,4};
        SortedArrayToMinimalBST objBST = new SortedArrayToMinimalBST();
        TreeNode root = new TreeNode();
        root = objBST.sortedArrayToMinimalBST(arr);
        objBST.inOrderPrint(root);

    }
}
