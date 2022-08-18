package DataStructures.graph;


import java.util.*;

class GraphNode{
    int data;
    int weight;
    public GraphNode(int data, int weight){
        this.data = data;
        this.weight = weight;
    }

}
public class GraphUnDirected {
    HashMap<Integer, List<GraphNode>> graph = new HashMap<>();
    int size = 0;
    //GraphNode ref;
    public void addEdge(int node, int data,int weight){
        if(graph.containsKey(node))
            graph.get(node).add(new GraphNode(data,weight));
        else{
            List<GraphNode> list = new ArrayList<>();
            list.add(new GraphNode(data,weight));
            graph.put(node, list);
        }
        if(graph.containsKey(data))
            graph.get(data).add(new GraphNode(node,weight));
        else{
            List<GraphNode> list = new ArrayList<>();
            list.add(new GraphNode(node,weight));
            graph.put(data, list);
        }
        size++;
    }

    public void print(){
        for(var m : graph.entrySet()){
            System.out.print(m.getKey()+" --> ");
            for (var n: m.getValue()){

                System.out.print("("+n.data+","+n.weight+"), ");
            }
            System.out.println();
        }
    }

    public HashMap<Integer,Boolean> getVisitedList(){
        HashMap<Integer,Boolean> visited = new HashMap<>(size);
        for(int i : graph.keySet())
            visited.put(i,false);
        return visited;
    }

    public boolean deleteNode(int data){
        if(!graph.containsKey(data))
            return false;
        else{
            var current = graph.get(data);
            for(var i:  current){
                graph.get(i.data);
            }
            graph.remove(data);
        }
        return false;
    }

    public void BreathFirstSearch(int node,HashMap<Integer,Boolean> visited){
        Queue<Integer> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()){
            int currentNode = nodeQueue.remove();
            //do operations here
            if (!visited.get(currentNode)) {
                System.out.print(currentNode+", ");
                visited.put(currentNode,true);
                var currentList = graph.get(currentNode);
                for (GraphNode graphNode : currentList) {
                    nodeQueue.add(graphNode.data);
                }
            }

        }
    }

    public void BFS(){
       var visited = getVisitedList();
       for (int currentNode : visited.keySet()){
           if(!visited.get(currentNode)){
                this.BreathFirstSearch(currentNode,visited);
           }
       }
    }

    public void DFS(){
        var visited  = getVisitedList();
        for (int currentNode : visited.keySet())
            if(!visited.get(currentNode))
                depthFirstSearch(currentNode,visited);
    }

    public void  depthFirstSearch(int currentNode, HashMap<Integer,Boolean> visited){
        if(visited.get(currentNode))
            return;
            //do operations here
        System.out.print(currentNode+", ");
        visited.put(currentNode,true);
        for (var i : graph.get(currentNode))
            depthFirstSearch(i.data,visited);
    }


    public static void main(String[] args) {

        GraphUnDirected g = new GraphUnDirected();
        g.addEdge(3,6,2);
        g.addEdge(3,7,2);
        g.addEdge(4,8,0);
        g.addEdge(9,6,67);
        g.addEdge(9,7,100);
        g.addEdge(1,2,10);
        g.addEdge(1,3,20);
        g.addEdge(1,4,5);
        g.addEdge(1,7,8);
        g.addEdge(2,5,8);

        g.addEdge(10,11,2);
        g.addEdge(10,20,2);
        g.addEdge(30,40,0);
        g.addEdge(100,200,67);
        //g.addEdge(9,7,100);
        //g.addEdge(20,30,200);
        // System.out.println(g.graph);
        g.print();
        g.BFS();
        g.DFS();
    }

}
