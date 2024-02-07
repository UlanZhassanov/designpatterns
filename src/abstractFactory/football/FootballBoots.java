package abstractFactory.football;

import abstractFactory.Boots;

public class FootballBoots implements Boots {
    @Override
    public void isFor() {
        System.out.println("Для футбола, имеет шипы");
    }
}
