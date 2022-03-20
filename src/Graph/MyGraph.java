package Graph;

import java.util.ArrayList;

public class MyGraph {
    ArrayList<ArrayList<Integer>>graph;
    int size;
    public MyGraph(int size){
        graph = new ArrayList<>(size);
        for (int i =0; i<size; i++){
            graph.add(new ArrayList<>());
        }
        this.size = size;
    }

    public void addEdge(int edge1, int edge2){
        if(edge1 >= size || edge2 >= size)
            return;
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }

    public void print(){
        int k =0;
    for (ArrayList<Integer> i : graph) {
      System.out.print(k++);
        System.out.print(" : ");
      for (Integer j : i)
          System.out.print(j+" ->");
      System.out.println("End");
    }
    }

  public static void main(String[] args) {
MyGraph graph = new MyGraph(10);
graph.addEdge(1,2);
      graph.addEdge(1,4);
      graph.addEdge(3,5);
      graph.addEdge(8,6);
      graph.addEdge(9,7);
      graph.addEdge(1,8);
      graph.addEdge(2,9);
      graph.addEdge(2,4);
      graph.addEdge(5,7);
      graph.print();


  }
}
