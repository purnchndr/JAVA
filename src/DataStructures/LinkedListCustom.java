package DataStructures;

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

   public static Node merge(Node n1, Node n2){
       if (n1 == null || n2 == null)
           return null;
       Node node1 = n1;
       Node node2 = n2;
       Node res;
       if(node1.data < node2.data) {
           res = new Node(node1.data);
           node1 = node1.next;
       }
       else{
           res = new Node(node2.data);
           node2 = node2.next;
       }
       Node ans = res;
       while(node1 != null && node2 != null){
           if(node1.data < node2.data) {
               res.next = new Node(node1.data);
               node1 = node1.next;
               res = res.next;
           }
           else{
               res.next = new Node(node2.data);
               node2 = node2.next;
               res = res.next;
           }
       }
       while(node1 != null){
           res.next = new Node(node1.data);
           node1 = node1.next;
           res = res.next;
       }
       while(node2 != null){
           res.next = new Node(node2.data);
           node2 = node2.next;
           res = res.next;
       }
       return ans;
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
        if (head.next == null) {
            head = null;
            return true;
        }
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

    public static Node clone(Node node){
       if (node == null)
           return null;
       Node root = new Node();
       Node res = root;
       Node temp = node;
       root.data = node.data;
       temp = temp.next;
       while(temp != null){
          root.next = new Node(temp.data);
          temp = temp.next;
          root = root.next;
       }
       return res;
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
//        LinkedListCustom list = new LinkedListCustom();
//        list.addLast(77);
//        list.addFirst(55);
//        list.addFirst(54);
//        list.addFirst(53);
//        list.addFirst(52);
//        //list.traverse();
//        list.addAtIndex(1,90);
//        //list.traverse();
//        //list.deleteAtIndex(7);
//       // System.out.println(list.size);
//        list.traverse(list.head);
//        var a = clone(list.head);
//        while(list.head != null){
//            list.deleteFirst();
//        }
//        System.out.println("lkfjflajf");
//        list.traverse(list.head);
//        System.out.println("traajdfjaklfjalf");
//        list.traverse(a);
//        //list.reverseR();
//        //list.traverse(list.reverseR());
        LinkedListCustom list1 = new LinkedListCustom();
        LinkedListCustom list2 = new LinkedListCustom();
        for (int i = 20; i > 0; i--){
            list1.addFirst(i*2);
        }
        System.out.println("List 1");
        list1.traverse(list1.head);
        for (int i = 20; i > 0; i--){
            list2.addFirst(i*3);
        }
        System.out.println("List 2");
        list1.traverse(list2.head);
        var a = merge(list1.head,list2.head);
        list2.traverse(a);
   }
}