package CTCI.SortedArray.ToBST;

/**
 * Created by khush on 6/14/2018.
 */
public class SortedArrayToMinimalBST {

    public TreeNode sortedArrayToMinimalBST(int arr[]){
        return sortedArrayToMinimalBST(arr, 0, arr.length-1);
    }

    private TreeNode sortedArrayToMinimalBST(int arr[], int start, int end){
        if(start>end){
            return null;
        }
        int mid = end-start/2;

        TreeNode root = new TreeNode(arr[mid]);
        root.left=sortedArrayToMinimalBST(arr, 0, mid-1);
        root.right=sortedArrayToMinimalBST(arr, mid+1, end);
        return root;
    }

    public void inOrderPrint(TreeNode root){
        if(root!=null){

            inOrderPrint(root.left);
            System.out.println(root.val);
            inOrderPrint(root.right);
        }

    }
}
