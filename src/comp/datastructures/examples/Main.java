package comp.datastructures.examples;

/**
 * Created by khush on 2/10/2018.
 */
public class Main {

    public static void main(String args[]){

        Node node = new Node(10);

        LinkedList linkedList = new LinkedList(node);

        Node array[] = new Node[10];

        for(int i=0;i<10;i++){
           array[i]=new Node(i);
        }

        for(int i=0;i<10;i++){
            linkedList.insertNodeAtEndOfTheList(array[i]);
        }
    }
}
