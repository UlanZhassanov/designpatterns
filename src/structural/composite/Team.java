package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<FutsalPlayer> futsalPlayers = new ArrayList<>();

    public void addFootballer(FutsalPlayer futsalPlayer){
        futsalPlayers.add(futsalPlayer);
    }

    public void removeFootballer(FutsalPlayer futsalPlayer){
        futsalPlayers.remove(futsalPlayer);
    }

    public void lineUpForGame(){
        System.out.println("Creating lineup for game:");
        for (FutsalPlayer futsalPlayer : futsalPlayers){
            futsalPlayer.plays();
        }
    }
}
