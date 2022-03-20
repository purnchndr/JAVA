package Recursion;

public class MaxCutOnRope {
    static int count = 0;
    public static int getMaxCut(int n, int a, int b, int c){
        if(n < 0) return -1;
        if(n == 0) return 0;
        count++;
        int res1 = getMaxCut(n-a, a,b,c);
        int res2 = getMaxCut(n-b, a,b,c);
        int res3 = getMaxCut(n-c, a,b,c);
        int res = Math.max(Math.max(res1,res2),res3);
        if (res ==-1) return res;
        return res+1;
    }


    public static int getMaxCut2(int n, int a, int b, int c,int[] arr){
        if(n < 0) return -1;
        if(n == 0) return 0;
        if(arr[n] != 0)
            return arr[n];
        count++;
        int res1 = getMaxCut2(n-a, a,b,c,arr);
        int res2 = getMaxCut2(n-b, a,b,c,arr);
        int res3 = getMaxCut2(n-c, a,b,c,arr);
        int res = Math.max(Math.max(res1,res2),res3);

        if (res ==-1) {
            arr[n] = res;
            return res;
        }
        arr[n] = res+1;
        return res+1;
    }

    public static int getMaxCut2(int n,int a, int b, int c){
        return getMaxCut2(n, a,b,c,new int[n+1]);
    }

  public static void main(String[] args) {
    System.out.println(getMaxCut2(10000,11,9,12));
    System.out.println(count);
  }
}
