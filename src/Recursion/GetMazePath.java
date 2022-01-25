package Recursion;

import java.util.ArrayList;

public class GetMazePath {
    public static ArrayList<String> getPath(int h,int v, int target){
        if (h> target || v> target) return new ArrayList<>();
        if(target == h && target == v);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> vm = getPath(h,v+1,target);
        for(String s: vm) result.add("V"+s);
        ArrayList<String> hm = getPath(h+1,v,target);
        for(String s: hm) result.add("H"+s);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPath(3,3,3));
    }

}
