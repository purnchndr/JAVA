package CodingBlocksCrucxJAVA.Section1;

public class ReverseInteger {
    public static int reverse(int num){
        int result = 0;
        while(num != 0){
            int lastDigit = num%10;
            num /= 10;
            result = result*10 + lastDigit;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-235468));
   }
}