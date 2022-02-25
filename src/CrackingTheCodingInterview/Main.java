package CrackingTheCodingInterview;
import CrackingTheCodingInterview.ArraysAndStrings.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        System.out.println(s);
        s.append(" chandan ");
        System.out.println(s);
        s.delete(9);
        System.out.println(s);
    }


}
