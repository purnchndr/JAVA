package Recursion;
import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int[] arr,int s, int e){
        if(s>=e)
            return;
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }

    private static void merge(int[] arr, int s, int e) {
        int mid = (s+e)/2;
        int[] temp = new int[e-s+1];
        int count =0;
       for(int i =s; i<=e;i++)
           temp[count++] = arr[i];
       int i = s;
       int j = mid+1;
       while (i<= mid && j <= e){

       }
    }

    public static void main(String[] args) {
        int[] arr = {5,8,9,12,15-2,-1};
        mergeSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}
