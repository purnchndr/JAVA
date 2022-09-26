package Algorithms;

public class BinarySearch {

    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] > target) end = mid-1;

            else if(array[mid] < target) start  = mid+1;

            else return mid;
        }
        return -1;
    }

    public static int binarySearchUpperBound(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] > target) end = mid-1;

            else if(array[mid] < target) start  = mid+1;

            else {
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }

    public static int binarySearchLowerBound(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] > target) end = mid-1;

            else if(array[mid] < target) start  = mid+1;

            else {
                index = mid;
                start = mid+1;
            }
        }
        return index;
    }

    public static int fixPoint(int[] array){
        int start = 0;
        int end = array.length-1;
        //int index = -1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] < mid) end = mid-1;

            else if(array[mid] > mid) start  = mid+1;

            else if(mid == array[mid])  return mid;
        }
        return -1;
    }

    public static int fixPointUpperBound(int[] array){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] < mid) end = mid-1;

            else if(array[mid] > mid) start  = mid+1;

            else if(mid == array[mid]){
                 index = mid;
                 end = mid-1;
            }
        }
        return index;
    }

    public static int fixPointLowerBound(int[] array){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while (start <= end){

            int mid = (start+end)/2;

            if(array[mid] < mid) end = mid-1;

            else if(array[mid] > mid) start  = mid+1;

            else if(mid == array[mid]){
                index = mid;
                start = mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7,8,9,10,10};
//        System.out.println(binarySearchLowerBound(arr,6));
//        System.out.println(binarySearchUpperBound(arr,6));
//        System.out.println(binarySearch(arr,6));
        System.out.println(fixPointUpperBound(arr));
        System.out.println(fixPointLowerBound(arr));
        System.out.println(fixPoint(arr));


    }
}
