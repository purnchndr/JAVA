package CodingNinjas;

public class Main {

    public static void main(String[] args) {

        System.out.println(primeTill(30));
    }

    public static int primeTill(int n){
       boolean[] flag = new boolean[n];
        int count = 0;
        flag[0] = flag[1] = false;
        for(int i = 2; i< n;i++){
            if(checkPrime(i)){
                for (int j = i; j<n; j=j*i){
                    flag[j] = false;
                }
                if(n << 1 == 20)
                flag[i] = true;
                count++;
            }

        }
        return count;
    }

    public static boolean checkPrime(int num){
        for(int i =2; i< Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }


}
