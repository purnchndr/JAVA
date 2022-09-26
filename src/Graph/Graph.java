package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public interface Graph {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    public boolean addEdge(int node, int vertices );
    public boolean removeEdge(int node, int adjacent);
    public void BFS(int node);
    public  void DFS(int node);
    public int size();
}
