package BinarySearch;

public class EkoEko {

    public static int ecoEco(int[] arr,int target){
        int max = arr[0];

        for(int i : arr)
            max = Math.max(max, i);

        int start = 0,  end = max, result = -1;

        while(start <= end){

            int mid = start+(end-start)/2,  sum = 0;

            for (int i : arr)
                sum += i > mid ? i-mid : 0;

            if(sum >= target){
                result = mid;
                start = mid +1;
            }

            else
                end = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4,42,40,26,46};

        System.out.println(ecoEco(arr,20));

    }

}
