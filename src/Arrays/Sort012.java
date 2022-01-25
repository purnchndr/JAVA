package Arrays;
public class Sort012 {
    public static int[] sort012(int[] arr){
        int start= 0, mid = 0, end = arr.length-1;
        while(mid <= end){
            if(arr[mid] == 0) swap(arr, start++,mid++);
            else if(arr[mid] == 1) mid++;
            else  swap(arr, mid,end--);
        }
        return  arr;
    }
    private static void swap(int[] arr, int s, int e){
        int temp= arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={2,1,2,0,1,1,0,2,0,2,0,1};
        for(var i: arr) System.out.print(i +" ");
        System.out.println();
        sort012(arr);
        for(var i: arr) System.out.print(i +" ");
    }
}
