package CodingBlocksCrucxJAVA.Queue;

public class CircularQueue{
    int[] arr;
    int size;
    int count = 0;
    int front =0;
    int rear = 0;
    final int DEFAULT_CAPACITY = 10;
    public CircularQueue(){
        arr = new int[size];
        this.size = size;
    }
    public CircularQueue(int size){
        arr = new int[size];
        this.size = size;
    }
    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == size;
    }

    public int size(){
        return count;
    }

    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException("Queue is full");
        arr[front%size] = item;
        front++;
        count++;
    }
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
        int res =  arr[rear%size];
        arr[rear%size] = 0;
        rear++;
        count--;
        return res;
    }

  public static void main(String[] args) {
    CircularQueue q = new CircularQueue(3);
    q.enqueue(10);
    System.out.println(q.isFull());
      System.out.println(q.isEmpty());
      q.enqueue(20);

      q.enqueue(30);
      System.out.println(q.isFull());
      System.out.println(q.isEmpty());

    System.out.println(  q.dequeue());
      System.out.println(  q.dequeue());
      System.out.println(  q.dequeue());
      System.out.println(q.isFull());
      System.out.println(q.isEmpty());
      q.enqueue(90);
      System.out.println(  q.dequeue());


  }
}
