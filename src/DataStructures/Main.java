package DataStructures;

import DataStructures.StackCustom;

import java.util.*;

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
        Queue<Integer> a = new ArrayDeque<>();
        /// find 3rd largerst element of array k = 3
        int k = 4;
        Integer[] arr = new Integer[]{1,2,3,4,100,300,200,50};
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        q.addAll(Arrays.asList(arr).subList(0, k));
        for (int i = k; i < arr.length; i++){
            if(q.peek() < arr[i]){
                q.poll();
                q.add(arr[i]);
            }
        }
        System.out.println(q.peek());




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
