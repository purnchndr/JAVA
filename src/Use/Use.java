package Use;

import java.util.*;

public class Use {
    public static void check(int n) throws Exception {
        if(n < 0) throw new Exception("N is very low");
    System.out.println(n);
    }

    public static void main(String[] args){



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
