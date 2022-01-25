package AlgoExpert_160_Questions.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    ///////// Solution using hashmap O(n):O(n)/////////
    public static int[] findTwoSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int req = target - arr[i];
            if(map.containsKey(req)) return new int[]{map.get(req),i};
            else map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }


    ///////// Solution using sorting O(nlog(n)):O(1)/////////
    public static int[] findTwoSumS(int[] arr, int target){
        Arrays.sort(arr);
        int s = 0; int e = arr.length-1;
       while(s<e){
           if(arr[s] + arr[e] < target) s++;
           else if(arr[s] + arr[e] > target) e--;
           else return new int[]{s,e};
       }
        return new int[]{-1,-1};
    }

    ///////// Solution using nested for-loop O(n^2):O(1)/////////
    public static int[] findTwoSumB(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
           for (int j = i; j< arr.length;j++)
               if(arr[i]+arr[j] == target) return new int[]{i,j};
        }
        return new int[]{-1,-1};
    }


    /////////////main function/////////////
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,4,5,6,9,12};
        var a = findTwoSumS(arr,3);
        for(int i: a) System.out.println(i);
    }
}
