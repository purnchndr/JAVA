package DataStructures;

import javax.print.DocFlavor;
import java.time.temporal.Temporal;
import java.util.*;
public class BinaryTree {
    private static class TreeNode{
        int data;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int data){
            this.data= data;
        }
        @Override
        public String toString(){
            return String.valueOf(this.data);
        }
    }

    private int data;
    private TreeNode left;
    private TreeNode right;
    TreeNode root;
    Scanner s = new Scanner(System.in);

    public boolean isEmpty(){
        return root == null;
    }

    public void addElement(int item){
        TreeNode node =  new TreeNode(item);
        if(root == null) { root = node; return;
        }
        TreeNode head = root;
        while(true){
            if(head.data <= item) {
                if (head.right == null) {  head.right = node;  break;
                }
                head = head.right;
            }
            else{
                if (head.left == null) {  head.left = node;  break;
                }
                head = head.left;
            }
        }
    }



    public boolean findElement(int item){
        TreeNode head = root;
        while(head != null){
            if(head.data == item) return true;
            head = head.data > item ? head.left : head.right;
        }
        return false;
    }

    public TreeNode createTreeHelper(){
        System.out.println("Enter data");
        int data = s.nextInt();
        if(data == -1)
            return null;
        TreeNode node = new TreeNode(data);
        System.out.println("Enter data od left "+ data);
        node.left = createTreeHelper();
        System.out.println("Enter data od right "+ data);
        node.right = createTreeHelper();
        return node;
    }


    public void createTree(){
        this.root = createTreeHelper();
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    private static void preOrderTraversal(TreeNode node){
        if(node == null)  return;
        System.out.println(node);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private static void inOrderTraversal(TreeNode node){
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node);
        inOrderTraversal(node.right);
    }

    public void inOrderTraversalReverse(){
        inOrderTraversalReverse(root);
    }
    private static void inOrderTraversalReverse(TreeNode node){
        if (node == null)  return;
        inOrderTraversalReverse(node.right);
        System.out.println(node);
        inOrderTraversalReverse(node.left);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(TreeNode node){
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node);
    }

    public void levelOrderTraversal(){
       if(isEmpty()) return;
       TreeNode head = root;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(head);
       while (!queue.isEmpty()){
           TreeNode current = queue.poll();
           System.out.print(" "+current+" ");
           if(current.left != null)
               queue.add(current.left);
           if(current.right != null)
               queue.add(current.right);
       }
    }

    private int height(TreeNode node){
        if (node == null) return -1;
        int left = height(node.left)+1;
        int right = height(node.right)+1;
        return Math.max(left,right);
    }
    public int height(){
        return height(root);
    }

    public int getMin(){
        return getMin(root);
    }

    private int getMin(TreeNode node){
        if(node == null)
            return Integer.MAX_VALUE;
        int left = getMin(node.left);
        int right = getMin(node.right);
        return Math.min(node.data,Math.min(left,right));
    }

    public int getMax(){
        return getMax(root);
    }

    private int getMax(TreeNode node){
        if(node == null)
            return Integer.MIN_VALUE;
        int left = getMax(node.left);
        int right = getMax(node.right);
        return Math.max(node.data,Math.max(left,right));
    }

    public void printKthNode(int k){
        printKthNode( root,  k);
    }
    private void printKthNode(TreeNode node, int k){
        if(root == null)
            return;
        if(k ==  0){
            System.out.println(node);
            return;
        }
        printKthNode(node.left,k-1);
        printKthNode(node.right,k-1);
    }

    public int getSize(){
         return  getSize(root);
    }
    private int getSize(TreeNode node){
        if (node == null) return 0;
        int left = getSize(node.left);
        int right = getSize(node.right);
        return left+right+1;
    }

    public void compareTree(BinaryTree tree){
        compareTree(root, tree.root);
    }

    private boolean compareTree(TreeNode root, TreeNode root1) {
        if(root == null && root1 == null)
            return true;
        return true;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addElement(90);
        tree.addElement(100);
        tree.addElement(80);
        tree.addElement(65);
        tree.addElement(85);
        tree.addElement(95);
        tree.addElement(105);
        tree.addElement(1059);
        System.out.println(tree.height());
//        System.out.println(tree.getMin());
        System.out.println(tree.getSize());
        //tree.printKthNode(2);

    }

}
