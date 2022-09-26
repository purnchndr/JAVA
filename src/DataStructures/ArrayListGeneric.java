package DataStructures;

import java.util.ArrayList;

public class ArrayListGeneric<T> {
    private int capacity;

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 20;
    private Object[] array;

    public ArrayListGeneric(int size){
        this.capacity = size;
        array = new Object[size];
    }

    public ArrayListGeneric(){
        this.capacity = DEFAULT_CAPACITY;
        this.array = new Object[this.capacity];
    }

    public int size(){
        return size;
    }

    public void add(T data){
        array[size++] = data;
    }

    public T get(int index){
        if(index  >= size || index < 0)
            throw new IndexOutOfBoundsException("Invalid index");
       return (T) array[index];
    }

    public void addAt(int index, int data){
        if(index  > size || index < 0)
            throw new IndexOutOfBoundsException("Invalid index");
        for(int i = size-1; i >= 0; i--){
            if(i > index){
                array[i+1] = array[i];
            System.out.println(get(i));}
            else
                array[i] = data;
        }
        size++;
    }

    public static void main(String[] args) {
        ArrayListGeneric<Integer> arr = new ArrayListGeneric<>(10);
        arr.add(89);
        arr.addAt(0,1);

        System.out.println(arr.get(0)+ arr.get(1));
    }
}
