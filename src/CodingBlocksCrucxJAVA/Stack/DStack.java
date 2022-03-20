package CodingBlocksCrucxJAVA.Stack;

public class DStack extends StackUsingArray{
    public DStack(int item){
        super(item);
    }

    public void push(int item){
        if(size() == stack.length)
            increment();
        stack[++top]  = item;
    }
    private void increment(){
        int[] ar = new int[2*stack.length];
        System.arraycopy(stack, 0, ar, 0, stack.length);
        stack = ar;
    }
}
