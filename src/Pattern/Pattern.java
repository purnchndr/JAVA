package Pattern;

public class Pattern {

    //*  *  *  *
    //*  *  *  *
    //*  *  *  *
    //*  *  *  *
    public static void  pat1(int number){
       for(int row = 1 ; row <= number; row++){
           for(int col = 1; col <= number; col++)
               System.out.print(" * ");
           System.out.println();
       }
    }

    //*           /pat2
    //*  *
    //*  *  *
    //*  *  *  *
    public static void  pat2(int number){
        for(int row = 1 ; row <= number; row++){
            for(int col = 1; col <= row; col++)
                System.out.print(" * ");
            System.out.println();
        }
    }

//     *  *  *  *
//     *  *  *
//     *  *
//     *
    public static void  pat3(int number){
        for(int row = 1 ; row <= number; row++){
            for(int col = 1; col <= number-row+1; col++)
                System.out.print(" * ");
            System.out.println();
        }
    }

//                       *
//                    *  *
//                 *  *  *
//              *  *  *  *
    public static void  pat4(int number){
        for(int row = 1 ; row <= number; row++){
            for(int col = 1; col <= number-row; col++)
                System.out.print("   ");
            for(int col = 1; col <= row; col++)
                System.out.print(" * ");
            System.out.println();
        }
    }

    //              *  *  *  *
    //                 *  *  *
    //                    *  *
    //                       *
    public static void  pat5(int number){
        for(int row = 1 ; row <= number; row++){
            for(int col = 1; col <= row-1; col++)
                System.out.print("   ");
            for(int col = 1; col <= number - row-1; col++)
                System.out.print(" * ");
            System.out.println();
        }
    }

    public static void  pat6(int number){
        for(int row = 1 ; row <= number; row++){
            for(int col = 1; col <= row-1; col++)
                System.out.print("   ");
            for(int col = 1; col <= number - row-1; col++)
                System.out.print(" * ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pat6(5);
    }
}
