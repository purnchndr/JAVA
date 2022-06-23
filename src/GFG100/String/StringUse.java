package GFG100.String;

import java.util.Arrays;

public class StringUse {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int[] arr = new int[125];
        for(char c : str1.toCharArray()){
            arr[c]++;
        }
        for(char c : str2.toCharArray()){
            arr[c]--;
        }
        for(int i : arr){
            if(i > 0)
                return false;
        }
        return true;
    }

    public static int findLeftMost(String str){
        char[] c = str.toCharArray();
        int[] fre = new int[128];
        Arrays.fill(fre, -1);
        for (char ch : c){
            if(fre[ch] != -1){

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "Hello";
       String x = "lleoH";
        System.out.println(isAnagram("lfjdlfadfhad",""));

    }
}
