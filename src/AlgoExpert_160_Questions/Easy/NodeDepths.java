package AlgoExpert_160_Questions.Easy;

import java.util.HashMap;
import java.util.Stack;

public class NodeDepths {
    public static int getDepths(Tree node){
        return getDepths(node,0);
    }
    public static int getDepths(Tree node,int depth){
        if (node ==null) return 0;
        int sum = depth
                + getDepths(node.left, depth+1)
                +getDepths(node.right, depth+1);
        return sum;
    }
    class Pair{
        int d;
        Tree n;
        public Pair(int data,Tree node){
            d = data;
            n = node;
        }
    }
    public int getDepthsI(Tree node){
        Stack<Pair> stack = new Stack<>();
        int depths = 0;
        stack.push(new Pair(0,node));
        while(!stack.isEmpty()){
            Pair a = stack.pop();
            if(a.n == null)
                continue;
            depths += a.d;
            if(a.n == null)
                continue;
            stack.push(new Pair(a.d+1,a.n.left));
            stack.push(new Pair(a.d+1,a.n.right));

        }
        return depths;
    }

    public static void main(String[] args) {
        Tree root  = Tree.constructTree();
        NodeDepths d = new NodeDepths();
        System.out.println(d.getDepthsI(root));
        System.out.println(getDepths(root));
    }
}
