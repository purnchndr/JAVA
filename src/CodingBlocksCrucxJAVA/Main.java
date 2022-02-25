package CodingBlocksCrucxJAVA;

public class Main {
    public static void pattern1(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        int rows = n*2-1;
        int stars = 1;
        for (int i = 1; i<= rows; i++){
            for(int j = 1 ; j <= stars;j++)
                System.out.print("*");
            System.out.println();
            if(i >= n ) stars--;
            else stars++;
        }
    }

    public static void pattern2(int n){
        for(int i = 1; i<= n; i++ ){
            for(int j = 1; j<i; j++)
                System.out.print(" ");
            for(int j = i; j<= n ; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
pattern3(5);
    }
}
