package Use;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static boolean isPrime(int n){
        for(int i =2; i < Math.sqrt(n);i++) {
            System.out.println(n%i);
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //[ 2  8i  2  2  4  3 ]

    public static int  balanceSum(int[] arr){
        for(int i =0; i < arr.length;i++) {
            int sum1 = 0; //2
            int sum2 = 0; //2
            for(int j =0; j < arr.length;j++){

                if( j < i){
                    sum1 += arr[j];
                }
                if( j > i){
                    sum2 += arr[j];
                }

            }
            if(sum1 == sum2)
                return i;

        }
    return -1;
    }

    ///  3 = "fizz"
    // 5 = "buzz"
    // 3 5 = "fizzbuzz"

    public static void fizzBuzz(int n){
        for(int i =1 ; i <= n; i++){

            if(i % 5 != 0 && i % 3 != 0)
                System.out.print(i);

            if(i % 3 == 0  )
                System.out.print("fizz");

            if(i % 5==0)
                System.out.print("buzz");

            System.out.println();


        }
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int[] map = new int[256];
        for (char c : s1.toCharArray())
            map[c]++;
        for (char c : s2.toCharArray())
            map[c]--;
        for (int i : map)
            if(i != 0)
                return false;
        return true;
    }

    public static boolean checkPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : str.toCharArray())
            if(c >='a' && c <= 'z'-1 ||c >='A' && c <= 'Z' || c >='0' && c <= '9' )
                stringBuilder.append(c);
        String mod = new String(stringBuilder);
        mod = mod.toLowerCase();
        int end = mod.length()-1 , st = 0;
        while(st< end)
            if(mod.charAt(st++) != mod.charAt(end--))
                return false;
        return true;
    }


    public static void main(String[] args) {

/*
        System.out.println(isAnagram("Purna___(r9i...\09qe09q","_\0__qe09qrna(r9.i9P.u."));
        System.out.println((int)'\0');
*/
        System.out.println(checkPalindrome("N2 i&nJA?a& jnI2n"));
    }
}
