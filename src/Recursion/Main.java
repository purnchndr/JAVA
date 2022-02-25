package Recursion;

public class Main {
    private static void stackCallCount(int num){
        if(num == 10)
            return;
    System.out.println(num);
    stackCallCount(++num);
    }
  public static void main(String[] args) {
    int[] array = {1,1,1,2,2,0,0,4,4,4,5,6,7,4,3,2,45,6,7,8,9,98,8,8,9};
    // System.out.println(SortedArray.isSorted(array,0));
    //    System.out.println(FindElement.findFirstElement(array, 4));
    //      System.out.println(FindElement.findLastElement(array, 4));
    System.out.println(MinStepToOne.getMinStepM(100));
  }
}
