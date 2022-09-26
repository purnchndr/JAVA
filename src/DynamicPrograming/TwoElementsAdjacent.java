package DynamicPrograming;

import java.util.Arrays;

public class TwoElementsAdjacent {

//    public int solveR(int[] arr, int n, int index){
//        if(index >=n)
//    }

    public static int maxCut(int size, int a, int b, int c){
        if(size == 0)
            return 0;
        if(size < 0)
            return Integer.MIN_VALUE;
        count++;
        int ans1 = maxCut(size-a, a,b,c);
        int ans2 = maxCut(size-b, a,b,c);
        int ans3 = maxCut(size-c, a,b,c);

        return 1+(Math.max(ans1,Math.max(ans2,ans3)));
    }
    public static int maxCutM(int size, int a, int b, int c, int[] memory){
        if(size == 0)
            return 0;
        if(size < 0)
            return Integer.MIN_VALUE;
        if(memory[size] != 0)
            return memory[size];
        count++;
        int ans1 = maxCutM(size-a, a,b,c,memory);
        int ans2 = maxCutM(size-b, a,b,c,memory);
        int ans3 = maxCutM(size-c, a,b,c,memory);
        int ans = 1+(Math.max(ans1,Math.max(ans2,ans3)));
        return  memory[size] = ans;
    }

    public static int maxCutT(int size, int a, int b, int c, int[] memory){
        memory[0] = 0;
        for(int i = 1 ; i <= size; i++){
            int ans1 = memory[i-a];
            int ans2 = memory[i-b];
            int ans3 = memory[i-c];
            int ans = 1+(Math.max(ans1,Math.max(ans2,ans3)));
        }


        return  0; //memory[size] = ans;


    }

 static int count = 0;
    public static void main(String[] args) {
        int size = 18;
        int[] memory = new int[size+1];
       // Arrays.fill(memory, Integer.MIN_VALUE);
        //System.out.println(maxCutM(size,15,3,8,memory ));
        System.out.println(maxCut(size,15,3,1 ));
        System.out.println(count);
    }
}
