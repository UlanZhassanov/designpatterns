package structural.composite;

public class LineUp {
    public static void main(String[] args) {
        Team team = new Team();

        FutsalPlayer futsalPlayer1 = new Goalkeeper();
        FutsalPlayer futsalPlayer2 = new Defender();
        FutsalPlayer futsalPlayer3 = new Defender();
        FutsalPlayer futsalPlayer4 = new Attacker();
        FutsalPlayer futsalPlayer5 = new Attacker();

        team.addFootballer(futsalPlayer1);
        team.addFootballer(futsalPlayer2);
        team.addFootballer(futsalPlayer3);
        team.addFootballer(futsalPlayer4);
        team.addFootballer(futsalPlayer5);

        team.lineUpForGame();
    }
}
