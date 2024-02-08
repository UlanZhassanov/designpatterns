package builder;

public class Director {
    public void createBoxingFighter(FighterBuilder fighterBuilder) {
        fighterBuilder.setPunch(true);
        fighterBuilder.setKick(false);
        fighterBuilder.setWrest(false);
    }

    public void createMMAFighter(FighterBuilder fighterBuilder) {
        fighterBuilder.setPunch(true);
        fighterBuilder.setKick(true);
        fighterBuilder.setWrest(true);
    }

    public void createThaiBoxingFighter(FighterBuilder fighterBuilder) {
        fighterBuilder.setPunch(true);
        fighterBuilder.setKick(true);
        fighterBuilder.setWrest(false);
    }
}
