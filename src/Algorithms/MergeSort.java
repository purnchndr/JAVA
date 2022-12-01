package Algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end){
        if(start == end)
            return;
        int mid = start+(end-start)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        mergeArrays(arr,start,end);
    }

    private static void mergeArrays(int[] arr, int start, int end){

        int size = end-start+1;
        int index= 0;
        int mid = (start+end)/2;

        int[] tempArr = new int[size];

        int i = start , j = mid+1;

        while(i<= mid && j <= end)
            tempArr[index++] = arr[i] < arr[j] ? arr[i++] : arr[j++];

        while(i <= mid )
            tempArr[index++] = arr[i++] ;

        while(j <= end )
            tempArr[index++] = arr[j++];

        for(int item : tempArr)
            arr[start++] = item;

    }



    public static void main(String[] args) {
        int[] arr = {2,4,5,6,-1,100,-1999};
       // int[] arr2 = {9,14,55};
        mergeSort(arr,0,arr.length-1);
        //mergeArrays(arr,0, 6);
        //var a = mergeTwoSortedArray(arr,arr2);
        System.out.println(Arrays.toString(arr));
    }
}
