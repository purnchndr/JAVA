package DataStructures;
import java.util.ArrayList;
import java.util.Arrays;

public class StackGeneric<T> {
    ArrayList<T> stack;
    int size = -1;
    int length;
    final static int DEFAULT_CAPACITY = 10;

    public StackGeneric(int size){
        stack = new ArrayList<>(size);
        length = size;
    }
    public StackGeneric(){

        stack = new ArrayList<>(DEFAULT_CAPACITY);
        length = DEFAULT_CAPACITY;
    }

    public boolean isEmpty(){
        return size == -1;
    }

    public boolean isFull(){
        return size == length-1;
    }

    public void push(T data){
        if(isFull())
            throw new StackOverflowError("Stack is Full");
        stack.add(++size,data);
    }

    public T peek(){
        if(isEmpty())
            throw new IllegalStateException("Stack is Empty");
        return stack.get(size);
    }

    public T  pop(){
        if(isEmpty())
            throw new IllegalStateException("Stack is Empty");
        return stack.get(size--);
    }

    public int size(){
        return size+1;
    }

    @Override
    public String toString(){
        StringBuild string  = new StringBuild();
        string.append("[");
        for( int i = size()-1; i >= 0; i-- ){
            string.append(stack.get(i).toString());
            if(i != 0 )string.append(",");
        }
        string.append("]");
        return string.toString();
    }

    public void insertAtBottom(T data){
        if(this.isEmpty()){
            this.push(data);
            return;
        }
        T tempData = this.pop();
        insertAtBottom(data);
        this.push(tempData);
    }

    public void reverse(){

    }


    public static void main(String[] args) {
        StackGeneric<Integer> stack = new StackGeneric<>();
        stack.push(90);stack.push(80);stack.push(70);


        stack.push(60);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        stack.insertAtBottom(10000);
        System.out.println(stack);
    }

}
