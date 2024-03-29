package CodingBlocksCrucxJAVA.Section2;

import java.util.*;

// TODO: 01-02-2022  
public class NumberBaseConvertor {

    public static int convertAnyBaseToDecimal(int num, int base){
       int multiplier = 1;
       int ans = 0;
       int toBase = 10;
       while(num != 0){
           int rem = num % toBase;
           ans += rem * multiplier;
           multiplier *= base;
           num /= toBase;
       }
       return ans;
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        System.out.println(convertAnyBaseToDecimal(101,2));
    }
}
