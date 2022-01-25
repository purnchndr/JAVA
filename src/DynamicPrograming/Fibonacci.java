package DynamicPrograming;

public class Fibonacci {
    static int fib(int n){
        if(n < 2) return n;
        int res = fib(n-1)+ fib(n-2);
        System.out.println(n + "==>" + res);
        return res;
    }

    static int fibM(int n, int[] storage){
        if(n < 2) {
            storage[n] = n;
            return n;
        }
        if (storage[n] != -1) return storage[n];

        int res = fibM(n-1,storage)+ fibM(n-2,storage);
        System.out.println(n + "==>" + res);
        storage[n] = res;
        return res;
    }

    static int fibD(int n){
        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1]= 1;
        for(int i = 2; i<= n; i++)
            storage[i] = storage[i-1]+ storage[i-2];
        return storage[n];
    }
    static int fibDB(int n){
       int step1 = 0;
       int step2 = 1;
        int result = 0;
        for(int i = 2; i<= n; i++){
            result = step1+ step2;
            step1 = step2;
            step2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibDB(8));
    }
}
