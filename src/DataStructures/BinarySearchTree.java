package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BSTNode{
    int data;
    BSTNode left ;
    BSTNode right;
    public BSTNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {
    BSTNode root = null;
    int size = 0;
    public void insert(int data) {
        BSTNode node = new BSTNode(data) ;
        BSTNode temp = root;
        if (temp == null)
            root = node;
        else {
            while (true) {
                if (data < temp.data){
                    if(temp.left == null){
                        temp.left = new BSTNode(data);
                        return;
                    }
                    temp = temp.left;
                }
                else {
                    if(temp.right == null){
                        temp.right = new BSTNode(data);
                        return;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    public BSTNode insertR(int data, BSTNode node) {
        if (node == null) {
            node = new BSTNode(data);
            return node;
        }
        if (data < node.data)
            node.left = insertR(data,node.left);
        else
            node.right = insertR( data, node.right);
        return node;

    }
    public void insertR(int data) {
        var node = this.root;
        insertR(data,node);
    }



    public void print(){
        if (root == null)
            return;
        var node = root;
        Queue<BSTNode> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        while (!q.isEmpty()){
            var i = q.poll();
            if(i == null) {
                System.out.println("------------------------------");
                continue;
            }
            System.out.print(i.data+", ");
            if(i.left != null)
                q.add(i.left);
            if(i.right != null)
                q.add(i.right);
            q.add(null);
        }
    }

    public void takeInput(){
        Scanner s = new Scanner(System.in);
        while(true){
            int data = s.nextInt();
            if(data == -1)
                break;
         insert(data);
        }
        print();
    }
    public BSTNode searchBSTH(BSTNode root, int val) {
        if(root == null) return null;
        BSTNode ans = root;
        if(root.data > val)  ans = searchBSTH(root.left, val);
        else if(root.data < val) ans =searchBSTH(root.right, val);
        return ans;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(90);
//        tree.insert(200);
//
//        tree.insert(50);
//        tree.insert(1);
//
//        tree.insert(10);
//        tree.insert(1000);
//        tree.insert(105);
//        tree.root = new BSTNode(10);
//        tree.root.left = new BSTNode(20);
//        tree.root.right = new BSTNode(30);
//        tree.insert(50);
//        tree.insertR(100);
////       // var a = tree.searchBSTH(tree.root, 30);
////        System.out.println();
//
////        var node  = tree.root;
//        tree.print();
        tree.takeInput();
//        System.out.println(node.data);
//        System.out.println(node.right.data);
//        node = new BSTNode(100);
//        System.out.println(node.data);
//        tree.print();


    }
}
