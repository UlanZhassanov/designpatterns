package structural.facade;

public class FootballMatch {
    public void playMatch(Team team1, Team team2){
        System.out.println("\""+team1.teamname + "\" playing against \""+ team2.teamname+"\"");
    }
}
