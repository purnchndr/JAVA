package Recursion;

import java.util.ArrayList;

public class ArrayIndexes {
  public static int[] giveIndexes(int[] arr, int num) {
    return giveIndexes(arr, num, 0, 0);
  }

  public static int[] giveIndexes(int[] arr, int data, int index, int count) {
    if (arr == null || index == arr.length)
      return new int[count];
      int[] res;
      if (arr[index] == data) {
        res = giveIndexes(arr, data, index +1, count+1);
        res[count] = index;
      }
      else
          res = giveIndexes(arr, data, index+1, count);
      return res;
    }
    public static void print(int[] a){
      if(a == null) return;
        for (int i : a) System.out.print(i +" ");
        System.out.println();
    }

  public static void main(String[] args) {
      int[] arr = {};
      print(arr);
      var a = giveIndexes(arr,8);
      print(a);
  }
}