package DataStructures;

import java.util.ArrayList;

public class LinkedListGen<T> {

    private static class LLNode<T>{
        T data;
        LLNode<T> next;
        public LLNode(T data){
            this.data = data;
        }
    }

   LLNode<T> first = null;
   LLNode<T> last = null;
   private int size = 0;

   public boolean isEmpty(){
       return size == 0;
   }

    public int size(){
        return this.size;
    }

   public void add(T data){
       var node  = new LLNode<>(data);
       if(isEmpty())
           first = last = node;

       else{
           last.next = node;
           last = last.next;
       }
       size++;
   }
    public void addFirst(T data){
        var node  = new LLNode<>(data);
        if(isEmpty())
            first = last = node;

        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public boolean removeFirst(){
       if(isEmpty()) return false;
       else if(first.next == null){
           first = last = null;
           size--;
           return true;
       }
       else{
           first = first.next;
           size--;
           return true;
       }
    }


    public boolean removeLast(){
        if(isEmpty()) return false;
        else if(first.next == null){
            first = last = null;
            size--;
            return true;
        }
        else{
            var node = first;
            while(node.next.next != null)
                node = node.next;
            last = node;
            last.next = null;
            size--;
            return true;
        }
    }

    public void reverse(){
       if(this.size < 2)  return;
       LLNode<T> pre = null;
       LLNode<T> curr = first;
       LLNode<T> next = first.next;
       last = first;
       while (curr != null){
           curr.next = pre;
           pre = curr;
           curr = next;
           if(curr != null) next = next.next;
       }
       first = pre;
    }


    public ArrayList<T> toArray(){
       ArrayList<T> list = new ArrayList<>(size);
       var node = first;
       while(node != null){
           list.add(node.data);
           node = node.next;
       }
       return list;
    }

    public T findKthFromLast(int k){
        if(isEmpty() || k < 1)
            throw new IllegalStateException("List is Empty");
        LLNode<T> forward = first;
        LLNode<T> back = first;
        for(int i = 1; i <= k-1; i++){
            if(forward.next == null)
                throw new IllegalStateException("Index is out of bound");
            forward = forward.next;
        }

        while (forward.next != null){
            forward = forward.next;
            back = back.next;
        }
      return back.data;
    }



    public void addLast(T data){
       var node  = new LLNode<>(data);
        if(isEmpty())
            first = last = node;

        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public int indexOf(T data){
        var node  = first;
        int index = 0;
        while (node != null) {
            if (node.data == data)
                return index;
            index++;
            node = node.next;
        }
        return -1;
    }

    public boolean contains(T data){
        return this.indexOf(data) != -1;
    }

   @Override
   public String toString(){
       StringBuilder str = new StringBuilder();
       str.append("[");
       LLNode<T> temp = first;
       while(temp != null){
           str.append(temp.data).append(",");
           temp = temp.next;
       }
       str.append("]");
       return str.toString();
   }

   public T getMiddle(){
       LLNode<T> fast = first;
       LLNode<T> slow = first;
       if(first == null)
           return null;
       else if(first.next == null)
           return first.data;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow.data;
   }

   public boolean detectLoop(){
       if(isEmpty())
           return false;
       LLNode<T> fast = first;
       LLNode<T> slow = first;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast)
               return true;
       }
       return false;
   }


    public static void main(String[] args) {
        LinkedListGen<Object> list = new LinkedListGen<>();
        list.add(90);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(110);
        list.add(120);
        list.add(600);

       // list.add("jkfahfakjfhakj");
       // list.addFirst(6);
        //list.addLast(10);
//        System.out.println(list.indexOf("jkfahfakjfhakj"));
//        System.out.println(list.contains(90));
//        System.out.println(list);
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeLast());
//
        System.out.println(list.toArray());
//        list.reverse();
        list.last.next = list.first;
        //System.out.println(list);
       System.out.println(list.detectLoop());
    }

}
