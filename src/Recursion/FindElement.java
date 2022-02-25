package Recursion;

public class FindElement {
    private static int findFirstElement(int[] array, int index, int value){
        if(array == null || array.length == index)
            return -1;
        if(array[index] == value)
            return index;
        return findFirstElement(array,index+1, value);
    }
    private static int findLastElement(int[] array, int index, int value){
        if(array == null || index == -1)
            return -1;
        if(array[index] == value)
            return index;
        return findLastElement(array,index-1, value);
    }
    public static int findLastElement(int[] array, int value){
        return findLastElement(array,array.length-1, value);
    }
    public static int findFirstElement(int[] array, int value){
        return findFirstElement(array,0, value);
    }
}
