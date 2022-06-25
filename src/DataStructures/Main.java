package DataStructures;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(3);
        arr.add(55);
        arr.add(65);
        arr.add(5);
        System.out.println(arr);
        arr.add(3);
        arr.add(44);
        arr.add(6);
        arr.add(7);
//        System.out.println(arr.length());
//        System.out.println(arr);
//        System.out.println(arr.findIndex(44));
//        arr.add(1,99);
//        System.out.println(arr.length());
//        System.out.println(arr);
//        arr.removeAt(1);
//        System.out.println(arr.length());
//        System.out.println(arr);
//        arr.removeValue(44);
//        System.out.println(arr.length());
//        System.out.println(arr);
//        System.out.println(arr.length());
//        arr.removeLast();
//        System.out.println(arr);
//        System.out.println(arr.length());
//        arr.add(5,55);
        System.out.println(arr);
        arr.reverse();
        System.out.println(arr);
        int[] a = {6,33,5,7,7,8,2,3};
        var ab = arr.getIntersection(a);
        System.out.println(ab);





    }
}
