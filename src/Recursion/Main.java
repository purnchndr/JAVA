package Recursion;

import java.util.Arrays;

public class Main {


    public static void balanceBinary(int leftSum, int rightSum, char[] ch, int start, int end){
        //base case
        if(start > end){
            if( leftSum == rightSum)
                System.out.println(Arrays.toString(ch));
            return ;
        }

        // case 0,0
        ch[start] = '0';
        ch[end] = '0';
        balanceBinary(leftSum, rightSum,ch, start+1,end-1);

        // case 0,1
        ch[start] = '0';
        ch[end] = '1';
        balanceBinary(leftSum, rightSum+1,ch, start+1,end-1);

        // case 1,0
        ch[start] = '1';
        ch[end] = '0';
        balanceBinary(leftSum+1, rightSum,ch, start+1,end-1);

        // case 0,0
        ch[start] = '1';
        ch[end] = '1';
        balanceBinary(leftSum+1, rightSum+1,ch, start+1,end-1);
    }


    public static int balanceBinary(int leftSum, int rightSum,  int start, int end){
        //base case
        if(start > end){
            if( leftSum == rightSum)
                return 1;
            return 0;
        }

        int count = 0;

        // case 0,0

        count += balanceBinary(leftSum, rightSum, start+1,end-1);

        // case 0,1

        count += balanceBinary(leftSum, rightSum+1, start+1,end-1);

        // case 1,0

        count += balanceBinary(leftSum+1, rightSum,start+1,end-1);

        // case 0,0

        count += balanceBinary(leftSum+1, rightSum+1, start+1,end-1);

        return count;
    }

  public static void main(String[] args) {
        int n =4;

        //char[] ch = new char[2*n];
      System.out.println(balanceBinary(0,0,0,2*n-1));

  }
}
