package Heap;

import java.util.ArrayList;

public class MyMinHeap {
    int lastNode = 0;
    ArrayList<Integer> array;
    public MyMinHeap(){
        array = new ArrayList<>();
    }

    public boolean add(int item){
        array.add(lastNode,item);
        int index = lastNode;
        while(array.get(index) > array.get(index-1)/2){
           int parent = (index-1)/2;
           int temp = array.get(lastNode);
           array.set(lastNode,array.get(parent));
           array.set(parent,lastNode);
           index = parent;
       }
       lastNode++;
       return true;
    }

  public static void main(String[] args) {
    MyMinHeap heap = new MyMinHeap();
    heap.add(10);
    heap.add(9);
      heap.add(8);
      heap.add(7);
      heap.add(6);
      heap.add(5);
    System.out.println(heap.array);
  }
}
