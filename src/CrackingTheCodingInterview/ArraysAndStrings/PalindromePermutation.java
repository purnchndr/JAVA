package CrackingTheCodingInterview.ArraysAndStrings;

public class PalindromePermutation {
    public static String toLowerCase(String str){
        return getLowerCase(str);
    }

    public static String getLowerCase(String str) {
        char[] c = str.toCharArray();
        for(int i = 0; i< c.length;i++){
            int n= (int)c[i];
            if(n < 91 && n> 64){
                c[i] = (char) (((int)c[i])+32);
            }
        }
        return new String(c);
    }

    public static boolean checker(int[] frequency){
        boolean founded = false;
        for(var i: frequency)
            if(i%2 != 0){
                if (founded)
                    return false;
            founded = true;
            }
        return true;
    }

    public static boolean isPP(String s){
        return checker(getCharFrequency(getLowerCase(s)));
    }

    public static int[] getCharFrequency(String str){
        int[] frequency = new int[26];
        for(int i=0; i< str.length();i++)
            if(str.charAt(i) != ' '){
                int index =  str.charAt(i)-'a';
                frequency[index]++;
            }
        return frequency;
    }

  public static void main(String[] args) {
    String s = "abBA";
    System.out.println(isPP(s));
  }
}
