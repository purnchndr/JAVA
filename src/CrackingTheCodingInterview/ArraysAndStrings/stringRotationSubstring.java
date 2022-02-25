package CrackingTheCodingInterview.ArraysAndStrings;

public class stringRotationSubstring {
    public static boolean isSubstring(String rot, String main){
        int len = main.length();
        int len2 = rot.length();
        int count1 =0, count2 = 0;
        while(true){
            if(count1 >= rot.length()*2) return false;
            else if(count2 == len) return true;
            else if(rot.charAt(count1%len2) == main.charAt(count2)){
                count2++;
                count1++;
            }
            else{
                count1++;
                count2 = 0;
            }
        }
    }
}
