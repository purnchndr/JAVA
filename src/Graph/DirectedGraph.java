package Graph;

import java.net.Inet4Address;
import java.util.*;

public class DirectedGraph implements Graph {


    public boolean addEdge(int node, int vertices) {
        if(graph.containsKey(node)){
            ArrayList<Integer> list = graph.get(node);
            list.add(vertices);
            graph.put(node, list);
        }
        else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(vertices);
            graph.put(node,list);
        }
        if(!graph.containsKey(vertices))
            graph.put(vertices, new ArrayList<Integer>());
        return true;
    }

    @Override
    public boolean removeEdge(int node, int adjacent) {
        ArrayList<Integer> list;
        if(graph.containsKey(node)){
            list = graph.get(node);
        }
        else{
            return false;
        }
        list.remove(adjacent);
        graph.put(node, list);
        return true;
    }


    @Override
    public void BFS(int node) {
      HashMap<Integer,Boolean> visited = new HashMap<>();
        for(var i: graph.keySet()){
           visited.put(i,false);
        }
        Queue<Integer> q = new LinkedList<>();
        BFSHelper(node, q,visited);
        q.add(node);
        for(int i : graph.keySet()) {
            if (!visited.get(i))
                BFSHelper(i, q, visited);
        }
    }

    public void BFSHelper(int node, Queue<Integer> q,HashMap<Integer,Boolean> visited){
        q.add(node);
        while(!q.isEmpty()){
           int element =  q.remove();
           if(!visited.get(element)){
               System.out.print(element+", ");
               visited.put(element,true);
               q.addAll(graph.get(element));
           }
        }
    }



    @Override
    public void DFS(int node) {
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(var i: graph.keySet())
            visited.put(i,false);

        DFSHelper( visited, node);
        for(int i : graph.keySet())
            if(!visited.get(i))
                DFSHelper( visited, i);
    }
    public void DFSHelper(HashMap<Integer,Boolean> visited,int node){
        if(visited.get(node))
            return;
        for(int i : graph.get(node))
            if(!visited.get(i)) {
                System.out.print(i + ", ");
                visited.put(i, true);
                DFSHelper(visited, i);

            }
    }



    @Override
    public int size() {
        return graph.size();
    }

    public static void main(String[] args) {
        Graph graph = new DirectedGraph();
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(10,20);

        System.out.println(graph.size());
        graph.BFS(3);
        System.out.println("______________________________");
        graph.DFS(3);

    }
}
