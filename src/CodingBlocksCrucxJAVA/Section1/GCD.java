package CodingBlocksCrucxJAVA.Section1;

public class GCD {
    public static  int getGCD(int divisor, int div){
        if(divisor < 1 || div < 1)
            return 0;
      for(int  i = div ;i > 0; i--)
          if(divisor % i == 0 && div % i == 0)
              return i;
      return 1;
    }

    public static  int getGCD2(int dividend, int divisor){
        while(divisor > 0){
            int reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }
       return dividend;
    }
    public static void main(String[] args) {
        StringBuilder gh = new StringBuilder();
        System.out.println(getGCD(39,60));
    }
}
