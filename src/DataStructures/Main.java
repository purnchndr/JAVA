package DataStructures;

import DataStructures.StackCustom;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Heap heap = new MaxHeap(10);
        heap.insert(10);
//        heap.insert(20);
//        heap.insert(4);
//        heap.insert(440);
//        heap.insert(1);
        System.out.println(heap.getSize());
        heap.print();
        while(!heap.isEmpty())
            System.out.println(heap.remove());
        System.out.println(heap.getSize());
        heap.print();
    }

}
