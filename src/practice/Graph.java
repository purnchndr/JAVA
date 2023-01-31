package practice;

import java.util.*;

class Graph {
	private int size;
	ArrayList<ArrayList<Integer>> graph;

	public Graph(int size) {
		this.size = size;
		graph = new ArrayList<>();
		for (int i = 0; i < size; i++)
			graph.add(new ArrayList<Integer>());
	}

	public void addEdge(int V, int E) {
		graph.get(V).add(E);
		graph.get(E).add(V);
	}

	public void print() {
		int i = 0;
		for (var list : graph) {
			System.out.print(i++ + " :: ");
			for (int item : list)
				System.out.print(item + ", ");

			System.out.println();
		}
	}

	public static void main(String args[]) {
		GraphWt g = new GraphWt();
		g.addEdge("angul", "dh", 40, true);
		g.addEdge("angul", "cutak", 30, true);
		g.addEdge("cutak", "bhuvneshvar", 10, false);
		g.addEdge("bhuvneshvar", "angul", 80, true);
		
		//g.BFS("angul");
		g.print();
		//System.out.println(g.graph);

	}

}

class GraphWt {
	private HashMap<String, ArrayList<City>> graph = new HashMap<>();

	private class City {
		String name;
		int distance;

		private City(String name, int dis) {
			this.name = name;
			this.distance = dis;
		}
	}

	public void BFS(String name) {
		Set<String> vis = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		if (!graph.containsKey(name)) {
			System.out.println("City is not present");
			return;
		}
		
		queue.add(name);
		while (!queue.isEmpty()) {
			var city = queue.poll();
			vis.add(city);
			System.out.print(city + " : ");
			ArrayList<City> list = graph.get(city);
			if (list != null) {
				for (City c : list) {
					if (!vis.contains(c.name)) {
						queue.add(c.name);
						//vis.add(c.name);
						
					}
					System.out.print(c.name + " -> " + c.distance);
				}
			}
			System.out.println();
		}
	}

	public void addEdge(String V, String E, int dis, boolean isDirected) {
		if (graph.get(V) == null)
			graph.put(V, new ArrayList<City>());
		graph.get(V).add(new City(E, dis));
		if (isDirected) {
			if (graph.get(E) == null)
				graph.put(E, new ArrayList<City>());
			graph.get(E).add(new City(V, dis));
		}
	}

	public void print() {
		for (var i : graph.entrySet()) {
			System.out.print(i.getKey() + " :: ");
			for (City c : i.getValue())
				System.out.print(c.name + " --> " + c.distance);
			System.out.println();
		}
	}

}
