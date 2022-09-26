package Algorithms;

public class Utility {
    public static void swap(int[] array, int index, int targetIndex){
        int temp = array[index];
        array[index] = array[targetIndex];
        array[targetIndex] = temp;
    }

    public static void print(int[] a){
        for (int i : a) System.out.print(i +" ");
        System.out.println();
    }
}
