package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightProgram {
    public static void main(String[] args) {
        TeamFactory teamFactory = new TeamFactory();

        List<FootballTeam> footballTeams = new ArrayList<>();

        footballTeams.add(teamFactory.getFootballTeam("AC Milan", "Milan"));
        footballTeams.add(teamFactory.getFootballTeam("Real", "Madrid"));
        footballTeams.add(teamFactory.getFootballTeam("Chelsea", "London"));
        footballTeams.add(teamFactory.getFootballTeam("PSG", "Paris"));
        footballTeams.add(teamFactory.getFootballTeam("PSG", "Paris"));

        for (FootballTeam footballTeam: footballTeams){
            footballTeam.getTeam("UEFA Champions League");
        }
    }
}
