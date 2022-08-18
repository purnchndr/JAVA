package Use;

public class GFG {
    public static  boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m = matrix[0].length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+((e-s)/2);
            if(matrix[mid][0]<=target && matrix[mid][m-1]>= target)
                return binarySearch(matrix, mid, target,m);
            else if(matrix[mid][0] > target)
                e = --mid;
            else
                s = ++mid;
        }
        return false;
    }

    public static boolean binarySearch(int[][] matrix, int index, int target,int m){
        int s = 0;
        int e = m-1;
        while(s<=e){
            int mid = s+((e-s)/2);
            if(matrix[index][mid] > target)
                e = --mid;
            else if(matrix[index][mid] < target)
                s = ++mid;
            else
                return true;
        }
        return false;
    }
    public static int fibb(int n, int[] arr){
        if( n <= 1)
            return n;

        if(arr[n] != 0)
            return arr[n];
        count++;
        int i = fibb(n-1,arr)+fibb(n-2,arr);
        arr[n] = i;
        System.out.println(i);
        return i;
    }

    public static int fibbR(int n){
        if( n <= 1)
            return n;
        int a = 0;
        int b = 1;
        int d = 0;
        for(int i = 2; i< n; i++){
            d = a+b;
            System.out.print(d+", ");
            a = b;
            b = d;
            count++;
        }
        System.out.println();
        return d;
    }
    static int count = 0;
    public static void main(String[] args)
    {
//      int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//      int target = 13;
//        System.out.println(searchMatrix(arr,target));
        int [] arr = new int[101];
        System.out.println(fibbR(10));
        System.out.println(count+"Count --------------------");
    }

}
