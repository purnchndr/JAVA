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

    public void reverse() {
        LLNode<T> pre = null;
        LLNode<T> curr = first;
        LLNode<T> next = null;
        last = first;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        first = pre;
    }

    public void reverseInKPartition(int k){
       LLNode<T> node = first;
       while (node != null){
           LLNode<T> pre = null;
           LLNode<T> curr = node;
           LLNode<T> next = null;
           int count = 0;
           while (curr != null && count != k){
               next = curr.next;
               curr.next = pre;
               pre = curr;
               curr = next;
           }
           node = curr;
       }
    }

    public LLNode<T> reverseRH(LLNode<T> head){
       if(head == null || head.next == null)
           return head;
       LLNode<T> node = reverseRH(head.next);

       node.next = head;
       head.next = head;
       return node;
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
           if(temp.next == null)
               str.append(temp.data);
           else
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

   public  void printKthFromLast(int k){
       LLNode<T> node = first;
       while(node != null && --k != 0)
           node = node.next;
       LLNode<T> lazyPointer = first;
       while(node != null && node.next != null){
           lazyPointer = lazyPointer.next;
           node = node.next;
       }
       System.out.println(lazyPointer.data);

   }
    public  int printKthFromLast(LLNode<T> node, int k){
       if(node == null){
           return 0;
       }
       int ans = printKthFromLast( node.next, k)+1;
       if(ans == k)
           System.out.println(node.data);
       return ans;
    }

    public LLNode<T> detectLoopL(){
       LLNode<T> fast= first, slow= first;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(fast == slow){
               slow = first;
               while(fast != slow){
                   fast = fast.next;
                   slow = slow.next;
                   if(fast.next == slow.next){
                       fast.next = null;
                       return slow.next;
                   }
               }
               return fast;
           }
       }
        return null;
    }


    public static void main(String[] args) {
        LinkedListGen<Integer> list = new LinkedListGen<>();
        list.add(90);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(110);
        LLNode<Integer> node = list.last;
        list.add(120);
        list.add(600);
        list.add(90);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(110);
        list.last.next = node;
        var a = list.detectLoopL();
        System.out.println(a.data);
        //a.next = null;
//        var b = list.detectLoop();
        //System.out.println(b);
//        //list.printKthFromLast(list.first, 1);
        System.out.println(list);
//        System.out.println((char)65);
    }

    public int findMiddle(){
        LLNode<T> slow = first;
        LLNode<T> fast = first;
        int count = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        return count;
    }
}
