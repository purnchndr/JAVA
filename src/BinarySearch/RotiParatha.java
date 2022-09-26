package BinarySearch;

/*10
4 1 2 3 4*/

public class RotiParatha {



    public static int solve(int[] arr, int target){

        int minutes  = 0;
        int count = 1;
        int  j = 0;
        while(count <= target){
            int curr = 0;
            for(int i : arr){
                if (j % i == 0)
                    curr++;
            }
            j++;
            count += curr;
            minutes++;
        }
       return minutes;
    }

    public static void main(String[] args) {
        int [] arr = {4,1,2,3,4};
        System.out.println(solve(arr,9));

    }

}
