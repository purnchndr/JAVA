package Recursion;

import java.util.ArrayList;

public class GetBoardPath {
    public static ArrayList<String> getAllPath(int start, int end){
        if(start == end){
            ArrayList<String> res = new ArrayList<>();
            res.add("\n");
            return res;
        }
        if(start > end) return new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(int dice = 1; dice <= 6; dice++){
            ArrayList<String> rr = getAllPath(start+dice, end);
            for(String s : rr) result.add(dice+s);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getAllPath(0,10));
    }
}
