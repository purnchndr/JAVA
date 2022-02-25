package CrackingTheCodingInterview.ArraysAndStrings;
//// Write a methode to replace all spaces with "%20" in O(1) space
public class URLify {
    public static void urlify(char[] arr,int num){
        num -= 1;
        int count = arr.length-1;
       while (num>=0){
            if(arr[num]==' '){
                arr[count]='0';
                arr[count-1]='2';
                arr[count-2]='%';
                count -=3;
            }
            else {
                arr[count] = arr[num];
                count--;
            }
           num--;
       }
    }
    public static void print(char[] arr){
        for (char i: arr){
      System.out.print(i);
        }
    System.out.println();
    }

  public static void main(String[] args) {
    char[] a = new char[9];

      a[0] = 'M';
      a[1] = ' ';
      a[2] = 'P';
      a[3] = ' ';
      a[4] = 'n';

    print(a);
    urlify(a,5);
    print(a);
  }
}
