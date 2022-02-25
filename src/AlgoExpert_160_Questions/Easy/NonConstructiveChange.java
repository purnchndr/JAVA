package AlgoExpert_160_Questions.Easy;

import java.util.Arrays;

public class NonConstructiveChange {
    public static int findNCC(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for(int i: arr){
            if(count+1 < i) return count+1;
            count += i;
        }
       return count+1;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,4,9};
        System.out.println(findNCC(a));
    }
}
