package creational.abstractFactory.boxing;

import creational.abstractFactory.Boots;

public class BoxingBoots implements Boots {
    @Override
    public void isFor() {
        System.out.println("Для бокса, не имеет шипов");
    }
}
