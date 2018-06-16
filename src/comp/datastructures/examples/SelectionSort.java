package comp.datastructures.examples;

/**
 * Created by khush on 2/15/2018.
 */

public class SelectionSort {
    //O(n^2)
    public void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int min = arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                }
            }
        }
        System.out.print("array selection sorted looks like:" );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

}
