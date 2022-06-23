package DsaCodeWithMosh;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node(){
        super();
    }
}

public class LinkedListCustom {
    Node head  = null;
   int size = 0;
   Node tail = null;

   public void addFirst(int data){
       if (head == null){
           this.head = this.tail = new Node(data);
           size++;
       }

       else {
           Node temp = new Node(data);
           temp.next = head;
           head = temp;
           size++;
       }
   }

   public void addLast(int data){
       if(tail == null) {
           this.head = this.tail = new Node(data);
           size++;
       }
       else {
           Node temp = new Node(data);
           tail.next = temp;
           tail = temp;
           size++;
       }
   }

   public boolean addAtIndex(int index, int data){// index starts from 1
       if(index > size+1 || index < 1)
           return false;
       if(index == 1) {
           addFirst(data);
           size++;
           return true;
       }
       if (index == size+1){
           addLast(data);
           size++;
           return true;
       }
       else{
           int count = 1;
           Node temp = head;
           while(count+1 != index){
               temp = temp.next;
               count++;
           }
           Node node  = new Node(data);
           node.next = temp.next;
           temp.next = node;
           return true;
       }
   }

   public boolean deleteFirst(){
       if (size < 1)
           return false;
       head = head.next;
       size--;
       return true;
   }

    public boolean deleteLast(){
        if (size < 1)
            return false;
        Node temp = head;
        while (temp.next.next != null){
           temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return true;
    }

    public boolean deleteAtIndex(int index){
       if(index < 1 || index > size)
           return false;
       if(index == 1)
           return deleteFirst();
       if (index == size)
           return deleteLast();
        int count = 0;
        Node temp = head;
        while (temp != null){
             if(count+1 == index){
                temp.next = temp.next.next;
                return true;
            }
            count++;
            temp = temp.next;
        }
        size--;
        return false;
    }
   public void traverse(Node node){
       Node temp = node;
       while(temp != null){
           System.out.print(temp.data +", ");
           temp = temp.next;
       }
       System.out.println();
   }

   public Node reverse(){
       Node current = head;
       Node next = null;
       Node previous = null;
       while( current != null){
           next = current.next;
           current.next = previous;
            previous = current;
            current = next;
       }
       head = previous;
       return previous;
   }

   public Node reverseR(){
       Node temp = head;
       head = reverseR(temp, null);
       return head;
   }

   public Node reverseR(Node head, Node pre){
       if(head == null)
           return pre;
       Node forword = head.next;
       head.next = pre;
       return reverseR(forword, head);
   }


    public static void main(String[] args) {
        LinkedListCustom list = new LinkedListCustom();
        list.addLast(77);
        list.addFirst(55);
        list.addFirst(54);
        list.addFirst(53);
        list.addFirst(52);
        //list.traverse();
        list.addAtIndex(1,90);
        //list.traverse();
        //list.deleteAtIndex(7);
       // System.out.println(list.size);
        list.traverse(list.head);
        //list.reverseR();
        list.traverse(list.reverseR());

    }
}