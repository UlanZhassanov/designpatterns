package builder;

public class CreateFighters {
    public static void main(String[] args) {
        Director director = new Director();

        FighterBuilder fighterBuilder = new FighterBuilder();
        director.createBoxingFighter(fighterBuilder);

        Fighter boxer = fighterBuilder.getFighter();
        System.out.println("Boxer can punch?: " +  boxer.isPunch());
        System.out.println("Boxer can kick?: " +  boxer.isKick());

        System.out.println();


        director.createMMAFighter(fighterBuilder);
        Fighter mmaFighter = fighterBuilder.getFighter();
        System.out.println("MMA fighter can kick?: " +  mmaFighter.isKick());
        System.out.println("MMA fighter can punch?: " +  mmaFighter.isPunch());


        System.out.println();

        fighterBuilder.setWrest(true);
        fighterBuilder.setPunch(false);
        fighterBuilder.setKick(false);
        Fighter wrestler = fighterBuilder.getFighter();

        System.out.println("Wrestler fighter can kick?: " +  wrestler.isKick());
        System.out.println("Wrestler fighter can punch?: " +  wrestler.isPunch());
        System.out.println("Wrestler fighter can wrest?: " +  wrestler.isWrest());


    }
}
