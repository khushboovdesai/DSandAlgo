package Koddi;

/**
 * Created by khush on 5/14/2018.
 */

/*Given this array [2,4,1,3], reverse the array and echo out a string
that has each element separated by a colon in any language of your choice
(expected output: “3:1:4:2”).*/

public class Main {

    public static void main(String [] args){
        int [] arr = {2, 4, 1, 3};
        int arrLen = arr.length;
        StringBuilder outputStr =  new StringBuilder();

        //call the reverseArr method to reverse the input array
        int [] reversedArr = reverseArr(arr, arrLen);

        //Logic to achieve the desired output :- "3:1:4:2" for the given input array
        for(int i=0;i<arrLen-1;i++) {
            outputStr.append(arr[i] + ":");
        }
        outputStr.append(arr[arrLen-1]);

        //Print the expected result
        System.out.println("Expected Output String is:-");
        System.out.println(outputStr);
    }

    //Reverse Array Method
    public static int[] reverseArr(int[] arr, int arrLen) {
        for (int i = 0; i < arrLen / 2; i++) {
            int lastIndex = arrLen-1-i;

            //swap logic to reverse the given array
            int temp = arr[i];
            arr[i] = arr[lastIndex];
            arr[lastIndex]=temp;
        }
        return arr;
    }
}
