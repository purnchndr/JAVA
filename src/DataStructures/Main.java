package DataStructures;

import DataStructures.StackCustom;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackCustom s = new StackCustom(100);
//
//        s.push(10);
//        s.push(100);
//
//        s.push(4);
//        s.push(400);
//        s.push(3);
//
//        s.push(20);
//        s.push(10);
//        s.push(3);
//        s.push(1);
//
//
//
//        s.print();
//        s.sort();
//        s.print();
//        System.out.println(s.count);

//       String st = "((a/b))";
//        System.out.println(findRedundantBrackets(st));
        Queue<Integer> a = new LinkedList<>();




    }
    public static boolean findRedundantBrackets(String s)
    {
        char[] arr= s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == '(' || arr[i] == ')' ||  isSymble(arr[i]))
                stack.push(arr[i]);

        }
        char pre = ' ';
        while(!stack.empty()){
            char temp = stack.pop();
            if(temp == '(' && pre == ')')
                return true;
            if(temp == '(' && pre == '(')
                return true;
            pre = temp;
        }
        return false;
    }
    public static boolean isSymble(char c){
        return (c == '-' || c == '*' || c == '/' || c == '+');
    }
}
