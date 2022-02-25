package AlgoExpert_160_Questions.Medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BST {
    static int nodeCount = 0;
    BSTNode root;

    class BSTNode{
        int data;
        BSTNode leftChild;
        BSTNode rightChild;
        public BSTNode(int data){
            this.data = data;
        }
    }

    public void add(int data){
        BSTNode newNode = new BSTNode(data);
        if(root == null) {
            root = newNode;
        }
        var root = this.root;
        while(true){
            if(data >= root.data){
                if(root.rightChild == null) {
                    root.rightChild = newNode;
                    break;
                }

               else  root = root.rightChild;
            }
            else if(data < root.data){
                if(root.leftChild == null) {
                    root.leftChild = newNode;
                    break;
                }
                else root = root.leftChild;
            }
        }
        nodeCount++;
    }

    public boolean find(int data){
        var root = this.root;
        while(root != null){
           if(root.data == data) return true;
           else if(root.data > data) root= root.leftChild;
           else root = root.rightChild;
        }
        return false;
    }

    public void print(){
        if(root == null) return;
        Queue<BSTNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            BSTNode temp = q.remove();
            System.out.print(temp.data+ "==>");
            if(temp.leftChild != null){
                System.out.print("L: "+temp.leftChild.data);
                q.add(temp.leftChild);
            }
            if(temp.rightChild != null){
                System.out.print("R: "+temp.rightChild.data);
                q.add(temp.rightChild);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(10);
        tree.add(9);
        System.out.println(nodeCount);
        tree.add(7);
//        tree.add(4);
//        tree.add(14);
//       // tree.add(11);
//        tree.add(11);
        System.out.println(nodeCount);

        tree.print();
        System.out.println(  tree.find(7));

    }
}
