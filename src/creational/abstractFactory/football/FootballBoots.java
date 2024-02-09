package creational.abstractFactory.football;

import creational.abstractFactory.Boots;

public class FootballBoots implements Boots {
    @Override
    public void isFor() {
        System.out.println("Для футбола, имеет шипы");
    }
}
