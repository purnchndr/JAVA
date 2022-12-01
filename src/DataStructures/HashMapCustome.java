package DataStructures;


import java.util.*;

public class HashMapCustome {
    private static class Entry{
        int key;
        String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return "{"+this.key+"="+this.value+"}";
        }
    }
    HashMap<Integer, ArrayList<Entry>> map;
    int size = 0;
    int length ;
    public HashMapCustome(){
        map = new HashMap<>(100);
        length = 100;
    }

    public void put(int key, String value){
        int hashKey = getHashCode(key);
        if(!map.containsKey(hashKey))
            map.put(hashKey,new ArrayList<>());
        for(Entry e : map.get(hashKey))
            if(e.key == key){
                e.value = value;
                return;}

        map.get(hashKey).add(new Entry(key, value));
        size++;
    }

    public String getValue(int key){
        Entry res  = getEntryByKey(key);
        return res != null ? res.value : "";

    }

    public Entry getEntry(int key){

        return getEntryByKey(key);
    }

    private Entry getEntryByKey(int key){
        int hashKey = getHashCode(key);
        if(map.containsKey(hashKey)) {
            ArrayList<Entry> list = map.get(hashKey);
            for(Entry entry : list)
                if(entry.key == key)
                    return entry;
        }
        return null;
    }

    public ArrayList<Entry> getEntrySet(){
        ArrayList<Entry> res = new ArrayList<>();
        for(int i : map.keySet() ){
            res.addAll(map.get(i));
        }
      return res;
    }


    public void remove(int key){
        ArrayList<Entry> list = map.get(getHashCode(key));
        if(list == null)
           throw new IllegalStateException("Key is not present");
        list.remove(getEntry(key));
    }


    private int getHashCode(int key){
        return Math.abs(key%length);
    }

    public int size(){
        return  this.size;
    }

    public static void main(String[] args) {
       Set<String> set1 = new HashSet<>(Arrays.asList("Hello", "Hi", "by"));


    }

}
