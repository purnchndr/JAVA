package DataStructures;

public class Main {

    public boolean isReachable(int targetX, int targetY) {
        int [][] dp = new int[targetX+1][targetY+1];
        return isReachableH(targetX, targetY, 1,1, dp);
    }

    public boolean isReachableH(int targetX, int targetY, int x, int y, int [][] dp) {

        //System.out.println("x is : "+ x +" & Y is : "+y);
        if(x > targetX || y > targetY || x < 1 || y < 1)
            return false;
        if(dp[x][y] == 1)
            return false;
        if(x == targetX && y == targetY) {
//            dp[x][y] = 0;
            return true;
        }
        if(isReachableH(targetX, targetY, x, y-x, dp))
            return true;
        if(isReachableH(targetX, targetY, x-y, y,dp))
            return true;
        if(isReachableH(targetX, targetY, 2*x, y, dp))
            return true;
        if(isReachableH(targetX, targetY, x, 2*y, dp))
            return true;
        dp[x][y] = 1;
        return false;
    }
    public static void main(String[] args) {
    //LinkedListGen<String> list = new LinkedListGen<>();
        Main m = new Main();
        System.out.println(m.isReachable(1,3));


    }

}
