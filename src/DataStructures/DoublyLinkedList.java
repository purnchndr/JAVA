package DataStructures;
class DNode{
    int data;
    DNode next = null;
    DNode pre = null;
    public DNode(int data){
        this.data = data;
    }
}
public class DoublyLinkedList {
    int size = 0;
    DNode head = null;
    DNode tail = null;

    public void add(int data){
        if(head.next == null){
            this.tail = this.head = new DNode(data);
        }
        DNode node = head;
        while(node.next != null)
            node = node.next;
        //node;
    }

}
