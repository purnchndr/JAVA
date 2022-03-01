package Graph;

import java.util.ArrayList;
import java.util.HashMap;

class Edges{
    ArrayList<Pair> arr =  new ArrayList<>();
    int size = 0;
    static class Pair{
        String edge;
        int weight;
        public Pair(String edge, int weight){
            this.edge = edge;
            this.weight = weight;
        }
    }

    public void addEdge(String edge, int weight){
        arr.add(new Pair(edge, weight));
        size++;
    }
}

public class MyGraphW {
    int size;

    HashMap<String,Edges> map;
    public MyGraphW(int size){
        this.size = size;
        map = new HashMap<>(size);
    }
    public boolean addEdge(String node, String edge, int weight){
        if(map.containsKey(node)){
            var list = map.get(node);
            list.addEdge(edge,weight);
        }
        else{
            Edges list = new Edges();
            list.addEdge(edge,weight);
            map.put(node,list);
        }
      return true;
    }
    public void print(){
        for(var i : map.entrySet()){
            var a = i.getKey();
            var b = i.getValue();
            System.out.print( "Edge: "+a);
            for (int j =0; j< b.size;j++){
                System.out.print( " -> "+b.arr.get(j).edge);
                System.out.print( " ->: "+b.arr.get(j).weight);
            }
            System.out.println();
        }
    }

  public static void main(String[] args) {
    MyGraphW graphW = new MyGraphW(10);
    graphW.addEdge("A","C",10);
      graphW.addEdge("N","D",10);
      graphW.addEdge("M","E",10);
      graphW.addEdge("G","H",10);
      graphW.addEdge("D","F",10);
      graphW.addEdge("K","H",10);
      graphW.addEdge("L","C",10);
      graphW.addEdge("A","B",10);
      graphW.addEdge("A","N",10);
      graphW.addEdge("A","M",10);
      graphW.print();

  }
}
