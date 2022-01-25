package AlgoExpert_160_Questions.Easy;

public class ValidateSubsequence {
    public static boolean validateSubseq(int[] main, int[] subseq){
        int count = 0;
        for(int i : main){
            if(i == subseq[count]) count++;
            if(count == subseq.length) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,22,25,6,-1,8,10};
        int[] sub = {1,6,-1,10};
        System.out.println(validateSubseq(arr,sub));
    }
}
