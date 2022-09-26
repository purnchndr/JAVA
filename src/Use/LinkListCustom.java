package Use;

public class LinkListCustom {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    int size = 0;
    Node front = null;
    Node back  = null;

    public void addLast(int data){
        if(front == null)
            front = back = new Node(data);
        else
            back.next = new Node(data);
        size++;
    }

    public void addFront(int data){
        if(front ==  null)
            front = back = new Node(data);
        else{
            Node temp = new Node(data);
            temp.next = front;
            front = temp;
        }
        size++;
    }

    public void removeFront(){
        if(front == null)
            return;
        else
            front = front.next;
        size--;
    }

    public int size(){
        return this.size;
    }

    public void removeLast(){
        if(front == null)
            return;
        if(front.next == null){
            front = null;
            size--;
            return;
        }
        Node temp = front;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        size--;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node temp = front;

        while(temp != null){
            if(temp.next == null)
                str.append(temp.data);
            else
                str.append(temp.data).append(", ");
            temp = temp.next;
        }
        str.append("]");
        return str.toString();
    }

    public void removeLastR(){
        if(front == null)
            return;
        if(front.next == null) {
            front = null;
            return;
        }
        removeLastRH(front);
    }
    public void removeLastRH(Node node){
        if (node.next.next == null) {
            node.next = null;
            return;
        }
        removeLastRH(node.next);

    }

    public static void main(String[] args) {
        LinkListCustom list = new LinkListCustom();
        list.addFront(70);
        list.addFront(60);
        list.addFront(760);
        list.addFront(700);
        list.addLast(800);
        System.out.println(list);
//        list.removeLast();
//        list.removeFront();
        System.out.println(list.size());
        System.out.println(list);
        list.removeLastR();
        System.out.println(list.size());
        System.out.println(list);
    }

}
