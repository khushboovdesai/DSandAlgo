package comp.datastructures.examples;

/**
 * Created by khush on 2/10/2018.
 */
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
