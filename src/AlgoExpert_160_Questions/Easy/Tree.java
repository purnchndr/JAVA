package AlgoExpert_160_Questions.Easy;

public class Tree {
    int value;
    Tree right;
    Tree left;
    public Tree(int value){
        this.value = value;
    }
    public Tree(){
    }
    public static Tree constructTree(){
        Tree root  = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.left.left= new Tree(8);
        root.left.left.right= new Tree(9);
        root.left.right= new Tree(5);
        root.left.right.right= new Tree(10);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        return root;
    }
}
