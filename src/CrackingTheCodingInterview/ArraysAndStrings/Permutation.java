package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.Arrays;
import java.util.Locale;

public class Permutation {

    ////optimal solution
    public static boolean check(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int counter = str2.length()-1;
        str1 = toLowerCase(str1);
        str2 = toLowerCase(str2);
        for(int i = 0; i< str1.length();i++) {
            if (str1.charAt(i) != str2.charAt(counter--))
                return false;
        }
        return true;
    }
    public static boolean checkP(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int[] arr = new int[128];
        char[] ch = str2.toCharArray();
        for(char c : ch){
            arr[c]++;
        }
        for(int i = 0; i< str2.length();i++){
            int j = (int) str2.charAt(i);
            arr[j]--;
            if(arr[j] < 0){
                return false;
            }
        }
        return true;
    }
    private static String sort(String str){
        char[] string = str.toCharArray();
        java.util.Arrays.sort(string);
        return new String(string);
    }

    public static boolean check3(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        return sort(str1).equals(sort(str2));
    }

    public static String toLowerCase(String str){
        char[] c = str.toCharArray();
       for(int i = 0; i< c.length;i++){
           int n= (int)c[i];
           if(n < 91 && n> 64){
               c[i] = (char) (((int)c[i])+32);
           }
       }
      return new String(c);
    }

  public static void main(String[] args) {
    System.out.println(check("ramA", "amasR"));

    //System.out.println(toLowerCase("PurnaChanadrathaDDDfjdahfkajhHJGJGFJHTYTfjg7676757657"));
  }
}
