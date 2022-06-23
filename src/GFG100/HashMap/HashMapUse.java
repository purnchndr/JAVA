package GFG100.HashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapUse {
    public static void countFrequency(int[] arr){
        LinkedHashMap<Integer,Integer> list = new LinkedHashMap<>();
        for (int i: arr){
            if(list.containsKey(i))
                list.replace(i,list.get(i)+1);
            else
                list.put(i,1);
        }
        System.out.println(list);
    }
    public static void countFrequencyBF(int[] arr){
        for (int i = 0; i< arr.length; i++){
            boolean flag = false;
            int fre = 0;
            for (int  j = i-1; j>=0; j--){
                if(arr[j] == arr[i]){
                    flag = true;
                    break;
                }
            }
            if(flag)
                continue;
            for(int k = i; k < arr.length;k++){
                if(arr[i] == arr[k])
                    fre++;
            }
            System.out.println(arr[i]+"-->"+fre);
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("purna",1);
//        map.put("ram",2);
//        System.out.println(map);
//        System.out.println(map.size());
////        for(Map.Entry<String,Integer> a : map.entrySet()){
////            System.out.println(a);
////        }
////        for(var a : map.entrySet()){
////            System.out.println(a.getKey()+ "////////"+ a.getValue());
////        }
//        System.out.println(map.containsKey("ram"));
//        System.out.println(map.containsValue(5));
//        //System.out.println(map.remove("purna"));
//        System.out.println(map.remove("purn"));
//        System.out.println(map.get("purna"));
//        System.out.println();
        countFrequencyBF(new int[]{7,7,7,7,7,1,1,1,1,2,2,2,4,5,6,7,1,1,1,1,1,4,4,7,8,9,1,2,44});
    }
}
