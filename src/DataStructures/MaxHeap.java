package DataStructures;


import java.util.*;

public class MaxHeap implements Heap{
    int[] heap;
    int length;
    int size = 0;
    public MaxHeap(int size){
        heap = new int[size+1];
        this.length = size+1;
    }


    @Override
    public boolean insert(int data) {
        if(isFull())
            return false;
        heap[++size] = data;
        heapify();
        return true;
    }

    @Override
    public void heapify() {
        int i = size;
        while (i > 0){
            int parent = i/2;
            if(parent > 0 &&  heap[i]> heap[parent]){
                Heap.swap(heap,i,parent);
                i = parent;
            }
            else
                break;
        }
    }
 // [1,2,3,4,5,6,7,8,9,10]
    public static  void heapiFy(int[] arr, int size) {
        while (size>=0){
            int parent = (size-1)/2;
            if(parent >= 0 && arr[parent] < arr[size]){
                Heap.swap(arr, parent,size);
                size = parent;
            }
            else
                break;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == length-1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        for (int i = 1; i <= size; i++)
            System.out.print(heap[i] +", ");
        System.out.println();
    }

    @Override
    public int peek() {
        if(isEmpty())
            return -1;
        return heap[1];
    }

    @Override
    public int remove() {
        if(isEmpty())
            return -1;
        int data = heap[1];
        int index =1;
        reverseHeapiFy();
        return data;
    }

    @Override
    public int pop() {
        return remove();
    }

    @Override
    public int[] heapSort(int[] array) {
        int[] sortArray = new int[array.length+1];
        MaxHeap m = new MaxHeap(sortArray.length);
        for(int i: array)
            m.insert(i);
        for(int i= 1 ; i<sortArray.length;i++){
            array[i-1] = m.remove();
        }

        return array;

    }
    public static int[] heapSort2(int[] array) {
        for(int i= array.length-1 ; i >= 0; i--){
           heapiFy(array,i);
        }
        return array;

    }

    @Override
    public void reverseHeapiFy() {
        int index = 1;
        int targetIndex = index;
        Heap.swap(heap,index,size--);
        while(index <= size){
            int leftChild = index*2;
            int rightChild = index*2+1;
            if(leftChild <= size && heap[targetIndex] < heap[leftChild])
                targetIndex = leftChild;
            if(rightChild <= size && heap[targetIndex] < heap[rightChild])
                targetIndex = rightChild;
            if (index != targetIndex){
                Heap.swap(heap,index,targetIndex);
                index = targetIndex;
            }
            else
                break;
        }
    }


    public static void main(String[] args) {
//        Heap h = new MaxHeap(10);
//        int[] a = {1,200,30,50,2,40,500,44};
//        var b  = heapSort2(a);
//        for (int i: b)
//            System.out.print(i+", ");
//
//        h.insert(2);
//        h.insert(6);
//        h.insert(8);
//        h.insert(3);
//        h.insert(7);
//
//        h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.remove());
//        //h.print();
//        System.out.println(h.peek());
        PriorityQueue<Integer> mx
                = new PriorityQueue<Integer>(
                        //Collections.reverseOrder()
                );
//        Queue<Integer> q = new ArrayDeque<>();
        mx.add(10);
        mx.add(20);

        mx.add(5);

        mx.add(0);
        mx.add(2);
        mx.add(100);
        mx.add(18);
        mx.add(190);
        System.out.println(mx.remove(100));
//        System.out.println(mx.poll());
//        System.out.println(mx.peek());
//        while(!mx.isEmpty()){
//            System.out.println(mx.poll());
//        }
        var a  = mx.toArray();
        for(Object b : a){
            System.out.print(b+", ");
        }
        for (var i : mx.toArray())
            System.out.println(i);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(1);
        System.out.println(queue.size());

    }
}
