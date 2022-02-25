package CrackingTheCodingInterview.ArraysAndStrings;
import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder {
    private ArrayList<Character> string;
    private int length;
    public StringBuilder(String str){
        string = new ArrayList<>(str.length()*2);
        char[] c = str.toCharArray();
        for(char ch: c){
            string.add(ch);
            length++;
        }
    }
    public int size(){
        return length;
    }
    public boolean append(String str) {
        char[] c = str.toCharArray();
        for (char ch : c) {
            string.add(ch);
            length++;
        }
        return true;
    }
    public boolean append(int index,String str) {
        if(index > length || index < 0)
            return false;
        char[] c = str.toCharArray();
        for (char ch : c) {
            string.add(index++,ch);
            length++;
        }
        return true;
    }

    public boolean delete(int index){
        if(index > length || index < 0)
            return false;
        string.remove(index);
        return true;
    }
    @Override
    public String toString(){
        return string.toString();
    }


}
