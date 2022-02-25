package Recursion;

public class SortedArray {
    public static boolean isSorted(int[] array, int size){
        if(array == null)
            return false;
        if(size == array.length-1 || array.length < 2)
            return true;
        if(array[size] > array[size+1])
            return false;
        else
            return isSorted(array, size+1);
    }
}
