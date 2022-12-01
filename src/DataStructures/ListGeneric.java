package DataStructures;

public class ListGeneric <T> {
    T[] list;
    int size;
    public ListGeneric(int size) {
        list = (T[]) new Object[size];
    }
    public ListGeneric() {
        this(100);
    }

    public void  add(T item) {
        list[size++] = item;
    }

    public T  get(int index) {
        return list[index];
    }

    public static void main(String[] args) {
        ListGeneric l = new ListGeneric<>();
       l.add("Ram");
       l.add('i');
       l.add(1);
       System.out.println(l);
    }

}
