package CodingBlocksCrucxJAVA.Stack;

public class StackUsingArray{
    protected int[] stack;
    protected int  top =-1;
   // final int capacity = 10;

    public StackUsingArray(){
        this(10);
    }

    public StackUsingArray(int length) {
        stack = new int[length];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void push(int item){
        if(size() == stack.length)
            return;
        stack[++top]  = item;
    }
    public int pop(){
        if(size() == 0)
            throw new IllegalStateException();
        return stack[top--] ;
    }

    public int peek(){
        if(size() == 0)
            throw new IllegalStateException();
        return stack[top];
    }

    public static  void copyStacksReverse(StackUsingArray stack1, StackUsingArray stack2){
        int n = stack1.size();
        while (n>0)
            stack2.push(stack1.stack[--n]);
    }

    public static  void copyStacks(StackUsingArray stack1, StackUsingArray stack2){
        int n = stack1.size();
        int s =0;
        while (s<n)
            stack2.push(stack1.stack[s++]);
    }

    public static void reverse(StackUsingArray stack1, StackUsingArray stack2){
        copyStacks(stack1,stack2);
        reverseStack(stack1,stack2,stack1.size());

    }

    private static  void reverseStack(StackUsingArray stack1, StackUsingArray stack2, int size) {
        if (size == 0)
            return;
        int item = stack1.pop();
        reverseStack(stack1,stack2,size-1);
        stack2.push(item);
    }

  public void print() {
    for (int i = 0; i < this.size(); i++)
        System.out.print(this.stack[i] + "; ");
    System.out.println();
    }


}
