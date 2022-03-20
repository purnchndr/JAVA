package CrackingTheCodingInterview.ArraysAndStrings;

public class DuplicateInString {
    static boolean isUnique(String text){
        int checker  = 0;
        for(int i = 0; i < text.length(); i++){
            int charValue = text.charAt(i) - 'a';
      System.out.println(checker & (1<< charValue));
            if((checker & (1<< charValue))> 0){
                return false;
            }
            checker |= (1 << charValue);
        }
        return true;
    }

    static void isUnique2(String text){
        if(text.length() > 128);
    }

  public static void main(String[] args) {
    //System.out.println(isUnique("purna"));
      for(int i = 0; i< 256; i++){
          char c = (char)i;
      System.out.print(c + " " );
      }

  }
}
