package practise.linkedlist.example;

import java.util.IllegalFormatException;

/**
 * Created by khush on 2/23/2018.
 */
public class LinkedList {

    Node head=null;

    public LinkedList (Node node){
        this.head=node;
    }

    public void insertAtEnd(Node node){
       if(head==null){
           this.head=node;
       }
       else{
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=node;
       }
    }

    public void insertAtStart(Node node){
        if(head==null){
            this.head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }

    public void printLinkedList(){
        while(head.next!=null){
            System.out.print( head.data + "->" );
            head=head.next;
        }
        System.out.print( head.data + " -> nothing now :p " );
    }

    public void insertAtPosition(int position, Node node){
        Node temp=head;
        Node prev=null;
        for(int i=1;i<position;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=node;
        node.next=temp;
    }

    public void deleteNode(int position){
        Node temp=head;
        Node prev=null;
        try {
            for (int i = 1; i < position; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        catch(Exception e){

            System.out.println("Position doesn't exist in the LinkedList");
            System.out.println(e.getMessage());
        }
    }

    public void deleteNodeValue(int value) {
        Node temp = head;
        Node prev = null;
        try {
        while (temp.data != value && temp.next != null) {

                prev = temp;
                temp = temp.next;
        }

        prev.next = temp.next;
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void updateLinkedList(int oldValue,int newValue) {
        Node temp=head;
        while(temp.data!=oldValue && temp.next!=null ){
            temp=temp.next;
        }

        if(temp.next!=null)
             temp.data=newValue;

       else{
           System.out.println("Sorry! No such old value exists!!");
        }


    }




/*                    public void updateNode()*/


}
