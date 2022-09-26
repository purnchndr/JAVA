package Algorithms;

import static Algorithms.Utility.print;
import static Algorithms.Utility.swap;

public class BubbleSort {

    //////////*********Bubble SORT**********//////////
    //Algorithm
    //Traverse the whole array one by one
    // for every index compare Ith index to I+1th index
    //If Ith is greater than Ith+1 the swap them
    //now my last Ith elements are sorted
    static int count = 0;
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean alreadySorted;
        for (int i = 0; i < n-1; i++){
            alreadySorted  = true;
            for (int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                    alreadySorted = false;
                }
                count++;
            }
            if(alreadySorted) break;
        }
    }

    public static void main(String[] args) {
        //int[] arr = {7,8,1,0,-1,-50};
        int[] arr = {10,1,2,3,4,5,6,7,8,9};
        print(arr);
        bubbleSort(arr);
        print(arr);
        System.out.println(count);
    }
}
