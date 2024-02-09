package creational.abstractFactory.boxing;

import creational.abstractFactory.Uniform;

public class BoxingUniform implements Uniform {
    @Override
    public void isFor() {
        System.out.println("Для бокса, состоит из майки и трусов");
    }
}
