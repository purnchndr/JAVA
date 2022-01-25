package Strings;

public class ReverseString {
    public static String reverse(char[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String name = "Purnachandra";
        char[] c = name.toCharArray();
        System.out.println(reverse(c));
    }
}
