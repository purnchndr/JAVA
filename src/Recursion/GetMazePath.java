package Recursion;

import java.util.ArrayList;

public class GetMazePath {
    public static ArrayList<String> getPath(int size, int row, int col){
        if(size == row && size == col){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        if(size < row || size < col)
            return new ArrayList<>();

        ArrayList<String> result = new  ArrayList<>();
            var ans = getPath(size,  row,  col+1);
            for(String s : ans)
               result.add("H" + s);
            var ans2= getPath(size,  row+1,  col);
            for(String s : ans2)
                result.add("V" + s);

        return result;
    }

    public static ArrayList<String> getPathDiagonal(int size, int row, int col){
        if(size == row && size == col){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        if(size < row || size < col)
            return new ArrayList<>();

        ArrayList<String> result = new  ArrayList<>();
        var ans = getPathDiagonal(size,  row,  col+1);
        for(String s : ans)
            result.add("H" + s);
        var ans3 = getPathDiagonal(size,  row+1,  col+1);
        for(String s : ans3)
            result.add("D" + s);
        var ans2= getPathDiagonal(size,  row+1,  col);
        for(String s : ans2)
            result.add("V" + s);

        return result;
    }


    public static void printMazePath(int row, int col, int destination, String res){
        if(row == destination && col == destination) {
            System.out.println(res);
            return;
        }
        else if(row > destination || col > destination){
            return;
        }

            printMazePath(row, col+1, destination, res+"_H_");
            printMazePath(row+1, col, destination, res+"_V_");

    }

    public static void printMazePathDig(int row, int col, int destination, String res){
        if(row == destination && col == destination) {
            System.out.println(res);
            return;
        }
        else if(row > destination || col > destination){
            return;
        }

        printMazePathDig(row, col+1, destination, res+"_H_");
        printMazePathDig(row+1, col+1, destination, res+"_D_");
        printMazePathDig(row+1, col, destination, res+"_V_");

    }

    public static void main(String[] args) {
       printMazePathDig(1,1,3,"");
    }

}
