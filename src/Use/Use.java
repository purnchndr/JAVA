package Use;

import java.util.*;

public class Use {
    public static void check(int n) throws Exception {
        if(n < 0) throw new Exception("N is very low");
    System.out.println(n);
    }

    public static void main(String[] args){


        int arr[] = {100,5,300,70,1,2,3,4,5,6,7,8};
//
//        System.out.printf("Before");
//        int min = arr[0];
//        int max = arr[0];
//        for(int i : arr) {
//            if(min > i)
//                min = i;
//            if(max < i)
//                max = i;
//        }
//
//        int s = 0;
//        int e = arr.length-1;
//        while (s<e){
//            int temp = arr[s];
//            arr[s++] = arr[e];
//            arr[e--] = temp;
//        }
        for(int i = 0; i< arr.length/2; i++){
            int l = arr.length-1-i;
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
        }

        System.out.println("after");
        for(int i : arr)
            System.out.print(i+", ");
//        Arrays.sort(arr);
//        int k = 2;
//        System.out.println(arr[k-1]+":  "+ arr[arr.length-k]);







//Stack<Integer> s = new Stack();


//        int n = -1;
//        try {
//            Use.check(n);
//            System.out.println("In Try");
//        } catch (Exception e) {
//            e.printStackTrace();
//            //Use.check(n);
//      System.out.println("In catch");
//        }
//        finally{
//      System.out.println("In finally block");
//        }
//        HashSet<String> set = new HashSet<>();
//        set.add("Hello");
//        set.add("Namaste");
//    System.out.println(set.size());
//        for(var i: set){
//      System.out.println(i);
//      }
//    System.out.println( set.remove("Hello"));

//        HashMap<String,Boolean> map = new HashMap<>();
//       map.put("Pushpa", true);
//        map.put("fjords", true);
//        for (var i : map.keySet()){
//      System.out.println(Arrays.toString(i.getBytes()));
//        }

//        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] arr = {10,1,22,3,12,12,15,10,20,12,12};
//        int count = 0;
//        for (int j : arr)
//            if (map.containsKey(j)) {
//
//                int value = map.get(j);
//                map.replace(j, value, value + 1);
//            } else{
//                map.put(j, 1);
//
//            }
//    for (var i: map.entrySet()){
//        if(i.getValue() ==1)
//                System.out.println(i);
//        }
//    char c = 'h';
//    System.out.println(((int) c));
//        int i = 30;
//        int j = 20;
//        System.out.println(i);
    }
}
