package Algorithms;

import static Algorithms.Utility.print;
import static Algorithms.Utility.swap;

public class QuickSort {

    private static void quickSortMain(int[] arr, int start, int end){

        if(start >= end)
            return;

        int partition = partition(arr,start,end);

        quickSortMain(arr,start,partition-1);

        quickSortMain(arr,partition+1, end);
    }

    public static void quickSort(int[] arr){

        quickSortMain(arr,0, arr.length-1);
    }

    private static int partition(int[] array, int start, int end){
       int pivot = array[start];

       int count = getSmallElementCount(array,start,end,pivot);

       int pivotIndex = start+count;

       swap(array,start,pivotIndex);

       shiftElements(array,start,end,pivotIndex);

       return pivotIndex;
    }

    private static int getSmallElementCount(int[] array, int start, int end, int current){

        int count = 0;

        for(int i = start; i<= end; i++)
            if(array[i] < current)
                count++;

        return count;
    }

    private static void shiftElements(int[] array, int start, int end, int pivotIndex){

        int pivot = array[pivotIndex];

        while(start < pivotIndex && end > pivotIndex){

            while(array[start] <= pivot)
                start++;

            while(array[end] > pivot)
                end--;

            if(start < pivotIndex && end > pivotIndex)
                swap(array,start++,end--);
        }
    }

}
