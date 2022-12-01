package DataStructures;


public class MaxHeap implements Heap{
    private int[] arr;
    int size;
    int DEFAULT_CAPACITY = 100;

    public MaxHeap(int capacity){
        this.arr = new int[capacity];
    }
    public MaxHeap(){
        this.arr = new int[DEFAULT_CAPACITY];
    }
    @Override
    public boolean insert(int data) {
        if(isFull())
            return false;
       arr[size++] = data;
       int index = size-1;
       int parent  = parent(index);
       while (index > 0 && arr[index] > arr[parent]){
           swap(index,parent);
           index = parent;
           parent = parent(index);

       }
       return true;
    }


    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        int count = 1;
        for(int i = 0; i < getSize(); i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    @Override
    public int peek() {
        if(isEmpty())
            throw new IllegalStateException("Heap is Empty");
        return arr[0];
    }

    @Override
    public int remove() {
        if(isEmpty())
            throw new IllegalStateException("Heap is Empty");
        int res = arr[0];
        arr[0] = arr[--size];
        heapify();
        return res;
    }

    @Override
    public int pop() {
        if(isEmpty())
            throw new IllegalStateException("Heap is Empty");
        return remove();
    }

    @Override
    public void heapify() {
        maxHeapify(0);
    }

    public static void buildHeap(int[] arr){
        int n = arr.length;
        int parent = (n-2)/2;
        for( ; parent >= 0 ; parent --){
            int left = 0 ;// leftChild(parent);
            int right = 0; // rightChild(parent);
            int root = parent;
            if(left < n && arr[left] > arr[root]){
                root = left;
            }
            if(right < n && arr[right] > arr[root]){
                root = right;
            }
            if(root != parent){
                int temp = arr[parent];
                arr[parent] = arr[root];
                arr[root] = temp;
               // maxHeapify(root);
            }
        }
    }

    private void maxHeapify(int index){
        int left = leftChild(index);
        int right = rightChild(index);
        int root = index;
        if(left < size && arr[left] > arr[root]){
            root = left;
        }
        if(right < size && arr[right] > arr[root]){
            root = right;
        }
        if(root != index){
            swap(index, root);
            maxHeapify(root);
        }
    }



    private int leftChild(int index) {
        return index*2+1;
    }


    private int rightChild(int index) {
        return index*2+2;
    }


    private int parent(int index) {
        return (index-1)/2;
    }

    @Override
    public int[] heapSort(int[] array) {
        return new int[0];
    }



    @Override
    public void swap(int index, int targetIndex) {
        int temp = arr[index];
        arr[index] = arr[targetIndex];
        arr[targetIndex] = temp;
    }
}
