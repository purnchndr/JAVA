package Graph;

public class MyGraphMatrix {
    int size;
    boolean[][] matrix;
    public MyGraphMatrix(int size){
        this.size = size;
        matrix = new boolean[size][size];
    }
    public void addEdge(int vertex, int node){
        matrix[vertex][node] = true;
        matrix[node][vertex] = true;
    }
    public void print(){
        for (int i =0; i< size;i++){
            System.out.print(i +"::");
            for (int j = 0; j < size;j++)
                if(matrix[i][j])
            System.out.print(" ->"+j);
      System.out.println();
        }
    }

  public static void main(String[] args) {
    MyGraphMatrix graphMatrix = new MyGraphMatrix(10);
    graphMatrix.addEdge(1,5);
      graphMatrix.addEdge(1,3);
      graphMatrix.addEdge(1,4);
      graphMatrix.addEdge(1,6);
      graphMatrix.addEdge(1,7);
      graphMatrix.addEdge(1,8);
      graphMatrix.addEdge(4,3);
      graphMatrix.addEdge(5,3);
      graphMatrix.addEdge(6,3);
      graphMatrix.addEdge(7,3);
    graphMatrix.print();
  }
}
