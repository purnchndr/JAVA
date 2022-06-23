package GFG100.HashMap;

import java.util.HashSet;

public class HashSetUse {
    public static int countDistinct(){
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {15,12,13,12,13,13,18};
        int count = 0;
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);
                count++;

            }
        }
        System.out.println(count);
        return count;
    }
    public static int countDistinctBF(){
        int[] arr = {15,12,13,12,13,13,18};
        int count = 0;
        for (int i =0; i< arr.length; i++){
            boolean flag = false;
            for (int j = i-1; j>=0; j--){
                if (arr[j] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                count++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countDistinctBF();
    }
}
