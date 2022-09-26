package Recursion;

import java.util.ArrayList;

public class BoardPath {

    public static ArrayList<String> bordPath(int current, int num){

        if(current > num)
            return new ArrayList<String>();
        if (current == num) {
            ArrayList<String> list = new ArrayList<>();
            list.add("\n");
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i = 1; i<= num; i++) {
            ArrayList<String> recAns = bordPath(current + i, num);
            for (String s : recAns)
                result.add(i + s);
        }
        return result;
    }

    public static void printBoardPath(int destination, int startPoint ,String path){
        if(startPoint == destination) {
            System.out.println(path);
            return;
        }
        else if(startPoint > destination)
            return;
        count++;
        for(int i = 1; i<= 6; i++){
            printBoardPath(destination,startPoint+i, path+i+", ");
        }

    }

    public static void printBoardPathDp(int destination, int startPoint ,String path, String[] dp){
        if(startPoint == destination) {
            System.out.println(path);
            return;
        }
        else if(startPoint > destination)
            return;
        if(!(dp[startPoint] == null)){
            System.out.println(dp[startPoint]);
            return;
        }
        count++;
        for(int i = 1; i<= 6; i++){
            printBoardPathDp(destination,startPoint+i, path+i+", ",dp);
            dp[startPoint] = path+i+", ";
        }

    }


static int count = 0;
    public static void main(String[] args) {

        printBoardPathDp(100,0,"",new String[106]);
        //printBoardPath(100,0,"");
        System.out.println(count);
    }
}
