package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class MyGraphUWB {
     int size;
    ArrayList[] list;

    public MyGraphUWB(int size){
        this.size = size;
        list = new ArrayList[size];
        for(int i = 0; i < size; i++)
            list[i]  = new ArrayList<Integer>();
    }

    public boolean addEdge(int index, int edge){
        if(index >= size || edge >= size)
            return false;
        list[index].add(edge);
        list[edge].add(index);
        return true;
    }

    public void printGraph(){
        int i = 0;
        for (ArrayList<Integer> array : list){
      System.out.print(i++ +" ::> ");
            for (int edge: array){
            System.out.print(edge+"->");
            }
      System.out.println();
        }
    }

  

  public static void main(String[] args) {
    MyGraphUWB graph = new MyGraphUWB(10);
    graph.addEdge(0,1);
      var aa = graph.addEdge(2,5);
      graph.addEdge(4,9);
      graph.addEdge(5,8);
      graph.addEdge(7,4);
      graph.addEdge(8,7);
      graph.addEdge(9,5);
      graph.addEdge(3,6);
      graph.addEdge(2,9);
      graph.printGraph();
  }
}
