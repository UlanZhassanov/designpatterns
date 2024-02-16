package structural.facade;

public class MatchDay {
    Team team1 = new Team("AC Milan");
    Team team2 = new Team("Inter Milan");
    Visitor visitor = new Visitor();
    FootballMatch footballMatch = new FootballMatch();

    public void createMatchDay(){
        System.out.println("Ladies and gentlemen, it's match day!");
        visitor.visitFootballGame();

        team1.chooseLineUp();
        team2.chooseLineUp();

        team1.warmUpBeforeMatch();
        team2.warmUpBeforeMatch();

        footballMatch.playMatch(team1,team2);
    }

}
