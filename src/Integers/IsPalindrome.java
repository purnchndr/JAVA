package Integers;

public class IsPalindrome {
    public  static boolean isPalindrome(int number){
        if(number < 0 || (number%10 == 0 && number != 0)) return false;
        int halfNumber = 0;
        while (number > halfNumber){
            halfNumber =10*halfNumber + number%10;
            number /= 10;
        }
        return number == halfNumber || number == halfNumber/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12215));
    }
}
