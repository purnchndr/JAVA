package DataStructures;

public class QueueCustom {
    int size = 0;
    int front = 0;
    int rear = 0;
    int length ;
    int[] array;
    public QueueCustom(int size){
        this.length = size;
        array = new int[size];
    }

    public void enqueue(int data){
        if(this.full()){
            throw new IllegalStateException("Queue is full");
        }
        array[rear%length] = data;
        rear++;
        size++;
    }
    public int dequeue(){
        if(this.empty()){
            throw new IllegalStateException("Queue is empty");
        }
        int data = array[front%length];
        front++;
        size--;
        return data;
    }
    public int peek(){
        if(this.empty()){
            throw new IllegalStateException("Queue is empty");
        }
        return array[front%length];
    }
    public int size(){
        return this.size;
    }


    public boolean empty(){
        return size == 0;
    }
    public boolean full(){
        return size == length;
    }
    public void print(){
        int n = front;
       for (int i = 0; i < size; i++){
           System.out.print(array[n%length]+ ", ");
           n++;
       }
        System.out.println();
    }
    public void reverseR(){
        if(this.empty())
            return;
        int top = this.dequeue();
        reverseR();
        this.enqueue(top);
    }
    public void pushBack(int data){
        this.enqueue(data);
    }

    public void pushFront(int data){
        if(full())
            throw new IllegalStateException("queue is full");
        front = front -1;
        if(front < 0)
            front = length-1;
        array[front] = data;
        size++;

    }
    public int popBack(){
        if(empty())
            throw new IllegalStateException("queue is empty");
        int data = array[rear];
        rear = rear -1;
        if(rear < 0)
            rear = length-1;
        size--;
        return data;

    }

    public int polBack(){
       return this.dequeue();
    }

    public int peekFront(){
        return peek();
    }

    public int peekBack(){
        return array[front%length];
    }


    public static void main(String[] args) {
        QueueCustom q = new QueueCustom(5);

        q.pushFront(5);
        q.pushFront(10);

        q.pushFront(50);

        q.enqueue(10);
        q.enqueue(20);
        q.print();
        q.popBack();
        q.popBack();
        q.print();
        q.enqueue(100);
        q.print();
        System.out.println(q.peek());
        System.out.println(q.peekBack());
        System.out.println(q.size());


    }
}
