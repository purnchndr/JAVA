package DataStructures;

public class DoublyLinkedList<T> {
    private static class Node<T>{
        T val;
        Node<T> next = null;
        Node<T> prev = null;
        public Node(T value){
            this.val = value;
        }
    }
    int size = 0;
    Node<T> head = null;
    Node<T> tail = null;

    public void addFirst(T data){
        Node<T> node = new Node<>(data);
        if(head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void addLast(T data){
        Node<T> node = new Node<>(data);
        if(head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(T data){
        this.addLast(data);
    }


    public boolean deleteFirst(){
        if(head == null)
            return false;
        if(head.next == null){
            head = tail = null;
            size--;
            return true;
        }
        Node<T> tempNode = head.next;
        head.next = null;
        tempNode.prev = null;
        head = tempNode;
        size--;
        return true;
    }

    public boolean deleteLast(){
        if(tail == null)
            return false;
        if(head.next == null){
            head = tail = null;
            size--;
            return true;
        }
        Node<T> tempNode = tail.prev;
        tail.prev = null;
        tempNode.next = null;
        tail = tempNode;
        size--;
        return true;
    }

    public boolean deleteAt(int index){
        if(index >= size || index < 0)
            return false;
        Node<T> temp = head;
        while(temp != null && index != 0){
            temp = temp.next;
            index--;
        }
        if(temp == head)
            return deleteFirst();
        else if(temp == tail)
            return deleteLast();
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;
        size--;
        return true;
    }

    public void traverse(){
        Node<T> node = head;
        while(node != null){
            System.out.print(node.val+", ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(60);
        list.traverse();
        System.out.println(list.deleteAt(0));
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteLast());
        list.traverse();
    }

}
