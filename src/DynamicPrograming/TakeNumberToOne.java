package DynamicPrograming;

public class TakeNumberToOne {
    static  int count = 0;
    static int getPath(int num){
        count++;
        if(num == 1) return 0;
        int res1 = Integer.MAX_VALUE, res2 = res1, res3 =res2;
        if(num % 3 == 0) res1 = 1+ getPath(num/3);
        if(num % 2 == 0) res2 = 1+ getPath(num/2);
        res3 = 1+ getPath(num -1);
        return Math.min(Math.min(res1,res2),res3);
    }
    static int getPathM(int num, int[] storage){
        count++;
        if(num == 1) {
            storage[num] = 0;
            return 0;
        }
        if (storage[num] != -1){
            return storage[num];
        }
        int res1 = Integer.MAX_VALUE, res2 = res1, res3 =res2;
        if(num % 3 == 0) res1 = 1+ getPathM(num/3, storage);
        if(num % 2 == 0) res2 = 1+ getPathM(num/2,storage);
        res3 = 1+ getPathM(num -1,storage);
        int res = Math.min(Math.min(res1,res2),res3);
        storage[num] = res;
        return res ;
    }
 static int set(int n){
        int[] s = new int[n+1];
        for (int i = 0; i<=n ; i++){
            s[i] = -1;
        }
        return getPathM(n, s);
 }
    public static void main(String[] args) {
        System.out.println(set(5000));
        //System.out.println(getPath(10));

        System.out.println(count);
    }
}
