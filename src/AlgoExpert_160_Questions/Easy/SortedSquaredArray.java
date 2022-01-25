package AlgoExpert_160_Questions.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquaredArray {

    ///////////////O(n) O(n) Sliding Window/////////////////
    public static int[] square(int[] arr){
        int n = arr.length, start = 0, end = n-1,count = end;
        int[] res = new int[n];
        while(start <= end){
            int left = getAbs(arr[start]);
            int right = getAbs(arr[end]);
            if(left <= right) {
                res[count--] = right;
                end--;
            }
            else if(left > right || left == right ) {
                res[count--] = left;
                start++;
            }
        }
        return res;
    }

    ///////////////bruteforce////
    public static int[] squareB(int[] arr){
    int[] res = new int[arr.length];
    for(int i = 0; i< arr.length; i++){
        res[i] = arr[i]*arr[i];
    }
        Arrays.sort(res);
        return res;
    }

    private static int getAbs(int i) {
        if(i < 0) i *= -1;
        return i*i;
    }

    public static void main(String[] args) {
        int [] arr = {-10,-8,-3,1,4,6,9};
        var a = squareB(arr);
        for(int i: a) System.out.println(i);

    }
}
