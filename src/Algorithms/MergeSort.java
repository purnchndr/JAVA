package Algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end)  return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        mergeArrays(arr,start,mid,end);
    }

    private static void mergeArrays(int[] arr, int start, int mid, int end){
        int size1 = mid-start;
        int size2 = end-start-1;
        int[] tempArr1 = new int[size1];
        int[] tempArr2 = new int[size2];
        for (int i =start; i< size1; i++)
            tempArr1[i] = arr[i];
        for (int i =mid+1; i< size1; i++)
            tempArr2[i] = arr[i];
        int i = 0;
        int j = 0;
        int k = start;
        while(i < tempArr1.length && j < tempArr2.length)
            arr[k++] = tempArr1[i] < tempArr2[j] ? tempArr1[i++] : tempArr2[j++];
        while(i < tempArr1.length )
            arr[k++] = tempArr1[i++] ;
        while(j < tempArr2.length )
            arr[k++] = tempArr1[j++];

    }

    public static void main(String[] args) {
        int[] arr = {2,44,5,66,7,8,-1,7,90,1000};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
