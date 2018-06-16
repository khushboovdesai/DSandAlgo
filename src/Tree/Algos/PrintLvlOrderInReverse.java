package Tree.Algos;
import java.util.*;
/**
 * Created by khush on 6/1/2018.
 */
public class PrintLvlOrderInReverse {
    public void printLvlOrderInReverse(TreeNode root){
        Queue<TreeNode> q =new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.offer(root);
        while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            s.push(tmp.data);

            /*for reverse level output: print 4567,23,1*/
            if(tmp.right!=null){
                q.offer(tmp.right);
            }
            if(tmp.left!=null){
                q.offer(tmp.left);
            }

           /* *//*for reverse level output: print 7654,32,1*//*
            if(tmp.left!=null){
                q.offer(tmp.left);
            }
            if(tmp.right!=null){
                q.offer(tmp.right);
            }*/


        }

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
