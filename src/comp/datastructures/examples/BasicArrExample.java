package comp.datastructures.examples;

/**
 * Created by khush on 2/15/2018.
 */
public class BasicArrExample {

    public static void main(String args[]){
        int arr[]= new int[]{20,10,40,10,30,5,1,14,12,11};

        SelectionSort obj1 = new SelectionSort();
        obj1.selectionSort(arr);

        BubbleSort obj2 = new BubbleSort();
        obj2.bubbleSort(arr);
    }
}
