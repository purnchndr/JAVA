package Algorithms;


import static Algorithms.Utility.print;

public class Main {
    public static void main(String[] args) {

        int[] arr= {100,-1,88,7,-1000};
        print(arr);
        QuickSort.quickSort(arr);
        //quickSort(arr,0,4);
        print(arr);
    }
}
