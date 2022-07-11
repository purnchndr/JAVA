package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
     int data;
     TreeNode left = null;
     TreeNode right = null;

     TreeNode(int data){
         this.data= data;
     }
}
public class BinaryTree {
    private int data;
    private TreeNode left;
    private TreeNode right;
    TreeNode root;
    Scanner s = new Scanner(System.in);

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
        preOrderTraversalH(root);
    }
    public static void preOrderTraversalH(TreeNode node){

        if(node == null)
            return;
        System.out.println(node.data);
        preOrderTraversalH(node.left);
        preOrderTraversalH(node.right);
    }

    public void inOrderTraversal(){
        inOrderTraversalH(root);
    }
    public static void inOrderTraversalH(TreeNode node){
        if (node == null)
            return;
        inOrderTraversalH(node.left);
        System.out.println(node.data);
        inOrderTraversalH(node.right);
    }

    public void postOrderTraversal(){
        postOrderTraversalH(root);
    }
    public void postOrderTraversalH(TreeNode node){
        if (node == null)
            return;
        postOrderTraversalH(node.left);
        postOrderTraversalH(node.right);
        System.out.println(node.data);
    }

    public void levelOrderTraversal(){
        TreeNode node = root;
        if (node == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            node = q.poll();
            if (node == null){
                q.add(null);
                continue;
            }
            System.out.print(node.data+"  ");
            if(node.left != null)
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);

        }

    }

    public int heightH(TreeNode node){
        if (node == null)
            return 0;
        int left = heightH(node.left)+1;
        int right = heightH(node.right)+1;
        return Math.max(left,right) ;
    }
    public int height(){
        return heightH(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree();
       // tree.postOrderTraversal();
        System.out.println(tree.height());
        //10 20 40 -1 -1 50 60 -1  -1 -1 30 -1 70 -1 -1
    }

}
