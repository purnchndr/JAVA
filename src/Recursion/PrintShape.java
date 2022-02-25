package Recursion;

public class PrintShape {
    private static void print(int num,int row , int col){
        if(num < row)
            return;
        if(col < row){
      System.out.print("*");
      print(num, row,++col);
      return;
        }
    System.out.println();
    print(num, ++row,0);
    return;
    }
    public static void print(int num){
        print(num,1,0);
    }

  public static void main(String[] args) {
   print(5);
  }
}
