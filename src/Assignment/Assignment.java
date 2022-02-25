package Assignment;

public class Assignment {
   ///for prime number
   public static boolean checkPrime(int num){
      for (int i = 2; i <num; i++){
         if(num % i == 0){
            return false;
         }
      }
      return true;
   }
   // print an array
   public static int[] copyArray(int[] arr){
      if(arr ==null || arr.length == 0)
         return null;
      int [] res= new int[arr.length];
      for (int i =0; i< arr.length;i++){
         res[i] = arr[i];
      }
      return res;
   }

   public static void print(int[] ar){
      if(ar ==null || ar.length == 0)
         return ;
      for (int i: ar){
      System.out.print(i);
      }
    System.out.println();
   }

// print array in reverse order
public static void printReverse(int[] arr){
    for (int i = arr.length - 1; i >= 0; i--)
       System.out.print(arr[i]);
    System.out.println("\ndone");
}

public static int fibb(int n){
      if(n < 2) return n;
      return fibb(n-1) + fibb(n-2);
}

   public static void main(String[] args){
    // System.out.println(checkPrime(6));
    //     int[] arr = {1,2,3,4,5,6,7,8};
    //    print(arr);
    //      int[] a = copyArray(arr);
    //      print(a);
    //      printReverse(arr);
    //System.out.println(fibb(5));
   }
}
