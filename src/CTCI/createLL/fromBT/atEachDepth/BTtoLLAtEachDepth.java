package CTCI.createLL.fromBT.atEachDepth;

import java.util.*;

/**
 * Created by khush on 6/14/2018.
 */
public class BTtoLLAtEachDepth {



    public ArrayList<LinkedList<TreeNode>> createLevelLinkedlist(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current = new LinkedList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp != null) {

                tmp.next = q.peek();
                current.addLast(tmp);
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }
                if (tmp.right != null) {
                    q.offer(tmp.right);
                }
            } else {

                LinkedList<TreeNode> finalList = new LinkedList<TreeNode>();

                System.out.println("Current size"+current.size());

                finalList.addAll(current);
                System.out.println("FinalList ni size"+finalList.size());

                result.add(finalList);
                System.out.println("Result ni size"+result.size());

                current.clear();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return result;
    }



/*public void createLevelLinkedlist(TreeNode root){
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
          TreeNode tmp = q.poll();
          if(tmp!=null){
              tmp.next = q.peek();

              printLL(tmp);
              System.out.println();

              if(tmp.left!=null)
                  q.offer(tmp.left);

              if(tmp.right!=null)
                  q.offer(tmp.right);
          }
          else if(!q.isEmpty())
              q.offer(null);
        }


    }

public void printLL(TreeNode tmp){
    while(tmp!=null){
        System.out.print(tmp.val + "->");
        tmp=tmp.next;
    }*/








}




