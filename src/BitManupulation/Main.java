package BitManupulation;

public class Main {

    private static int getMask(int k){
        if(k < 1)
            return 0;
        int mask = 1;
        while (--k >0)
            mask = mask << 1;
        return mask;
    }

    public static boolean checkIfBitIsSetOrNot(int num, int k){
        int mask = getMask(k);
        return (num & mask) > 0;
    }
    public static int setKthBit(int num, int k){
        int mask = getMask(k);
        num = num | mask;
        return num;
    }

    public static int reSetKthBit(int num, int k){
        int mask = ~getMask(k);
        num = num & mask;
        return num;
    }

    public static int toggleKthBit(int num, int k){
        int mask = getMask(k);
        return num = num ^ mask;
    }

    public static int countNumberOfSetBit(int num){
        int count = 0;

        while(num > 0){
            if((num & 1) == 1)
                count++;
            num = num >>1;
        }
        return count;
    }

    public static boolean isNumberPowOf2(int num){
        return (num & num-1) == 0;
    }
    public static int findNextPowOf2(int num){
        int mask = 1;
        while (num > 0){
           mask =  mask << 1;
           num = num >> 1;
        }
        return mask;
    }

    public static boolean checkPowOf4(int n){
        int ones = 0;
        int count = 0;
        while (n > 0){
            if((n & 1) == 1)
                ones++;
            count++;
            n = n >> 1;
        }
        return ones == 1 && count % 2 == 1;
    }

    public static int multiplyWith7(int num){
        return  (num << 3) - num;
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(multiplyWith7(i));

    }
}
