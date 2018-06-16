package comp.datastructures.examples;

/**
 * Created by khush on 2/16/2018.
 */
public class BubbleSort
{
    public void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sorting looks like:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
