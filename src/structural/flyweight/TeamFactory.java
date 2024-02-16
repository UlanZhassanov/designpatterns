package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeamFactory {
    private static final Map<String, FootballTeam> footballTeams = new HashMap<>();

    public FootballTeam getFootballTeam(String name, String city){
        FootballTeam footballTeam = footballTeams.get(name);

        if (footballTeam == null){
            System.out.println("Creating football team...");
            footballTeam = new FootballTeam(name, city);

            footballTeams.put(name, footballTeam);
        }
        return footballTeam;
    }
}
