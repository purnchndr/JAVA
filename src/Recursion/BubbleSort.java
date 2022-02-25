package Recursion;

public class BubbleSort {
    static int count = 0;
    public static void bubbleSort(int[] arr , int si, int li){
        if(arr == null||li == 0)
            return;
        if(si == li){
            count++;
         bubbleSort(arr,0,--li);
         return;
        }
        if(arr[si] > arr[li]){
            int temp = arr[si];
            arr[si] = arr[li];
            arr[li] = temp;
        }
        count++;
        bubbleSort(arr,++si,li);
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        if(n < 1) return;
        bubbleSort(arr,0,n);
    }
    public static void print(int[] a){
    for (int i : a) System.out.print(i +" ");
    System.out.println();
    }

  public static void main(String[] args) {
    int[] arr = new int[100] ;
    for (int i =0 ; i< 100; i++)
        arr[i] = i;
    print(arr);
    bubbleSort(arr);
    print(arr);
    System.out.println(count);
  }
}
