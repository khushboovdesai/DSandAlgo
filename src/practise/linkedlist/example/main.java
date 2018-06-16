package practise.linkedlist.example;

/**
 * Created by khush on 2/23/2018.
 */
public class main
{
    public static void main(String args[]){

        Node node1 = new Node(10);
        Node node2 = new Node (20);
        Node node3 = new Node (40);
        Node node4 = new Node (60);
        Node node5 = new Node (10);

        LinkedList linkedlist= new LinkedList(node1);
       // LinkedList linkedlist= new LinkedList();

        //linkedlist.insertAtEnd(node1);
        linkedlist.insertAtEnd(node2);
        linkedlist.insertAtEnd(node3);
        linkedlist.insertAtEnd(node4);

        linkedlist.insertAtPosition(3, node5);
      //  linkedlist.deleteNode(3);
      //  linkedlist.deleteNodeValue(60);

       // linkedlist.deleteNode(4);
       // linkedlist.deleteNodeValue(60);
        linkedlist.updateLinkedList(70,55);
        linkedlist.printLinkedList();
    }
}
