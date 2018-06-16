package question2.LargestInEachTreeRow.ebay;

import java.util.*;

/**
 * Created by khush on 5/29/2018.
 */
public class LargestInEachTreeRowBFS {

    public List<Integer> getLargestElementAtEachLevel (TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        int largest = Integer.MIN_VALUE;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){

            TreeNode tmp = q.poll();
            if(tmp!=null){
                largest = Math.max(largest, tmp.data);
                if(tmp.left!=null)
                    q.offer(tmp.left);
                if(tmp.right!=null)
                    q.offer(tmp.right);
            }

            else{
                result.add(largest);
                largest=Integer.MIN_VALUE;
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }

        }
        return result;
    }
}
