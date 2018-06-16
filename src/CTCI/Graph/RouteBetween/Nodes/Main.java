package CTCI.Graph.RouteBetween.Nodes;

/**
 * Created by khush on 6/14/2018.
 */
public class Main {
    public static void main(String args[]){

        System.out.println("Hey hey!!");
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        Node h = new Node(6);
        Node i = new Node(7);
        Node j = new Node(8);

        Graph g = new Graph();
        g.addNode(a);
        g.addNode(b);
        g.addNode(c);
        g.addNode(d);
        g.addNode(e);
        g.addNode(f);
        g.addNode(j);
        g.addNode(h);
        g.addNode(i);


        g.addEdge(a, d); //a->d
        g.addEdge(a, b); //a->b->d
        g.addEdge(b, c); //b->c
        g.addEdge(d, d); //d->d
        g.addEdge(a, a);
        System.out.println("end..");

        System.out.println(g.BFSpathBetweenNodes(a, a));

    }
}
