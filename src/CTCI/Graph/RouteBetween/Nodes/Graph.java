package CTCI.Graph.RouteBetween.Nodes;
import java.util.*;
/**
 * Created by khush on 6/14/2018.
 */
public class Graph {
    private ArrayList<Node> nodeArr = new ArrayList<>();
    ArrayList<Node> nodeList = new ArrayList<>();
    //Queue<Node> nodeList = new LinkedList<>();


    public Graph(){

    }

    public void addNode(Node input){
        nodeArr.add(input);
    }

    /*public Graph(Node n){
        nodeArr.add(n);
    }*/

    public void insertAtBeginning(Node a, Node b){
        Node head = a;
        Node temp = head.next;
        head.next = b;
        b.next=temp;
    }

    public void addEdge(Node a, Node b){
        if (b!=null && a.next==null){
            a.next=b;
        }
        else if(b!=null && a.next!=null){
            insertAtBeginning(a, b);
        }
    }

    public boolean BFSpathBetweenNodes(Node start, Node end){


        start.visited=true;
        Queue<Node> q = new LinkedList<>();
        q.offer(start);

        while(!q.isEmpty()){  //while q is not empty, keep checking the adjacent nodes inserted inside queue

            Node tmp = q.poll();

            System.out.println("in 1st while..");

            if(tmp.visited){
                System.out.println("tmp is visited!");
                if(tmp.next!=null){
                    System.out.println("tmp next is not null!");
                    if(tmp.next == end)
                        System.out.println("tmp next = end for a->a check..");
                    return true;
                }
            }


            while(tmp.next!=null && !tmp.visited){

                System.out.println("in 2nd while !!! ");

                if(tmp.next==end){
                    System.out.println("matches path so returning true..");
                    return true;
                }
                else{
                    System.out.println("in else here..");
                    tmp=tmp.next;

                        System.out.println("if not visited then mark visited and add to queue");
                        tmp.visited=true;
                        q.offer(tmp);

                }
            }
        }
        System.out.println("no adj node so returning false!!");
        return false;
    }
}
