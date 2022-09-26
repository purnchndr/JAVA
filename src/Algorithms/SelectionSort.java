package Algorithms;


import static Algorithms.Utility.print;
import static Algorithms.Utility.swap;

public class SelectionSort {
    //////////*********SELECTION SORT**********//////////
    //Algorithm
    //Traverse the whole array one by one
    // for Ith index find the minimum element in array after I
    //Swap the Ith position to minimum element position

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int index = i;
            for (int j = i+1 ; j < n ; j++)
                index = arr[index] > arr[ j] ? j : index;
            swap(arr, i, index);
        }
    }



    public static void main(String[] args) {
        int[] arr = {7,8,1,0,-1,-50};
        print(arr);
        selectionSort(arr);
        print(arr);
    }
}
