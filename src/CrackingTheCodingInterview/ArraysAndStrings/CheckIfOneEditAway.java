package CrackingTheCodingInterview.ArraysAndStrings;

public class CheckIfOneEditAway {
    public static boolean checkIfOneEditAway(String str1, String str2){
        if(str1.length() == str2.length())
            return replace(str1,str2);
        else if(str2.length()+1 == str1.length())
            return remove(str2,str1);
        else if(str1.length()-1 == str2.length())
            return remove(str1,str2);
        return false;
    }

    private static boolean remove(String str1, String str2) {
        boolean flag = false;
        int index =0;
        for(int i =0; i < str1.length();i++)
            if(str1.charAt(i) != str2.charAt(index)){
                if(flag)
                    return false;
                flag = true;
            }
        else
            index++;
        return true;
    }

    private static boolean replace(String str1, String str2) {
        boolean flag = false;
        for(int i =0; i < str2.length();i++)
            if(str1.charAt(i) != str2.charAt(i)){
                if(flag)
                    return false;
                flag = true;
            }
        return true;
    }

  public static void main(String[] args) {
    String a = "pale";
    String b = "bae";
    System.out.println(checkIfOneEditAway(a,b));
  }
}
