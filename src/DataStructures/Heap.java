package DataStructures;

public interface Heap {
    public boolean insert(int data);

    public int getSize();
    public boolean isFull();
    public boolean isEmpty();
    public void print();
    public int peek();
    public int remove();
    public int pop();

    public void heapify();


    public int[] heapSort(int[] array);

    public  void swap(int index, int targetIndex);

}
