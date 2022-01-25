package AlgoExpert_160_Questions.Easy;

import java.sql.ResultSet;
import java.util.HashMap;

public class TournamentWinner {
    public static String findWinner(String[][] matches, int[] winners){
        HashMap<String,Integer> wins = new HashMap<>();
        String winnerTeam="";
        wins.put("highScore",0);
        for(int i = 0; i< winners.length;i++){
            int index = (winners[i]+1)%2;
            String team = matches[i][index];
            if(wins.containsKey(team)){
                int count = wins.get(team);
                wins.replace(team,count,count+1);
            }
            else wins.put(team,1);
            if(wins.get("highScore")<wins.get(team)){
                winnerTeam = team;
                wins.replace("highScore",wins.get("highScore"),wins.get(team));
            }
        }

        return winnerTeam;
    }

    public static void main(String[] args) {
        String[][] matches = {{"java","python"},{"cpp","java"},{"java","cpp"}};
        int[] score = {0,1,1};
        System.out.println(findWinner(matches,score));
    }
}
