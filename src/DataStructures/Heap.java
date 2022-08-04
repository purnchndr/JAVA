package DataStructures;

public interface Heap {

    public boolean insert(int data);
    public void heapify();
    public int getSize();
    public boolean isFull();
    public boolean isEmpty();
    public void print();
    public int peek();
    public int remove();
    public int pop();

    public int[] heapSort(int[] array);

    public void reverseHeapiFy();
    public static void swap(int[] array, int index, int targetIndex){
        int temp = array[index];
        array[index] = array[targetIndex];
        array[targetIndex] = temp;
    }
}
