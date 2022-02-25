package CodingBlocksCrucxJAVA.Section1;

import java.util.Scanner;

public class FibbN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a = 0, b = 1, count = 0;
        while(count++ <= n){
            System.out.println(a);
            int sum = a+b;
            a = b;
            b = sum;
        }
    }
}
