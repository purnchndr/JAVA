package Use;

import java.util.HashMap;

public class GFG {

    public static   boolean cm(){
        String a = "ABCDEF";
        String b = "DEFABC";
        if(a.length() != b.length())
            return false;
        int index = -1;
        for(int i =0; i< a.length();i++){
            if(a.charAt(0) == b.charAt(i))
                index = i;
        }
        if(index ==-1)
            return false;
        for (int i = 0; i< a.length();i++){
            int j = index++%b.length();
            if(a.charAt(i) != b.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static boolean suff(){
        String a = "AB";
        String b = "12";
        String c = "A21B";
        if(a.length()+b.length() != c.length())
            return false;
        int[] arr = new int[256];
        int[] arr1 = new int[256];
        for(int i = 0; i< a.length();i++)
            arr[a.charAt(i)]++;
        for(int i = 0; i< b.length();i++)
            arr[b.charAt(i)]++;
        for(int i = 0; i< c.length();i++)
            arr1[c.charAt(i)]++;
        for(int i = 0; i< arr.length;i++)   //65 66 55 56
           if( arr[i] != arr1[i])
               return false;
        return true;
    }
    public static void main(String[] args)  {

        //System.out.println(suff());
        int s = 9;
        int e = 3;
        System.out.println((s+e)<<1);

    }

}
