package Recursion;

public class MinStepToOne {
    public static int getMinStep(int num){
        if(num < 2)
            return 0;
        int res = 1+ getMinStep(num-1);
        if(num%3 == 0){
            int res1 = 1+ getMinStep(num/3);
            if(res1 < res)
                res = res1;
        }
        if(num%2 == 0){
           int res1 = 1+ getMinStep(num/2);
            if(res1 < res)
                res = res1;
        }
        return res;
    }
    public static int getMinStepM(int num){
        int[] a = new int[num+1];
        return getMinStepM(num, a);
    }

    private static int getMinStepM(int num, int[] arr) {
        if(num < 2){
            arr[num] = 0;
            return 0;
        }
        if(arr[num] != 0)
            return arr[num];
        int res = 1+ getMinStepM(num-1,arr);
        if(num%3 == 0){
            int res1 = 1+ getMinStepM(num/3,arr);
            if(res1< res) res = res1;
        }
        if(num %2 == 0){
           int res1 = 1+getMinStepM(num/2,arr);
           if(res1<res) res = res1;
        }
        arr[num] = res;
        return res;
    }
}
