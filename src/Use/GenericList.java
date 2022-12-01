package Use;


import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] list ;
    int length;
    int size;

    public GenericList(int size) {
        this.list = (T[]) new Object[size];
        this.length = size;
    }

    public GenericList(){
        this(10);
    }

    public void add(T item){
       list[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenListIterator(this);
    }

    private class GenListIterator implements Iterator<T>{
        GenericList<T> listObj;
        int count;
        public GenListIterator(GenericList<T> listObj) {
            this.listObj = listObj;
        }

        @Override
        public boolean hasNext() {
            return count < listObj.size;
        }

        @Override
        public T next() {
           return listObj.list[count++];
        }
    }




}
