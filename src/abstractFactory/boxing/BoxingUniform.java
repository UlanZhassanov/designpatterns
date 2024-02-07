package abstractFactory.boxing;

import abstractFactory.Uniform;

public class BoxingUniform implements Uniform {
    @Override
    public void isFor() {
        System.out.println("Для бокса, состоит из майки и трусов");
    }
}
