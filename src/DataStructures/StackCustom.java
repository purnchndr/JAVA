package DataStructures;

public class StackCustom {
    int size = -1;
    int[] stack;

    public StackCustom(int size) {
        stack = new int[size];
    }

    public boolean push(int data) {
        if (isFull())
            throw new IllegalStateException("Stack is Full");
        stack[++size] = data;
        //System.out.println("Inserting " + data + " at index " + size);
        return true;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is Empty");
        //System.out.println("Top data is " + stack[size]);
        return stack[size];
    }

    public int getSize() {
        System.out.println("Size of Stack is " + (size + 1));
        return size + 1;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        //System.out.println("Deleting at index " + size + " and data is " + stack[size]);
        return stack[size--];
    }

    public void print() {
        for (int i = 0; i <= size; i++)
            System.out.print(stack[i] + ", ");
        System.out.println();
    }

    public int search(int data) {
        for (int i = 0; i <= size; i++)
            if (stack[i] == data)
                return i;
        return -1;
    }
    public int elementAt(int index) {
        if(index > size || index < 0)
            return -1;
        return stack[index];
    }


    public void pushAtBottom(int data) {
        if (isFull())
            throw new IllegalStateException("Stack is full");

        for (int i = ++size; i > 0; i--) {
            stack[i] = stack[i-1];
        }
        stack[0] = data;
    }

    public void reverse(){
        int start = 0;
        int end = size;
        while(start <= end){
            int temp = stack[start];
            stack[start++] = stack[end];
            stack[end--] = temp;
        }
    }

    public void pushAtBottomR(int data){
        if(this.isEmpty()){
            this.push(data);
            return;
        }
        int cData = this.pop();
        pushAtBottom(data);
        this.push(cData);
    }

    public void reverseR(){
        if(this.isEmpty())
            return;
        int data = this.pop();
        reverseR();
        System.out.println(data);
        this.pushAtBottom(data);
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public boolean isFull() {
        return size == stack.length - 1;
    }

    public static void main(String[] args) {

        StackCustom s = new StackCustom(50);
        //System.out.println(s.getSize());
        s.push(10);
        s.push(20);
        s.push(30);
       // System.out.println(s.pop());
        s.push(10);
        s.push(20);
        //System.out.println(s.contains(10));
       // s.pop();
        s.push(50);
//        s.pop();
//        s.pop();
//        System.out.println(s.getSize());
//        s.print();
        s.pushAtBottomR(100);
        s.pushAtBottomR(200);
        s.pushAtBottomR(300);
        System.out.println(s.getSize());
        s.print();
        s.reverse();
        s.print();
        System.out.println(s.elementAt(8));

//        System.out.println("before");
//        s.print();
//        s.reverseR();
//        System.out.println("after");
        s.print();
    }
}

//        StackCustome s = new StackCustome(5);
//        System.out.println(s.getSize());
//        s.push(10);
//        s.push(20);
//
//        s.push(30);
//        System.out.println(s.pop());
//        s.push(10);
//        s.push(20);
//        System.out.println(s.contains(10));
//
//        s.pop();
//        s.push(50);
//        s.pop();
//        s.pop();
//        System.out.println(s.getSize());
//        s.print();


//        Stack<Integer> st = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter no of Inputs");
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter "+(i+1)+"th Element");
//            st.push(s.nextInt());
//        }
////        while(!st.isEmpty()){
////            System.out.println(st.pop());
////        }
//
//
////        while(st.size() != size){
////            st.pop();
////       }
//        int mid = (st.size()/2)+1;
//        System.out.println(st.toString());
//        System.out.println(getMiddle(st, st.size(), mid));
//
//    }
//
//    public static int getMiddle(Stack<Integer> st, int size, int mid){
//        if(size == 1 || st == null)
//            return -1;
//        if (size == mid)
//            return st.peek();
//        int data  = st.pop();
//        int rs = getMiddle(st, size-1, mid);
//        st.push(data);
//        return rs;
//    }


