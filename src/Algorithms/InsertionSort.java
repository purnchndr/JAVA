package Algorithms;

import static Algorithms.Utility.print;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            int j = i;
            for (; j > 0; j--){
                if(arr[j-1] >curr)
                    arr[j] = arr[j-1];
                else break;
            }
            arr[j] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,8,1,0,-1,-50};
        print(arr);
        insertionSort(arr);
        print(arr);
    }
}
