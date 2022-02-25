package AlgoExpert_160_Questions.Easy;

import java.util.ArrayList;

public class TreeBranchSum {
    public static void getAllSum(Tree root){
        ArrayList<Integer> list = new ArrayList<>();
        Tree node  = root;
        int sum = 0;
        getAllSumM(node, list, sum);
        System.out.println(list);
    }
    public static void getAllSumM(Tree node,ArrayList<Integer> list,int sum){

        if(node == null)
            return;
        sum += node.value;
        if(node.right == null && node.left == null)
            list.add(sum);
        getAllSumM(node.left,list,sum);
        getAllSumM(node.right,list,sum);

    }

    public static void main(String[] args) {
       Tree root  = Tree.constructTree();

    getAllSum(root);



    }
}
