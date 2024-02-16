package structural.facade;

public class Team {
    String teamname;

    public Team(String teamname) {
        this.teamname = teamname;
    }

    public void chooseLineUp(){
        System.out.println("Team chooses lineup...");
    }

    public void warmUpBeforeMatch(){
        System.out.println("Teams warming up before the game...");
    }
}
