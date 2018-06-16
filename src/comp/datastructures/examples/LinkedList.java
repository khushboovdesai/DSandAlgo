package comp.datastructures.examples;

/**
 * Created by khush on 2/10/2018.
 */
public class LinkedList {

    Node head;

    public LinkedList(Node node){
        this.head=node;
    }

    public void insertNodeAtEndOfTheList(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        return;
    }

    public void insertNodeAtStartOfTheList(Node node){
        if(head==null){
            head=node;
        }
        else{
            //Node temp=head;
            node.next=head;
            head=node;
        }
        return;

    }

}
